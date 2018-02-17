package ma.exercice1;

import java.util.Scanner;

/**
* 
* @author MUSTAPHA
*classe MainClass : calcul de la somme de n nombres générés par Math.random() ainsi que leurs
*écart type
*/

public class MainClass 
{
	
	/**
	 * champ statique : Objet Scanner pour lire l'entrée standard
	 */
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		double somme = 0.0, sommeCarree = 0.0, variance = 0.0, ecartType = 0.0, moyenne = 0.0;
		
		System.out.println("Entrer le nombre de terms : ");
		int n = input.nextInt();
		
		double[] serie = new double[n]; 
		
		for(int i = 0; i < n; i++)
		{
			serie[i] = Math.random();
			somme += serie[i];
			sommeCarree += Math.pow(serie[i], 2);
		}
		
		moyenne = somme/n ;
		
		variance = sommeCarree/n + Math.pow(moyenne, 2) ;
		
	    ecartType = Math.sqrt(variance);
	    
	    System.out.println("la moyenne de "+n+" nombre genérés par Math.random() est : "+moyenne);
	    System.out.println("leurs écart type est "+ecartType);

	}

}
