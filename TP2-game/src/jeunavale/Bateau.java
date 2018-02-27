package jeunavale;



/**
 * classe Bateau : représente un bateau dans le jeu.
 * @author MUSTAPHA
 *
 */
public class Bateau 
{   /**
     *champ private int : nombre des cases de ce Bateau
     */
	private int taille;
	
	/**
	 * boolean indiquant l'orientation verticale(true) ou verticale
	 */
	public boolean horizontal;
	
	/**
	 * instance de classe vector
	 */
	private Case[] cases  ;
	
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
		//on suppose que 0 <= taille <= 10
		this.taille = taille;
		this.cases = new Case[taille];
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
		boolean result = true;
		for(Case c : this.cases)
		{
			if(c.etat == false)
			 result = false;
			
		}
		return result;
	}
	
	/**
	 * ajouter une case à ce bateau, s'il y'en a de place.
	 * @param c : instance de case à ajouter.
	 */
	public void ajouteCase(Case c)
	{
		int ajoutee = 0;
		for(int i = 0; i < this.cases.length ; i++)
		{
			if(this.cases[i] == null) 
		
				{
					this.cases[i] = c;
					//System.out.println("Ajoutee");
					ajoutee = 1;
					break;
				}
		}
		if(ajoutee == 0) System.out.println("Pas de place!");
		
		
		
	}

	/**
	 * récupérer le tableau de cases de cet instance de Bateau
	 * @return : tableau de cases
	 */
	public Case[] getCases() {
		return cases;
	}

	/**
	 * modifier le tableau de cases de cet instance de Bateau
	 * @param cases : tableau de cases
	 */
	public void setCases(Case[] cases) {
		this.cases = cases;
	}
	
	
	
	
	
}
