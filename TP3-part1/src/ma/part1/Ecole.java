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
Module[] modulesP = {new Module("cs10a", 3, 45), new Module("cs10b", 4, 50), new Module("cs142", 5, 60), new Module("cs45", 2, 35)  };
Module[] modulesE = {new Module("cs10a", 3, 45), new Module("cs10b", 4, 50), new Module("cs142", 5, 60), new Module("cs14l", 4, 60), new Module("cs147", 5, 60), new Module("cs42", 5, 70) };		
	
Professeur prof = new Professeur("ahmed", 14, "ksmaouhoub@gmail.com", "deuxieme echelle", modulesP);

prof.afficher();
Etudiant etud = new Etudiant("Mustapha", 27, "ksmaouhoubetud@gmail.com", modulesE);
etud.afficher();
	
	}
	
}
