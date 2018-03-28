package tp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

//source : Apache Commons Collections 4.1 JAR
import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Heuristics 
{
	private GraphCompet graph;
	
	private int dimension;
	
	private double[][] distance;
	
	private  static int hybridCall = 0;
	
	public Heuristics(GraphCompet graph)
	{
		this.graph = graph;
		this.dimension = graph.getGraph().size();
		this.distance = new double[this.dimension][this.dimension]; 
		for(int i = 0; i < this.dimension; i++ )
		{
			for(int j = 0; j < this.dimension; j++)
			{
				if( j > i)
					this.distance[i][j] = graph.getGraph().get(i+1).getVoisinage().get(j-i-1).getCout();
			}
		}
		for(int i = 0; i < this.dimension; i++ )
		{
			for(int j = 0; j < this.dimension; j++)
			{
				if( j < i)
					this.distance[i][j] = distance[j][i];
			}
		}
		
		
	}
	
	public Solution descendante(Solution sol)
	{
		double objF = this.evaluete(sol);
		
		double min = 101; 
		int key  = this.findMinCostNeignbour(sol);
		/*int counter = 0;
		for(Solution s : sol.getVoisins())
			{
			if (this.evaluete(s) < min)
		       {
				min = this.evaluete(s);
			    key = counter;
		       }
			counter++;
			}*/
		if(this.evaluete(sol.getVoisins().get(key)) < objF ) {sol = sol.getVoisins().get(key);return this.descendante(sol);}
		else return sol;
	}
public Solution recuitSimule(Solution so)
{
	double temperature = 10000;
	Solution soV = so.getVoisins().get(0);
	double r = 0;
	while(temperature > 0 && r < Math.exp((this.evaluete(so) - this.evaluete(soV) ) / temperature))
	{
		so = soV;
		r = Math.random();
		soV = soV.getVoisins().get(0);
		temperature -= 100;
		
	}
	return so;
	
}
public Solution tabou(Solution sol)
{
	Queue<Solution> fifo = new CircularFifoQueue<Solution>(2);
	
	Solution tabouSolution = sol;

	int counter = 4;
	Solution sPrime;
	while(counter > 0)
	{
		sPrime = sol.getVoisins().get(this.findMinCostAllowedNeignbour(sol, fifo));
		if(this.evaluete(sPrime) < this.evaluete(tabouSolution))
			{
			tabouSolution = sPrime;counter = 4;
			}
		else counter--;
		fifo.add(sol);
		sol = sPrime;
		
		
		
		
	}
	return tabouSolution;
}
// n! factorielle solutions.
public Solution methodeGenetique(Solution solution )
{
	int taille = solution.getTaille();
	Map<Solution, Double> population = new HashMap<Solution, Double>();
	Random rand = new Random();
	
	// puisque la génération des voisins est aléatoire je me contente
	//de prendre les quatre voisins premiers
	
		for(int i = 0; i < 4; i++)
			population.put(solution.getVoisins().get(i), this.evaluete(solution.getVoisins().get(i)));
	//System.out.println(population);
	Solution solMin1 = new Solution(taille), solMin2 = new Solution(taille);
	
		
	    if( this.evaluete(solution.getVoisins().get(0))< this.evaluete(solution.getVoisins().get(1)))
	    {
	    	solMin1 = solution.getVoisins().get(0);
	    	solMin2 = solution.getVoisins().get(1);
	    }
	    else
	    {
	    	solMin1 = solution.getVoisins().get(1);
	    	solMin2 = solution.getVoisins().get(0);
	    }
	    Set<Solution> kset = population.keySet();
	    for(int k = 0; k < 10; k++)
		{
	    	for(Solution sol : kset)
	    	{
	    		if(population.get(sol) < this.evaluete(solMin1) )
	    		{
	    			solMin2 = solMin1;
	    			solMin1 = sol;
				
	    		}
	    		else if(population.get(sol) < this.evaluete(solMin2))
	    		{
	    			solMin2 = sol;
	    		}
	    	}
		//System.out.println(solMin1 + "\t\t\t" + solMin2 );
	    	int n = rand.nextInt(taille);
		//System.out.println(n);
	    	Solution tempSol1 = null, tempSo2 = null;
	    	try {
	    		tempSol1 = (Solution)solMin1.clone();
	    		tempSo2 = (Solution)solMin2.clone();
	    	} catch (CloneNotSupportedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	    	this.hybridation(solMin2, solMin1, n);
	    	this.hybridation(solMin1, tempSol1, n);
		//System.out.println(solMin1 + "\t\t\t" + solMin2 );
		//System.out.println(population);
	    	population.clear();
	    	population.put(solMin1, this.evaluete(solMin1));
	    	population.put(solMin2, this.evaluete(solMin2));
	    	population.put(tempSol1, this.evaluete(tempSol1));
	    	population.put(tempSo2, this.evaluete(tempSo2));
	    	kset = population.keySet();
	    	
		}
	
		
			return solMin1;
	
}
	public GraphCompet getGraph() {
		return graph;
	}

	public void setGraph(GraphCompet graph) {
		this.graph = graph;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public double[][] getDistance() {
		return distance;
	}

	public void setDistance(double[][] distance) {
		this.distance = distance;
	}
	
	public double evaluete(Solution solution )
	{
		int[] tableau = solution.getSolution();
		double somme = 0.0;
		for(int i = 0; i < tableau.length-1; i++)
		{
			somme += this.distance[tableau[i] - 1][tableau[i+1] - 1];
		}
		return somme;
	}
	private int findMinCostNeignbour(Solution sol)
	{
		double min = 101; 
		int key  = 0;
		int counter = 0;
		for(Solution s : sol.getVoisins())
			{
			if (this.evaluete(s) < min)
		       {
				min = this.evaluete(s);
			    key = counter;
		       }
			counter++;
			}
		return key;
	}
	private int findMinCostAllowedNeignbour(Solution s, Queue<Solution> queue)
	{
		List<Solution> allowedNeighbours;
		boolean exists = false;
		
		Solution MinSoloution = s.getVoisins().get(this.findMinCostNeignbour(s));
		
		int counter = 0;
		for(Solution sol : queue)
		{
			if(sol.equals(MinSoloution)) 
			{
				exists = true;
				break;
				
			
			}
			//counter++;
		}
		if(!exists) return this.findMinCostNeignbour(s);
		else
		{
			allowedNeighbours =  s.getVoisins();
			
			double min = 101; 
			int count = 0;
			int key = 0;
		
			for(Solution so : allowedNeighbours)
				{
				if (this.evaluete(so) < min && !so.equals(MinSoloution))
			       {
					min = this.evaluete(so);
					key = counter ;
			       }
				count++;
				}
			return key;
			
		}
	}
	private   void hybridation(Solution s1, Solution s2, int rang)
	{
		
		
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = rang + 1; i < s1.getTaille(); i++)
		{
			int x = s1.getSolution()[i];
			int j = 0;
			for(j = 0; j < s1.getTaille(); j++)
			{
				if(x == s2.getSolution()[j] ) break;
			}
			myList.add(j);
			
			
			
			
		}
		Collections.sort(myList);
		for(int i = rang + 1, k = 0; i < s1.getTaille() && k < myList.size(); i++, k++)
		{
			s1.getSolution()[i] = s2.getSolution()[myList.get(k)];
		}
		
	}
	

}
