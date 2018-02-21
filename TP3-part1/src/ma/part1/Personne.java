package ma.part1;

public abstract class Personne 
{
	protected String nom;
	protected String email;
	
	public Personne()
	{
		this.nom = null;
		this.email = null;
	}

	public Personne(String nom, String email)
	{
		this.nom = nom;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
