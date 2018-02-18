package ma.jeunavale;

/**
 * classe Joueur : représente un joueur
 * @author MUSTAPHA
 *
 */
public class Joueur 
{  
	/**
    *
    *champ privé nom : objet String représentant le nom du joueur
    */
	private String nom;
	/**
	 * 
	 */
	private Grille grille;
	
	/**
	 * constructeur par défaut
	 */
	public Joueur()
	{
		this.nom = null;
		this.grille = null;
		
	}
	
	/**
	 * constructeur surchargé
	 * @param nom : objet String qui représente le nom du Joueur
	 */
	public Joueur(String nom)
	{
		this.nom = nom;
		this.grille = new Grille();
	}

	/**
	 * récupérer l'objet Grille du joueur
	 * @return : objet Grille représentant la grille du joueur
	 */
	public Grille getGrille() {
		return grille;
	}

	/**
	 * récupérer le nom
	 * @return : Objet String qui représente le nom du Joueur
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * modifier le nom du Joueur
	 * @param nom : Objet String qui représente le nom du Joueur
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	

	

}
