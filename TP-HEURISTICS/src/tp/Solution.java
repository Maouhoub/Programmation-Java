package tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution implements Cloneable
{
	

	private int[] solution;
	private int taille;
	private List<Solution> voisins = new ArrayList<Solution>();
	public Solution()
	{
		
	}
	public Solution(int taille)
	{
		Random rand = new Random();
		this.taille = taille;
		
		this.solution = new int[taille];
		
		
		for(int i = 0; i < taille; i++)
		{
			int candidat;
			do {
				candidat  = rand.nextInt(taille) + 1;
			   }while(this.existInArray(this.solution, candidat));
				this.solution[i] = candidat;
		}
		this.voisins = this.generateAllNeighbours();
		
	}
	
	public int[] getSolution() {
		return solution;
	}

	public void setSolution(int[] solution) {
		this.solution = solution;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	

	public List<Solution> getVoisins() {
		return voisins;
	}

	public void setVoisins(List<Solution> voisins) {
		this.voisins = voisins;
	}

	private boolean existInArray(int[] array, int x)
	{
		for(int value : array)
			if (x == value) return true;
		return false;
	}
	
	private List<Solution> generateAllNeighbours()
	{  List<Solution> neighbours = new ArrayList<Solution>();
	//Solution[] tab = new Solution[(int)Math.pow(this.solution.length, 2)] ;
	int[] s = this.solution;
		for(int i = 0; i < this.solution.length; i++)
		{
			for(int j = i+1; j < this.solution.length; j++)
			{
				
				Solution so= new Solution();
				so.setTaille(this.taille);
				so.setSolution(this.permuteIndex(s, i, j));
				
				((ArrayList<Solution>)so.getVoisins()).add(so);
				//s.voisins = new HashMap<String, Solution>();
				//s.voisins.put(1, this);
				//System.out.println(so);
				so.getVoisins().add(this);
				neighbours.add(so);
				//tab[i+j] = so;
				//System.out.println(tab[i+j]);
				
				
			}
			
		}
	
	 
		return neighbours;	
	}
	
   private int[] permuteIndex(int[] array, int i, int j)
   {   int[] array2 = new int[array.length];
   for(int k = 0; k < array.length; k++)
   { array2[k] = array[k];}
	   int temporary = array2[i];
	   array2[i] = array2[j];
	   array2[j] = temporary;
	   return array2;
   }
   
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(solution);
	result = prime * result + taille;
	//result = prime * result + ((voisins == null) ? 0 : voisins.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Solution other = (Solution) obj;
	if (!Arrays.equals(solution, other.solution))
		return false;
	if (taille != other.taille)
		return false;
	if (voisins == null) {
		if (other.voisins != null)
			return false;
	} else if (!voisins.equals(other.voisins))
		return false;
	return true;
}

@Override
public String toString() 
{
	return  Arrays.toString(this.solution) +"\t" ;
}

public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}
