package jeunavale;

import java.util.Scanner;

/**
 * classe Joueur : représente un joueur
 * @author MUSTAPHA
 *
 */
public class Joueur 
{  
	/**
    *
    *champ privé nom : objet String représentant le nom du joueur
    */
	public String nom;
	/**
	 * 
	 */
	private Grille grille;
	
	/**
	 * champ private bateaux des joueurs
	 */
	private Bateau[] bateaux;
	
	/**
	 * constructeur par défaut
	 */
	public Joueur()
	{
		this.nom = null;
		this.grille = null;
		
	}
	
	/**
	 * constructeur surchargé
	 * @param nom : objet String qui représente le nom du Joueur
	 */
	public Joueur(String nom)
	{
		this.nom = nom;
		this.grille = new Grille();
	}

	/**
	 * récupérer l'objet Grille du joueur
	 * @return : objet Grille représentant la grille du joueur
	 */
	public Grille getGrille() {
		return grille;
	}
    /**
     * choisir le bateau, la position et l'orientation d'un bateau. 
     */
	public void placementBateau()
	{
		Scanner input = new Scanner(System.in);
		int n = -1;
		while( (n < 0) || (n >= this.bateaux.length) )
		{	
			System.out.println("Veuillez entrer l'indice du bateau!");
			//ici on peut faire une exception pour éviter pour capturer une exception éventuelle.
			n = input.nextInt();
		}
			Bateau bateau = this.bateaux[n];
			//utilisation de la méthode utilitaire ci dessous
			this.afficheChoixOrientation(bateau, input);
			//utilisation d'une autre méthode : 
			
			Case caseReference = bateau.getCases()[0];
		    System.out.println("entrer l'abscisse et l'ordonnée de la tete de votre bateau dans la grille");
		    int x = input.nextInt();
		    int y = input.nextInt();
		    Case[][] tempGrille = this.grille.getGrille();
		    tempGrille[x][y] = caseReference;
		    if(bateau.horizontal)
		    {
		    	if(bateau.getTaille() <= Math.min(y, 10 - y ))
		    	{
		    		//System.out.print("Choix soit à droite soit à gauche!");
		    		this.orieterManH(bateau, input, x, y);
		    		this.testMethod(bateau);
		    	}
		    	else
		    	{
		    		if(y == Math.min(y, 10-y))
		    		{
		    			this.placerAdroite(bateau, x, y);
		    			this.testMethod(bateau);
		    			//System.out.println("placer à droite");
		    		}
		    		else
		    		{	
		    			
		    			//System.out.println("placer à gauche");
		    			this.placerAgauche(bateau, x, y);
		    			this.testMethod(bateau);
		    			
		    		}
		    	}
		    	
		    }
		    else
		    {
		    	if(bateau.getTaille() <= Math.min(x, 10 - x ))
		    	{
		    		//System.out.print("Choix soit vers le haut/bas!");
		    		  this.orieterManV(bateau, input, x, y);
		    		  this.testMethod(bateau);
		    	}
		    	else
		    	{
		    		if(x == Math.min(x, 10-x))
		    		{
		    			this.placerVersBas(bateau, x, y);
		    			this.testMethod(bateau);
		    			//System.out.println("soit vers le bas!");
		    		}
		    		else
		    		{	
		    			
		    			//System.out.println("placer vers le haut");
		    			 this.placerVersHaut(bateau, x, y);
		    			 this.testMethod(bateau);
		    			
		    		}
		    	}
		    	
		    }
		    
			
			
			
			
		
		
	}

	/**
	 * récupérer le tableaux de bateaux 
	 * @return : tableau d'instances de Bateau
	 */
	public Bateau[] getBateaux() {
		return bateaux;
	}

	/**
	 * modifier le tableaux de bateaux 
	 * @param bateaux : tableau d'instances de Bateau
	 */
	public void setBateaux(Bateau[] bateaux) {
		this.bateaux = bateaux;
	}
	
	/**
	 * méthode utilitaire pour rendre le code lisible
	 * @param bateau : le bateau en question dans le context d'appel
	 * @param input : objet Scanner pour lire les entrées de l'utilisateur
	 */
	private void afficheChoixOrientation(Bateau bateau, Scanner input)
	{   
		System.out.println("Entrer 1 ou 2 pour orienter le bateau choisi :\n1 pour horizontale \n2 pour verticale");
		int choixOrientation = input.nextInt();
		
		if(choixOrientation == 1)
				bateau.horizontal = true;
		else if (choixOrientation == 2)
				bateau.horizontal = false;
		else this.afficheChoixOrientation(bateau, input);
	}
	
	private void orieterManH(Bateau bateau, Scanner input, int x, int y)
	{   
		System.out.println("Entrer 1 ou 2 pour orienter le bateau  :\n1 vers la gauche \n2 vers la droite");
		int choixOrientation = input.nextInt();
		
		if(choixOrientation == 1)
				this.placerAgauche(bateau, x, y);
		else if (choixOrientation == 2)
				this.placerAdroite(bateau, x, y);
		else this.afficheChoixOrientation(bateau, input);
	}
	
	private void orieterManV(Bateau bateau, Scanner input, int x, int y)
	{   
		System.out.println("Entrer 1 ou 2 pour orienter le bateau  :\n1 vers le bas \n2 vers le haut");
		int choixOrientation = input.nextInt();
		
		if(choixOrientation == 1)
				this.placerVersBas(bateau, x, y);
		else if (choixOrientation == 2)
				this.placerVersHaut(bateau, x, y);
		else this.afficheChoixOrientation(bateau, input);
		
	}
	
	
	
   private void placerAdroite(Bateau bateau, int x, int y)
   {
	   Case[][] grille = this.grille.getGrille();
	   int i = 0, j = y;
	   while(i < bateau.getTaille())
	   {
		   grille[x][j] = bateau.getCases()[i];
		   i++; j++;
	   }
	  
	   
   }
   
   private void placerVersBas(Bateau bateau, int x, int y)
   {
	   Case[][] grille = this.grille.getGrille();
	   int i = x, j = 0;
	   while(j < bateau.getTaille())
	   {
		   grille[i][y] = bateau.getCases()[j];
		   i++; j++;
	   }
	  
	   
   }
   
   private void placerAgauche(Bateau bateau, int x, int y)
   {
	   Case[][] grille = this.grille.getGrille();
	   int i = 0, j = y;
	   while(i < bateau.getTaille())
	   {
		   grille[x][j] = bateau.getCases()[i];
		   i++; j--;
	   }
	  
	   
   }
   
   private void placerVersHaut(Bateau bateau, int x, int y)
   {
	   Case[][] grille = this.grille.getGrille();
	   int i = x, j = 0;
	   while(j < bateau.getTaille())
	   {
		   grille[i][y] = bateau.getCases()[j];
		   i--; j++;
	   }
	  
	   
   }
   //méthode pour afficher le bateau, pour vérifier si on a bien construit la méthode emplacement du bateau.
   private void testMethod(Bateau bateau)
   {     Case[][] grille = this.grille.getGrille();
	   
			for(int i = 0; i < 10; i++)
			{
				for(int j = 0; j < 10; j++)
				{  Case b = grille[i][j];
					/* if(b.etat)
						{System.out.print("o ");
						 continue;}*/
				     if(b.getBateau() == bateau)
				     {
				    	 System.out.print("b ");
				     }
				     else
				     {
				    	 System.out.print("x ");
				     }
						
				}
				System.out.println();
			
		
			}
   }

}
