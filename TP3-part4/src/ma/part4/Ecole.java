package ma.part4;

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
Module a = (Module)prof.getObject(2);
/*System.out.println(a.getLibelle());
prof.afficher();*/
Etudiant etud = new Etudiant("Mustapha", 27, "ksmaouhoubetud@gmail.com", modulesE);
 Object mod = etud.getObject(0);
 System.out.println(mod.toString());
//etud.addObject(new Module("cs42", 7, 87), 1);
//etud.afficher();
//System.out.println("\n\n********************test etudiant");
//System.out.println("\t\n" + etud.removeObject(new Module("cs10a", 3, 45), 1));
//etud.afficher();
//System.out.println("\t\n" + etud.removeObject(new Module("cs10a", 3, 45), 0));
//etud.afficher();
//Personne perso = prof;
//System.out.println("\n\n " + (prof instanceof Professeur));
Doctorant doctorant = new Doctorant();
doctorant.setEmail("ksmaouhoub@gmail.com");
doctorant.setEncadrant(prof);
doctorant.setNom("heloo");
doctorant.setNummerEtudiant(22);
doctorant.setSujetThese("hiii");
doctorant.setModules(modulesE);

Departement departement = new Departement();
departement.setChefDepartement(prof);
departement.setNom("kali");
departement.membre = new Personne[2];
departement.membre[0] = prof; departement.membre[1] = doctorant;
System.out.println("test de l'operation removeObject .");
Personne w = (Personne)departement.getObject(1);
System.out.println(w.toString());

//departement.removeObject(prof, 0);
//System.out.println("\t" + departement.getObject(0)); System.out.println("\t" + departement.getObject(0));
//il faut indiquer le nombre des heures que travaille le doctorant
//System.out.println("\n" + prof.calculeSalaire());
//System.out.println(doctorant.calculeSalaire(12));
//System.out.println(departement.calculMasseSalarial(12));

System.out.println("wohow test filiere\n");
Filiere filiere = new Filiere();
filiere.setChefSection(prof);
filiere.setNumeroSection(12);
Etudiant[] etudiants = {new Etudiant("ali", 12, "khh", modulesE), etud};
filiere.setEtudiants(etudiants);
filiere.addObject(etud, 0);
System.out.println(filiere.getObject(0));
Object etudiant = filiere.getObject(1);
System.out.println(etudiant);


	}
	
}
