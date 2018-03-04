package jeunavale;

/**
 * classe Grille : permet de représenter la grille de chaque joueur
 * @author MUSTAPHA
 *
 */
public class Grille 
{  
	public static final int   NB_LIGNES = 11, NB_COLONNES = 10;
	
	
	/**
    *Champ privé de type Case[][] : matrice de dimention 10*10 représente 100 objet Case d'un joueur
    */
	private Case[][] grille = new Case[NB_LIGNES][NB_COLONNES];
	
	/**
	 * Constructeur par défaut : tous les element de grille sont instancié par 
	 * le constructeur par défaut de Case .
	 */
	
	private Joueur joueur;
	public Grille()
	{
		for(int i = 0; i < NB_LIGNES; ++i)
		{
			for(int j = 0; j < NB_COLONNES; ++j)
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
	
	  public void affiche()
	   {     
	
	//	for(int i = 0; i < SIZE; i++) {for(int j = 0; j < SIZE; j++ )cases[i][j] = new Case();}
		 
		 for(Bateau bateau : this.getJoueur().getBateaux())
		  {  
		   if(bateau.estCoule()) 
			  {
				  for(Case c : bateau.getCases()) c.etat = true;
			  }
		  
		  }
				
			   for(Case[] cas :this.grille)
				
				{
					for(Case b : cas)
					{  //Case b = this.grille[i][j];
							if(b.etat)
							{System.out.print("o ");
							
							 continue;
							}
							
					     if(b.getBateau() != null)
					     {
					    	 System.out.print(b.getBateau().getSymbole() + " ");
					     }
					     else
					     {
					    	 System.out.print("x ");
					     }
							
					}
					System.out.println();
				
			
				}
				
	   }
	 /* private boolean isPartOfBoat(Case c)
	  {
		  	boolean isPartBoat = false;
			for(Bateau bateau : this.getJoueur().getBateaux()) 
				{
				if(c.getBateau().equals(bateau))
				{
					isPartBoat = true;
					break;
				}
				}
			return isPartBoat;
	  }*/
}
