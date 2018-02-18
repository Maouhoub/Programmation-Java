package ma.jeunavale;

/**
 * @author MUSTAPHA
 * classe Case : représente une case de la grille d'un joueur
 */

 
public class Case 
{  
	/**
    *champ privé etat : boolean, si vaut true la case est touché ou non touché s'il vaut false
    */
	private boolean etat;
	
	/**
	 * Constructeur par défaut
	 */
	public Case()
	{
		etat = false;
	}
	
	/**
	 * getter du champ etat
	 * @return boolean : etat de la case
	 */
	public boolean getEtat() 
	{
		return etat;
	}
	
	/**
	 * setter du champ etat
	 * @param etat : boolean qui indique l'etat affacté à la case
	 */
	public void setEtat(boolean etat) 
	{
		this.etat = etat;
	}
	
	

}
