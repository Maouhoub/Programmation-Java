package jeunavale;

/**
 * @author MUSTAPHA
 * classe Case : représente une case de la grille d'un joueur
 */

 
public class Case 
{  
	/**
    *champ privé etat : boolean, si vaut true la case est touché ou non touché s'il vaut false
    */
	public boolean etat;
	
	/**
	 * instance de bateau représente le bateau potentiel ou
	 * la case PEUT etre.
	 */
	private Bateau bateau;
	
	/**
	 * Constructeur par défaut
	 */
	public Case()
	{
		this.etat = false;
	}

	/**
	 * récupérer le champ bateau de cette instance
	 * @return : instance Bateau
	 */
	public Bateau getBateau() {
		return this.bateau;
	}

	/**
	 * modifier le champ bateau de cette instance
	 * @param bateau : instance Bateau
	 */
	public void setBateau(Bateau bateau) {
		this.bateau = bateau;
	}
	
	
	
	
	

}
