package ma.part1;
/**
 * classe etudiant : représente un étudiant
 * @author MUSTAPHA
 *
 */
public class Etudiant extends Personne
{
	/**
	 * champ privé String : nom de l'eleve
	 */
	
	private Integer nummerEtudiant;
	
	
	/**
	 * constructeur par défaut on se sert de ce constructeur par défaut
	 * de la classe Personne pour initialiser ses PROPRES attributs.(recommandés)
	 */
	private Module[] modules = new Module[6];
	
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
	

}
