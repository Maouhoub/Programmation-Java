package ma.part4;

import java.util.Arrays;

/**
 * classe Departement : représete un départemet
 * @author MUSTAPHA
 *
 */
public class Departement implements Collection
{
	/**
     *champ private String : nom.
     */
	private String nom;
	/**
	 * champ private Professeur : chefDepartement.
	 */
	private Professeur chefDepartement;
	
	/**
	 * tableau Persone[] : qui représete les membres du département(instances Professeur, Doctorant).
	 */
	public Personne[] membre;
	
	/**
	 * constructeur par défaut.
	 */
	public Departement()
	{
		//par defaut le constructeur par defaut initialize un boolean a false, nombre à 0.0 un reference à null;
	}
	
	/**
	 * ajouter un élément au tableau si l'indice est valable
	 * @param o : objet Module : objet à ajouter au tableau membre
	 * @param i : indice d'ajout potentiel
	 * @return : boolean qui désigne true si l'objet est ajoutée ou false sinon
	 */
	public Boolean addObject(Object o, int i)
	{
		if(( i < 0) || (i >= this.membre.length ))
				return false;
		else
		{
			this.membre[i] = (Personne)o;
			return true;
		}
		
	}
	/**
	 * 
	 * supprimer l'objet o à de l'emplacement i si ce dernier est valide et la cse correspondante 
	 * contienne l'objet o
	 * @param o : objet à supprimer
	 * @param i : int (indice de la case à supprimer)
	 * @return : boolean qui désigne true si l'objet est supprimé ou false sinon
	 */
	public Boolean removeObject(Object o, int i)
	{
		if(( i < 0) || (i >= this.membre.length ))
			{return false;}
		else if(!this.membre[i].equals(o))
			{return false;}
		else
			{
			this.membre[i] = null;
			return true; }
		
	
		
	}
	
	/**
	 * récupérer l'element du tableu membre d'indice i si est valide sinon null.
	 * @param : int i
	 * @return : instance designant membre[i].
	 */
	public Object getObject(int i)
	{
		if((i < 0) || (i >= this.membre.length))
			return null;
		else
			return this.membre[i];
				
	}
	
	
	/**
	 * récupérer le nom du département
	 * @return : String reprsentant le nom.
	 */
	public String getNom() {
	return nom;
	}
	/**
	 * modifier le nom du département
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * récupérer le chef u départemet (instance de Professeur).
	 * @return : instance de Professeur.
	 */
	public Professeur getChefDepartement() {
	return chefDepartement;
	}
	/**
	 * modifier le champ chefDepartement.
	 * @param chefDepartement : instance de professeur.
	 */
	public void setChefDepartement(Professeur chefDepartement) {
	this.chefDepartement = chefDepartement;
	}

	/**
	 * calculer la masse salariale (somme des salaires des membres du departement).
	 * @param Integer n : nombre d'heures que travaille le doctorant.
	 * @return : objet Float représentant la masse salariale
	 */
	public Float calculMasseSalarial(Integer n)
	{   
	
    Float masse = 0.0f;
	for(int i = 0; i < this.membre.length; ++i)
    
    	if(this.membre[i] instanceof Professeur)
    	{
    		masse += ((Professeur)this.membre[i]).calculeSalaire();
    	}
    	else
    	{
    		masse += ((Doctorant)this.membre[i]).calculeSalaire(n);
    		
    	}

	   return masse;
}
	
/*
 * redéfinition de toString de object
 * (non-Javadoc)
 * @see java.lang.Object#toString()
 */
	@Override
	public String toString() {
		return "Departement [nom=" + nom + ", chefDepartement=" + chefDepartement + ", membre="
				+ Arrays.toString(membre) + "]";
	}
	
	


}
