package ma.exercice0;

import java.util.Scanner;

/**
 * @author MUSTAPHA
 * classe QuestionUn : calculer la somme des n premiers terms
 * d'une série harmonique.
 */
public class QuestionUn 
{   
	/**
	 * champ statique : Objet Scanner pour lire l'entrée standard
	 */
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		System.out.println("Entrez un nombre entier");
		int n = input.nextInt();
		double somme = 0.0;
		for(int i = 1; i <= n; i++)
		{
			somme += 1/(double)i;
		}
		
		System.out.println("la somme des "+n+" premiers terms de la serie harmonique vaut : "+somme);
	}

}


