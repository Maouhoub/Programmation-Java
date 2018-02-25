package ma.part4;
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
	 * constructeur par défaut
	 */
	public Module()
	{
		this.libelle = null;
		this.coefficient = null;
		this.nbrHeures = null;
			}
	
	/**
	 * constructeur paramétré
	 * @param libelle : Objet String qui identifie le module.
	 * @param coefficient :  Objet Integer déterminant le coeficient du module.
	 * @param nbrHeures :  Objet Integer déterminant le nombre d'heures réservées au module
	 * @param enseignent : Objet Professeur représentant l'enseignat du module
	 */
	public Module(String libelle, Integer coefficient, Integer nbrHeures) {
		
		this.libelle = libelle;
		this.coefficient = coefficient;
		this.nbrHeures = nbrHeures;
		
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
	 * afficher les informations de l'instance Module appelante
	 */
	public void afficher()
	{   System.out.println("affichage Module");
		System.out.println("libellé :" + this.libelle +"\ncoefficient :" +this.coefficient+ "\nnombre d'heures :" + this.nbrHeures);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coefficient == null) ? 0 : coefficient.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((nbrHeures == null) ? 0 : nbrHeures.hashCode());
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
		Module other = (Module) obj;
		if (coefficient == null) {
			if (other.coefficient != null)
				return false;
		} else if (!coefficient.equals(other.coefficient))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (nbrHeures == null) {
			if (other.nbrHeures != null)
				return false;
		} else if (!nbrHeures.equals(other.nbrHeures))
			return false;
		return true;
	}

	/*
	 * redéfinition de toString de Object
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Module [libelle=" + libelle + ", coefficient=" + coefficient + ", nbrHeures=" + nbrHeures + "]";
	}
	
	
    
	
}
