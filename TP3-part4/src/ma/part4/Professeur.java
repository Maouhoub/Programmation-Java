package ma.part4;

import java.util.Arrays;

public class Professeur extends Personne implements Salarie, Collection
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
		 * constructeur par défaut . j'ai ajouter une boucle pour modifier l'ensignant du module à l'instance
		 * actuelle.
		 */
		private Module[] modules = new Module[4];
		
		/**
		 * constructeur par defaut
		 */
		public Professeur()
		{
			super();
			this.nummerSomme = null;
			this.grade = null;
			for(int i = 0; i < 4; ++i)
			{
				this.modules[i] = new Module();
				
			}
			
		}
		
		/**
		 * Constructeur surchargé.
		 * @param nom : Objet String qui représente le nom du professeur.
		 * @param nummerSomme : Objet Integer qui représente le numero de l'instance crée.
		 * @param email : qui représente qui représente l'adresse email du professeur.
		 * @param grade : qui représente la grade du professeur.
		 */
		public Professeur(String nom, Integer nummerSomme, String email, String grade,Module[] modules) {
			super(nom, email);
			this.nummerSomme = nummerSomme;
			this.grade = grade;
			this.modules = modules;
			
		
			
		}
		
		/**
		 * ajouter un élément au tableau si l'indice est valable
		 * @param o : objet Module : objet à ajouter au tableau modules
		 * @param i : indice d'ajout potentiel
		 * @return : boolean qui désigne true si l'objet est ajoutée ou false sinon
		 */
		public Boolean addObject(Object o, int i)
		{
			if(( i < 0) || (i >= this.modules.length ))
					return false;
			else
			{
				this.modules[i] = (Module)o;
				return true;
			}
			
		}
		
		/**
		 * 
		 * supprimer l'objet o à de l'emplacement i si ce dernier est valide et la cse correspondante 
		 * contienne l'objet o
		 * @param o : objet à supprimer
		 * @param i : int (indice de la case à supprimer)
		 * @return : boolean qui désigne true si l'objet est supprimé ou false sinon
		 */
		public Boolean removeObject(Object o, int i)
		{
			if(( i < 0) || (i >= this.modules.length ))
				{return false;}
			else if(!this.modules[i].equals(o))
				{return false;}
			else
				{
				this.modules[i] = null;
				return true; }
			
		
			
		}
		
		/**
		 * récupérer l'element du tableu membre d'indice i si est valide sinon null.
		 * @param : int i
		 * @return : instance designant modules[i].
		 */
		public Object getObject(int i)
		{
			if((i < 0) || (i >= this.modules.length))
				return null;
			else
				return this.modules[i];
					
		}
		
	
		
		/**
		 * récupérer le numero du professeur. 
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
		/**
		 * @param NbrHeurs Integer indiquant le nombre d'heures enseignées par le professeur.
		 * @return Float indiquant le salaire calculé.
		 */
		public Float calculeSalaire(Integer NbrHeurs) 
		{
			float result =  (NbrHeurs > 32) ? (NbrHeurs - 32) * 600 * 0.83f + 400 * 32 * 0.66f + 5000 : NbrHeurs * 400 * 0.66f + 5000;
			return result;

		}
		
		/**
		 * calcul du salaire en se basons sur les heures enseignées établies 
		 * à partir de la somme des durées des modules
		 * @return : Float(salaire)
		 */
		public Float calculeSalaire()
		{ 
			Integer NbrHeurs = this.getNumberHours();
			float result =  (NbrHeurs > 32) ? (NbrHeurs - 32) * 600 * 0.83f + 400 * 32 * 0.66f + 5000 : NbrHeurs * 400 * 0.66f + 5000;
			return result;

		}
		
		/**
		 * méthode qui permet de calculerle nombre de jours de vacances, en se basons sur le nombre des jours travallés
		 * @param : nombre de jours de travail
		 * @return : nombre de jours de vacances
		 */
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
			System.out.println("grade :" + this.grade );
			System.out.println("il enseigne les modules\t" + this.modules[0].getLibelle() + ", " + this.modules[1].getLibelle() + ", " + this.modules[2].getLibelle() + " et "
					+ this.modules[3].getLibelle()		);
			
		}
		
		/**
		 * méthode utilitaire pour extraire le nombre d'heures enseignées par le professeur
		 * @return Integer : nombre d'heures ensign"es par cette instance .
		 */
		private Integer getNumberHours()
		{   Integer Numberhours = 0;
			for(Module module : this.modules)
			{
				Numberhours += module.getNbrHeures();
			}
			return Numberhours;
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
			result = prime * result + ((grade == null) ? 0 : grade.hashCode());
			result = prime * result + Arrays.hashCode(modules);
			result = prime * result + ((nummerSomme == null) ? 0 : nummerSomme.hashCode());
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
			Professeur other = (Professeur) obj;
			if (grade == null) {
				if (other.grade != null)
					return false;
			} else if (!grade.equals(other.grade))
				return false;
			if (!Arrays.equals(modules, other.modules))
				return false;
			if (nummerSomme == null) {
				if (other.nummerSomme != null)
					return false;
			} else if (!nummerSomme.equals(other.nummerSomme))
				return false;
			return true;
		}
		
		/*
		 * redéfinition de toString de Object
		 * (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Professeur [nummerSomme=" + nummerSomme + ", grade=" + grade + ", modules="
					+ Arrays.toString(modules) + "]";
		}
		
		
		
		

	}



