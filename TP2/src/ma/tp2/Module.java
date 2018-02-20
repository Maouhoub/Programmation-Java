package ma.tp2;
/**
 * Classe Module : représente un module
 * @author MUSTAPHA
 *
 */
public class Module 
{
	
	/**
	 * chap privet String : Objet qui identifie le module.
	 */
	private String libelle;
	
	/**
	 * champ privé Integer : Objet déterminant le coeficient du module.
	 */
	private Integer coefficient;
	
	/**
	 * champ privé Integer : Objet déterminant le nombre d'heures réservées au module
	 */
	private Integer nbrHeures;
	
	/**
	 * champ private Professeur : Objet représentant l'enseignat du module
	 */
	private Professeur enseignent;
	
	/**
	 * constructeur par défaut
	 */
	public Module()
	{
		this.libelle = null;
		this.coefficient = null;
		this.nbrHeures = null;
		this.enseignent = new Professeur();
	}
	
	/**
	 * constructeur paramétré
	 * @param libelle : Objet String qui identifie le module.
	 * @param coefficient :  Objet Integer déterminant le coeficient du module.
	 * @param nbrHeures :  Objet Integer déterminant le nombre d'heures réservées au module
	 * @param enseignent : Objet Professeur représentant l'enseignat du module
	 */
	public Module(String libelle, Integer coefficient, Integer nbrHeures, Professeur enseignent) {
		
		this.libelle = libelle;
		this.coefficient = coefficient;
		this.nbrHeures = nbrHeures;
		this.enseignent = enseignent;
	}
   
	/**
	 * récuperer le libelle
	 * @return : Objet String qui identifie cette instance.
	 */
	public String getLibelle() {
		return libelle;
	}
	
	/**
	 * modifier le libelle
	 * @param libelle : nouveau Objet String qui identifie cette instance.
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	/**
	 * récuperer le coefficient de cette instance
	 * @return : Objet déterminant le coeficient de cette instance.
	 */
	public Integer getCoefficient() {
		return coefficient;
	}
	
	/**
	 * modifier le coefficient de cette instance
	 * @param coefficient : nouveau Objet déterminant le coeficient de cette instance
	 */
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	
	/**
	 * récupérer le nombre d'heures réservées à cette instance de module.
	 * @return : Objet Integer déterminant le nombre d'heures réservées à cette instance de module 
	 */
	public Integer getNbrHeures() {
		return nbrHeures;
	}
	
	/**
	 * modifier le nobre d'heures à cette instance de module.
	 * @param nbrHeures : nouveau Objet Integer déterminant le nombre d'heures réservées à cette instance de module
	 */
	public void setNbrHeures(Integer nbrHeures) {
		this.nbrHeures = nbrHeures;
	}
	
	/**
	 * récupérer l'instance Professeur qui enseigne cette instance de module
	 * @return : Objet Professeur représentant l'enseignat de ce module.
	 */
	public Professeur getEnseignent() {
		return enseignent;
	}
	
	/**
	 * modifier le l'instance Professeur qui enseigne cette instance de module
	 * @param enseignent : la nouvelle instance Professeur qui enseigne cette instance de module
	 */
	public void setEnseignent(Professeur enseignent) {
		this.enseignent = enseignent;
	}
	
	/**
	 * afficher les informations de l'instance Module appelante
	 */
	public void afficher()
	{   System.out.println("affichage Module");
		System.out.println("libellé :" + this.libelle +"\ncoefficient :" +this.coefficient+ "\nnombre d'heures :" + this.nbrHeures);
		System.out.println("professeur : prof  " + this.enseignent.getNom() + "\n\n");
	}

	
}
