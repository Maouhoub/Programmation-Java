package ma.part1;

public class Doctorant extends Etudiant implements Salarie 
{
	private String sujetThese;
	private Professeur encadrant;
	
	public Doctorant()
	{
		super();
		this.sujetThese = null;
		this.encadrant = null;
	}

	public String getSujetThese() {
		return sujetThese ;
	}

	public void setSujetThese(String these) {
		this.sujetThese = these;
	}

	public Professeur getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(Professeur encadrant) {
		this.encadrant = encadrant;
	}
	public Float calculeSalaire(Integer NbrHeurs) 
	{
		float result =  (NbrHeurs > 32) ? (NbrHeurs - 32) * 600 * 0.83f + 400 * 32 * 0.66f : NbrHeurs * 400 * 0.66f;
		return result;
	}
	
	public Float calculeVacances(Integer Nbrjours)
	{
		return (float)(Nbrjours / 10);
	}
	
	
	
}
