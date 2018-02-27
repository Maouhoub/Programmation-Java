package jeunavale;

/**
 * classe Grille : permet de représenter la grille de chaque joueur
 * @author MUSTAPHA
 *
 */
public class Grille 
{  
	
	/**
    *Champ privé de type Case[][] : matrice de dimention 10*10 représente 100 objet Case d'un joueur
    */
	private Case[][] grille = new Case[10][10];
	
	/**
	 * Constructeur par défaut : tous les element de grille sont instancié par 
	 * le constructeur par défaut de Case .
	 */
	
	private Joueur joueur;
	public Grille()
	{
		for(int i = 0; i < 10; ++i)
		{
			for(int j = 0; j < 10; ++j)
			{
				this.grille[i][j] = new Case();
			}
		}
	}
	
	/**
	 * permet de tirer (changer l'état) d'une case déterminée par ses coordonées
	 * @param x : type int, abscisse de la Case objectif.
	 * @param y : type int, ordonnée de la Case objectif.
	 */
	public void tir(int x, int y)
	{
		if(this.grille[x][y].etat == false)
			this.grille[x][y].etat = true;
	}
	
	/**
	 * permet d'afficher la grille , à l'état actuel.
	 */
	public void afficheTirs()
	{
		for(Case[] x : this.grille)
		{
			for(Case y : x)
			{
				if(y.etat)
					System.out.print("o ");
				else
					System.out.print("x ");
			}
			System.out.println();
		}
	}
	
	/**
	 * permet de récupérer la grille du joueur actuel
	 * @return : type : Case[][] tableu à deux dimenstion représentant la grille .
	 */
	public Case[][] getGrille() {
		return grille;
	}
	
	/**
	 * permet de modifier le champ this.grille
	 * @param grille : tableau 10*10 d'instances Cases.
	 */
	public void setGrille(Case[][] grille) {
		this.grille = grille;
	}

	/**
	 * récupérer le joueur propriétaire de la grille
	 * @return : instance Joueur 
	 */
	public Joueur getJoueur() {
		return joueur;
	}

	/**
	 * modifier le joueur propriétaire de la grille
	 * @param joueur : instance Joueur 
	 */
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	

}
