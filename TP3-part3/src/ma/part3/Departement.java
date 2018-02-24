package ma.part3;
/**
 * classe Departement : représete un départemet
 * @author MUSTAPHA
 *
 */
public class Departement 
{
	/**
     *champ private String : nom.
     */
	private String nom;
	/**
	 * champ private Professeur : chefDepartement.
	 */
	private Professeur chefDepartement;
	/**
	 * tableau Persone[] : qui représete les membres du département(instances Professeur, Doctorant).
	 */
	public Personne[] membre;
	/**
	 * constructeur par défaut.
	 */
	public Departement()
	{
		//par defaut le constructeur par defaut initialize un boolean a false, nombre à 0.0 un reference à null;
	}
	/**
	 * récupérer le nom du département
	 * @return : String reprsentant le nom.
	 */
	public String getNom() {
	return nom;
	}
	/**
	 * modifier le nom du département
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * récupérer le chef u départemet (instance de Professeur).
	 * @return : instance de Professeur.
	 */
	public Professeur getChefDepartement() {
	return chefDepartement;
	}
	/**
	 * modifier le champ chefDepartement.
	 * @param chefDepartement : instance de professeur.
	 */
	public void setChefDepartement(Professeur chefDepartement) {
	this.chefDepartement = chefDepartement;
	}

	/**
	 * calculer la masse salariale (somme des salaires des membres du departement).
	 * @return : objet Float représentant la masse salariale
	 */
	public Float calculMasseSalarial(Integer n)
	{   
	//Salarie[] salaries = new Salarie[this.membre.length];
    Float masse = 0.0f;
	for(int i = 0; i < this.membre.length; ++i)
    
    	if(this.membre[i] instanceof Professeur)
    	{
    		masse += ((Professeur)this.membre[i]).calculeSalaire();
    	}
    	else
    	{
    		masse += ((Doctorant)this.membre[i]).calculeSalaire(n);
    	}

	   return masse;
}



}
