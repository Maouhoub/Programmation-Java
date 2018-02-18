package ma.part1;
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
		Etudiant eleve = new Etudiant("ahmed", 22, "ksmao");
		eleve.afficher();
		/* prof = new Professeur("hind", 14, "ksmaouhoub@gmail.com", "3emme");
		prof.afficher();
		Module mod = new Module("classeAAb", 3, 50, prof);
		mod.afficher();
		*/
		eleve.setEmail("ksmaouhoub@gmail.com");
		eleve.afficher();
	}

}
