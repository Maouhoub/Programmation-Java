package ma.part4;
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
	/**
	 * récupérer le champ encadrant de cet instance
	 * @return : Objet Professeur
	 */
	

	public Professeur getEncadrant() {
		return encadrant;
	}

	/**
	 * modifier le champ encadrant
	 * @param encadrant : objetProfesseur (nouveau encadrant).
	 */
	public void setEncadrant(Professeur encadrant) {
		this.encadrant = encadrant;
	}
	
	/**
	 * calculer le salaire en fonction des heurs travaillées
	 * @param Integer : nombre des heures
	 * @return : objet Float
	 */
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
	
	/*
	 * redéfinition de la méthode hashCode de la classe Object
	 * (non-Javadoc)
	 * @see ma.part4.Personne#hashCode()
	 */
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((encadrant == null) ? 0 : encadrant.hashCode());
		result = prime * result + ((sujetThese == null) ? 0 : sujetThese.hashCode());
		return result;
	}
	

	/*
	 * redéfinition de la méthode equals pour fair une comparaison entre les instances de Professeur.
	 * (non-Javadoc)
	 * @see ma.part4.Personne#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctorant other = (Doctorant) obj;
		if (encadrant == null) {
			if (other.encadrant != null)
				return false;
		} else if (!encadrant.equals(other.encadrant))
			return false;
		if (sujetThese == null) {
			if (other.sujetThese != null)
				return false;
		} else if (!sujetThese.equals(other.sujetThese))
			return false;
		return true;
	}
	
	
	
	
}
