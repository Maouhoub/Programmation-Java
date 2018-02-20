package ma.tp2;
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
	 * constructeur par défaut
	 */
	public Etudiant()
	{
		super();
		this.nummerEtudiant = null;
		
	}
	
	/**
	 * constructeur 1
	 * @param nom objet String représentant le nom
	 * @param nummerEtudiant Objet Integer représentant le numéro de l'étudiant
	 * @param email objet String représentant l'email de l'etuiant
	 */
	public Etudiant(String nom, Integer nummerEtudiant, String email) {
		
		super(nom, email);
		this.nummerEtudiant = nummerEtudiant;
		
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
		System.out.println("Mon email est :" + this.email + "\n\n" );
	}
	

}
