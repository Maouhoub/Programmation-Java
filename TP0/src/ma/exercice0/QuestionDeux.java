package ma.exercice0;


import java.util.Scanner;

/**
 * 
 * @author MUSTAPHA
 *afficher un triangle isocèle formé d'étoiles.
 */

public class QuestionDeux 
{
	/**
	 * champ statique : Objet Scanner pour lire l'entrée standard
	 */
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Entrez la hauteur du triangle");
		
		int h = input.nextInt();
		
		for(int i = 0; i < h; i++)
		{
			for(int j=0; j <= i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}
}
	

