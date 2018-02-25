package ma.part4;

import java.util.Arrays;

/**
 * classe : représentant une filière
 * @author MUSTAPHA
 *
 */
public class Filiere 
{
	/**
	 * champ privé tableau (référence) d'objet etudiant
	 */
	private Etudiant[] etudiants ;
	
	/**
	 * champ privé Integer : numero de la section
	 */
	private Integer numeroSection;
	
	/**
	 * champ privé Professeur : chef de la section
	 */
	private Professeur chefSection;
	
	/**
	 * Constructeur par défaut, on peut l'omettre
	 */
	public Filiere()
	{
		this.etudiants = null;
		this.numeroSection = null;
		this.chefSection = null;
	}
    
	/**
	 * ajouter un élément au tableau si l'indice est valable
	 * @param o : objet Module : objet à ajouter au tableau etudiants
	 * @param i : indice d'ajout potentiel
	 * @return : boolean qui désigne true si l'objet est ajoutée ou false sinon
	 */
	public Boolean addObject(Object o, int i)
	{
		if(( i < 0) || (i >= this.etudiants.length ))
				return false;
		else
		{
			this.etudiants[i] = (Etudiant)o;
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
		if(( i < 0) || (i >= this.etudiants.length ))
			{return false;}
		else if(!this.etudiants[i].equals(o))
			{return false;}
		else
			{
			this.etudiants[i] = null;
			return true; }
		
	
		
	}
	
	/**
	 * récupérer l'element du tableu etudiants d'indice i si est valide sinon null.
	 * @param : int i
	 * @return : instance designant modules[i].
	 */
	public Object getObject(int i)
	{
		if((i < 0) || (i >= this.etudiants.length))
			return null;
		else
			return this.etudiants[i];
				
	}
	/**
	 * récupérer le champ numeroSection
	 * @return : Integer
	 */
	public Integer getNumeroSection() {
		return numeroSection;
	}

	/** 
	 * modifier le champ numeroSection
	 * @param numeroSection : Integer
	 */
	public void setNumeroSection(Integer numeroSection) {
		this.numeroSection = numeroSection;
	}
    
	/**
	 * récupérer le champ chef de section
	 * @return :  objet Professeur .
	 */
	public Professeur getChefSection() {
		return chefSection;
	}
	
    /**
     * modifier le champ chefSection
     * @param chefSection : objet Professeur .
     */
	public void setChefSection(Professeur chefSection) {
		this.chefSection = chefSection;
	}

	
	public Etudiant[] getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Etudiant[] etudiants) {
		this.etudiants = etudiants;
	}

	/*
	 * redéfinition de toString de Object
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Filiere [etudiants=" + Arrays.toString(etudiants) + ", numeroSection=" + numeroSection
				+ ", chefSection=" + chefSection + "]";
	}
	
	

}
