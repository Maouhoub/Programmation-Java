package jeunavale;

import java.util.Arrays;

/**
 * classe Bateau : représente un bateau dans le jeu.
 * @author MUSTAPHA
 *
 */
public abstract class  Bateau 
{   /**
     *champ private int : nombre des cases de ce Bateau
     */
	protected int taille;
	
	protected boolean place = false;
	
	protected String Symbole = "b";
	
	/**
	 * boolean indiquant l'orientation verticale(true) ou verticale
	 */
	public boolean horizontal;
	
	/**
	 * instance de classe vector
	 */
	protected Case[] cases  ;
	
	/**
	 * constructeur par défaut
	 */
	public Bateau()
	{
		
	}
	
	/**
	 * constructeur 
	 * @param taille : entier indiquant le nombre des cases
	 */
	public Bateau(int taille)
	{   
		//on suppose que 0 <= taille <= 10, on peut créer une classe TailleInacceptableException .
		
		this.taille = taille;
		this.cases = new Case[taille];
		for(int i = 0; i < taille ; i++)this.ajouteCase(new Case());
		
	}

	/**
	 * récupérer la taille du tableau
	 * @return int : nombre des cases du tableau
	 */
	public int getTaille()
	{
		return this.taille;
	}
	 
	/**
	 * vérifier si toutes les cases sont touché(true) ou non (false)
	 * @return : boolean  les cases sont elles toutes touché(true) ou non (false)
	 */
	public boolean estCoule()
	{
		boolean result = false;
		for(Case c : this.cases)
		{
			if(c.etat == true)
			 {
				result = true;
				break;
			 
			 }
			
			
		}
		return result;
	}
	
	/**
	 * ajouter une case à ce bateau, s'il y'en a de place.
	 * @param c : instance de case à ajouter.
	 */
	public abstract void ajouteCase(Case c);


	/**
	 * récupérer le tableau de cases de cet instance de Bateau
	 * @return : tableau de cases
	 */
	public Case[] getCases() {
		return cases;
	}
	

	public boolean isPlace() {
		return place;
	}

	public void setPlace(boolean place) {
		this.place = place;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cases);
		result = prime * result + (horizontal ? 1231 : 1237);
		result = prime * result + taille;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bateau other = (Bateau) obj;
		if (!Arrays.equals(cases, other.cases))
			return false;
		if (horizontal != other.horizontal)
			return false;
		if (taille != other.taille)
			return false;
		return true;
	}

	public abstract String getSymbole();
	
	
	
	
	
}
