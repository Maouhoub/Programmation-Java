package ma.tp2;
/**
 * classe ecole : classe principale
 * @author MUSTAPHA
 *
 */
public class Ecole 
{
   /**
    * Methode executable qui lance une nouvelle partie.
    * @param args : args Les parametres de la ligne de commande.
    */
	public static void main(String[] args)
	{
	//	Etudiant eleve = new Etudiant("ahmed", 22, "ksmao");
		//eleve.afficher();
		/* prof = new Professeur("hind", 14, "ksmaouhoub@gmail.com", "3emme");
		prof.afficher();
		Module mod = new Module("classeAAb", 3, 50, prof);
		mod.afficher();
		*/
		//eleve.setEmail("ksmaouhoub@gmail.com");
		//eleve.afficher();
		//Doctorant test = new Doctorant();
		//System.out.println(test.calculeSalaire(32));
		Professeur prof = new Professeur("ahmrd", 22, "ksma@gmail.com", "hello");
		prof.afficher();
		System.out.println("le salaire de " + prof.getNom() +  " est  : " + prof.calculeSalaire(32));
		System.out.println("nombre de jours de vacances de " + prof.getNom() + "est : " + prof.calculeVacances(47));
		prof.afficher();
	}

}
