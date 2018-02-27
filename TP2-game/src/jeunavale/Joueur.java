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
			//ici on peut faire une exception pour s'assurer que l'entrée est entière
			n = input.nextInt();
		}
			Bateau bateau = this.bateaux[n];
			//utilisation de la méthode utilitaire ci dessous
			this.afficheChoixOrientation(bateau, input);
			//utilisation d'une autre méthode : 
			System.out.println("entrer l'indice de la case à positionner du tableau!");
			int indice = input.nextInt();
			Case caseReference = bateau.getCases()[indice];
		    System.out.println("entrer l'abscisse et l'ordonnée de la case dans la grille");
		    int x = input.nextInt();
		    int y = input.nextInt();
		    this.grille.getGrille()[x][y] = caseReference;
		    // à terminer plus tard
			
			
			
			
		
		
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
	

	

}
