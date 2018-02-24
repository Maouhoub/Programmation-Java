package ma.part3;
/**
 * represente un Doctorant
 * @author MUSTAPHA
 *
 */
public class Doctorant extends Etudiant implements Salarie 
{
	
	/**
	 * champ private String : sujet de la these.
	 */
	private String sujetThese;
	
	/**
	 * champ private Professeur : encadrant du doctorant
	 */
	private Professeur encadrant;
	
	/**
	 * constructeur par défaut
	 */
	public Doctorant()
	{
		super();
		this.sujetThese = null;
		this.encadrant = null;
	}
	/**
	 * récupérer le sujet de la thèse
	 * @return : objet String 
	 */
	public String getSujetThese() {
		return sujetThese ;
	}

	/**
	 * modifier le champ these de cet instance
	 * @param these : String qui représente la these
	 */
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
	
	/**
	 * calcul le nombre de vacances
	 * @param : Integer représentant le nombre de jours
	 * @return : objet Float représentant le nombre de jours de vacances
	 */
	public Float calculeVacances(Integer Nbrjours)
	{
		return (float)Nbrjours / 10;
	}
	
	
	
}
