package ma.part1;
/**
 * classe etudiant : représente un étudiant
 * @author MUSTAPHA
 *
 */
public class Etudiant 
{
	/**
	 * champ privé String : nom de l'eleve
	 */
	private String nom;
	
	/**
	 * champ privé Integer : numero d'ordre de l'étudiant
	 */
	private Integer nummerEtudiant;
	
	/**
	 * champ privé String : adresse email de l'etudiant
	 */
	private String email;
	
	/**
	 * constructeur par défaut
	 */
	public Etudiant()
	{
		this.nom = null;
		this.nummerEtudiant = null;
		this.email = null;
	}
	
	/**
	 * constructeur 1
	 * @param nom objet String représentant le nom
	 * @param nummerEtudiant Objet Integer représentant le numéro de l'étudiant
	 * @param email objet String représentant l'email de l'etuiant
	 */
	public Etudiant(String nom, Integer nummerEtudiant, String email) {
		
		this.nom = nom;
		this.nummerEtudiant = nummerEtudiant;
		this.email = email;
	}
	
	/**
	 * getter du nom
	 * @return String représentant le nom de l'objet étudiant appelant
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * setter du nom
	 * @param nom : Objet String représentant le nom de l'étudiant.
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
	 * récupérer l'email de l'etudiant
	 * @return : objet String représentant le email de l'élève
	 */
	public String getEmail() 
	{
		return email;
	}
	
	/**
	 * modifier l'email de l'etutidiant
	 * @param email : objet String représentant le nouveau email de l'élève
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * afficher les informations d'un Etudiant
	 */
	public void afficher()
	{	
		System.out.println("affichage etudiant");
		System.out.println("Mon nom est : " + this.nom + "\nMon numéro est : " + this.nummerEtudiant);
		System.out.println("Mon email est :" + this.email + "\n\n" );
	}
	

}
