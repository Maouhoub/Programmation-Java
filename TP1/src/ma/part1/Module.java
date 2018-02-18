package ma.part1;

public class Module 
{
	
	private String libelle;
	private Integer coefficient;
	private Integer nbrHeures;
	private Professeur enseignent;
	public Module()
	{
		this.libelle = null;
		this.coefficient = null;
		this.nbrHeures = null;
		this.enseignent = new Professeur();
	}
	
	public Module(String libelle, Integer coefficient, Integer nbrHeures, Professeur enseignent) {
		
		this.libelle = libelle;
		this.coefficient = coefficient;
		this.nbrHeures = nbrHeures;
		this.enseignent = enseignent;
	}

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Integer getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	public Integer getNbrHeures() {
		return nbrHeures;
	}
	public void setNbrHeures(Integer nbrHeures) {
		this.nbrHeures = nbrHeures;
	}
	public Professeur getEnseignent() {
		return enseignent;
	}
	public void setEnseignent(Professeur enseignent) {
		this.enseignent = enseignent;
	}
	//: String libellé, Integer coefficient, Integer  nbrHeures, professeur enseignent
	public void afficher()
	{   System.out.println("affichage Module");
		System.out.println("libellé :" + this.libelle +"\ncoefficient :" +this.coefficient+ "\nnombre d'heures :" + this.nbrHeures);
		System.out.println("professeur : prof  " + this.enseignent.getNom() + "\n\n");
	}

	
}
