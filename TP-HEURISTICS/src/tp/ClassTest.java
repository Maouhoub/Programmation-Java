package tp;

import java.util.Queue;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public class ClassTest {
	private static Solution sol = new Solution(4);
	private static Solution sol2 = new Solution(4);

	public static void main(String[] args) {
		GraphCompet graph = new GraphCompet(4);
		Heuristics hr = new Heuristics(graph);
		ClassTest.affichageMatrice(hr.getDistance());
		
		System.out.println(sol);
		System.out.println("cout\t" + hr.evaluete(sol));
		long t1 = System.currentTimeMillis();
		System.out.println("tabou\t" + hr.tabou(sol));
		long t2 = System.currentTimeMillis();
		
		long d1 = System.currentTimeMillis();
		System.out.println("desent\t" + hr.descendante(sol));
		long d2 = System.currentTimeMillis();
		long rs1 = System.currentTimeMillis();
		System.out.println("recuit simule\t" + hr.recuitSimule(sol));
		long rs2 = System.currentTimeMillis();
	long a = System.currentTimeMillis();
		System.out.println("genetic algorithme\t" + hr.methodeGenetique(sol));
		long b = System.currentTimeMillis();
		
		
		System.out.println("\n");
		System.out.println("cout tabout\t" + hr.evaluete(hr.tabou(sol)));
		
		System.out.println("durée en ms de l'algo tabou en ms : " + (t2 - t1));
		
		System.out.println("\n");
		System.out.println("cout desc\t" +hr.evaluete(hr.descendante(sol)));
		System.out.println("durée en ms de l'algo descente en ms : " + (d2 - d1));
		System.out.println("\n");
		//System.out.println(sol.getVoisins());*/
		System.out.println("cout recuit simulé\t" + hr.evaluete(hr.recuitSimule(sol)));
		System.out.println("durée en ms de l'algo génétique : " + (rs1 - rs2));
		System.out.println("\n");
		System.out.println("cout GA\t" + hr.evaluete(hr.methodeGenetique(sol)));
		System.out.println("durée en ms de l'algo génétique : " + (b - a));
		
		
		
		
		
		
		
		
		//System.out.println("hello");
	//ClassTest.affichageSolution(sol.getSolution());
		//System.out.println(sol.getVoisins());
		
		//int[] kernel = {1, 2, 3};
		
	//ClassTest.affichageSolution(sol.permuteIndex(kernel, 0, 1));
		
		
			
		
	
		

	}
	private static void affichageSolution(int[] array)
	{
		for(int x : array)
			System.out.print(x + " ");
	}
	private static void affichageMatrice(double[][] matrice)
	{
		for(int i = 0; i < matrice.length; i++)
		{
			for(int j = 0; j < matrice.length; j++)
			{
				System.out.print(matrice[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
	

}
