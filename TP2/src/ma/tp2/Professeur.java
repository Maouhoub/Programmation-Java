package ma.tp2;

public class Professeur extends Personne implements Salarie
{
		
		
		/**
		 * champ private Integer : Objet qui représente le numero du professeur
		 */
		private Integer nummerSomme;
		
		
		/**
		 * champ private String qui représente : la grade du professeur.
		 */
		private String grade;
		
		/**
		 * constructeur par défaut .
		 */
		public Professeur()
		{
			super();
			this.nummerSomme = null;
			this.grade = null;
			
		}
		
		/**
		 * Constructeur 
		 * @param nom : Objet String qui représente le nom du professeur.
		 * @param nummerSomme : Objet Integer qui représente le numero de l'instance crée.
		 * @param email : qui représente qui représente l'adresse email du professeur.
		 * @param grade : qui représente la grade du professeur.
		 */
		public Professeur(String nom, Integer nummerSomme, String email, String grade) {
			super(nom, email);
			this.nummerSomme = nummerSomme;
			this.grade = grade;
		}
		
	
		
		/**
		 * modifier le numero du professeur. 
		 * @return  objet Integer qui représente la valeur courantedu numero.
		 */
		public Integer getNummerSomme() {
			return nummerSomme;
		}
		
		/**
		 * modifier le numero du professeur.
		 * @param nummerSomme : objet Integer qui représente la nouvelle valeur.
		 */
		public void setNummerSomme(Integer nummerSomme) {
			this.nummerSomme = nummerSomme;
		}
		
		/**
		 * récupérer l'adresse email.
		 * @return : Strinng représentant l'email .
		 */
	
		
		/**
		 * récupérer la grade de l'objet Professeur.
		 * @return : String qui représente la grade de l'objet Professeur
		 */
		public String getGrade() {
			return grade;
		}
		
		/**
		 * modifier l'attribut grade
		 * @param grade String qui représente : la grade de l'instance Professeur appelante.
		 */
		public void setGrade(String grade) {
			this.grade = grade;
		}
		
		public Float calculeSalaire(Integer NbrHeurs) 
		{
			float result =  (NbrHeurs > 32) ? (NbrHeurs - 32) * 600 * 0.83f + 400 * 32 * 0.66f + 5000 : NbrHeurs * 400 * 0.66f + 5000;
			return result;

		}
		
		public Float calculeVacances(Integer Nbrjours)
		{
			return (float)(Nbrjours / 10);
		}
		
		
		
		/**
		 * méthode publique : permet d'afficher les informations de l'instance courante.
		 */
		public void afficher()
		{   System.out.println("affichage professeur");
			System.out.println("nom : " + this.nom + "\nnummerSomme : " + this.nummerSomme + "\nemail : " + this.email);
			System.out.println("grade :" + this.grade +"\n\n");
		}
		
		
		

	}



