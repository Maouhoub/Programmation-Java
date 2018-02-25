package ma.part4;

import java.util.Arrays;

/**
 * classe etudiant : représente un étudiant
 * @author MUSTAPHA
 *
 */
public class Etudiant extends Personne implements Collection
{
	/**
	 * champ protected String : nom de l'eleve
	 */
	
	protected Integer nummerEtudiant;
	
	/**
	 * champ protected 
	 */
	protected Module[] modules = new Module[6];
	
	/**
	 * constructeur par défaut on se sert de ce constructeur par défaut
	 * de la classe Personne pour initialiser ses PROPRES attributs.(recommandés)
	 */
	public Etudiant()
	{
		super();
		this.nummerEtudiant = null;
		
		for(Module module : modules)
		{
			module = new Module();
		}
	}
	
	/**
	 * constructeur 1 aussi on se sert du constructeur Personne(Integer , String) pour initialiser les champs hérités
	 * @param nom objet String représentant le nom
	 * @param nummerEtudiant Objet Integer représentant le numéro de l'étudiant
	 * @param email objet String représentant l'email de l'etuiant
	 */
	public Etudiant(String nom, Integer nummerEtudiant, String email, Module[] modules) 
	{
		
		super(nom, email);
		this.nummerEtudiant = nummerEtudiant;
		this.modules = modules;
		
	}
	
	/**
	 * ajouter un élément au tableau si l'indice est valable
	 * @param o : objet Module : objet à ajouter au tableau modules
	 * @param i : indice d'ajout potentiel
	 * @return : boolean qui désigne true si l'objet est ajoutée ou false sinon
	 */
	public Boolean addObject(Object o, int i)
	{
		if(( i < 0) || (i >= this.modules.length ))
				return false;
		else
		{
			this.modules[i] = (Module)o;
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
		if(( i < 0) || (i >= this.modules.length ))
			{return false;}
		else if(!this.modules[i].equals(o))
			{return false;}
		else
			{
			this.modules[i] = null;
			return true; }
		
	}
	
	/**
	 * récupérer l'element du tableu membre d'indice i si est valide sinon null.
	 * @param : int i
	 * @return : instance designant membre[i].
	 */
	public Object getObject(int i)
	{
		if((i < 0) || (i >= this.modules.length))
			return null;
		else
			return this.modules[i];
				
	}
	

	
	/**
	 * récupérer le numero d'ordre de l'étudiant
	 * @return : objet Integer représentant le numéro d'ordre de l'élève.
	 */
	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}
	
	/**
	 * modifier le numero d'ordre de l'étudiant
	 * @param nummerEtudiant : objet Integer représentant le nouveau numéro d'ordre de l'élève.
	 */
	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}
	
	
	/**
	 * récupérer la liste des modules
	 * @return : tableau Module[] .
	 */
	public Module[] getModules() {
		return modules;
	}

	/**
	 * modifier la liste des modules
	 * @param modules : le tableau des nouveaux modules.
	 */
	public void setModules(Module[] modules) {
		this.modules = modules;
	}

	/**
	 * afficher les informations d'un Etudiant
	 */
	public void afficher()
	{	
		System.out.println("affichage etudiant");
		System.out.println("Mon nom est : " + this.nom + "\nMon numéro est : " + this.nummerEtudiant);
		System.out.println("Mon email est :" + this.email);
		String str = "Cet eleve suit les modules suivants : ";
		for(Module module : this.modules) str += " " + module.getLibelle();
		System.out.print(str);
	}
	
	/*
	 * redéfinition de toString de Object
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Etudiant [nummerEtudiant=" + nummerEtudiant + ", modules=" + Arrays.toString(modules) + "]";
	}
	

}
