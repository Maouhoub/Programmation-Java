package ma.part1;

public class Professeur 
{

		private String nom;
		private Integer nummerSomme;
		private String email;
		private String grade;
		public Professeur()
		{
			this.nom = null;
			this.nummerSomme = null;
			this.email = null;
			this.grade = null;
			
		}
		public Professeur(String nom, Integer nummerSomme, String email, String grade) {
			super();
			this.nom = nom;
			this.nummerSomme = nummerSomme;
			this.email = email;
			this.grade = grade;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public Integer getNummerSomme() {
			return nummerSomme;
		}
		public void setNummerSomme(Integer nummerSomme) {
			this.nummerSomme = nummerSomme;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public void afficher()
		{   System.out.println("affichage professeur");
			System.out.println("nom : " + this.nom + "\nnummerSomme : " + this.nummerSomme + "\nemail : " + this.email);
			System.out.println("grade :" + this.grade +"\n\n");
		}

	}



