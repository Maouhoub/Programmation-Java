package ma.part4;
/**
 * Classe abstraite : représente une personne
 * @author MUSTAPHA
 *
 */
public abstract class Personne 
{   
	
	/**
     *champ protected String : nom de cette Personne
     */
	protected String nom;
	
	/**
	 * champ protected String : email de cette Personne
	 */
	protected String email;
	
	/**
	 * constructeur par defaut
	 */
	public Personne()
	{
		this.nom = null;
		this.email = null;
	}

	/**
	 * surchrge. constructeur 2 paramétré
	 * @param nom : String nom de cet instance
	 * @param email : String email de cette instance
	 */
	public Personne(String nom, String email)
	{
		this.nom = nom;
		this.email = email;
	}

	/**
	 * récupérer le nom (String)
	 * @return : String
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * modifier le nom (String)
	 * @param nom : String
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * récupérer le nom (String)
	 * @return : String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * modifier le champ email
	 * @param email : String
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
/*redéfinition de la méthode hashcode 
 * (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}
	
/*redéfinition de la méthode equals de Object pour éviter l'erreur de compilation
 * Personne per = new ClasseFille(...);   per.eauals(ClasseFilleObject);
 * (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	

}
