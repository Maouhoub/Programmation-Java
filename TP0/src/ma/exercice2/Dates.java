package ma.exercice2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * classe Dates : permet d'exprimer les dates sous differents formats
 * @author MUSTAPHA
 *
 */

public class Dates 
{
	public static void main(String[] args)
	{   //première méthode :
		System.out.println("Première méthode : ");
		System.out.println("le nombre de milliseconds depuis le début de 1970,\njusqu'a maintenant  est : " +System.currentTimeMillis());
		//dans une première exécution : 1518959551702 après le passage d'une minute : 1518959597899 différence = 46197 ms
		
		for(int i = 0; i < 3; ++i) System.out.println();
		
		//deuxième méthode :
		System.out.println("deuxième méthode");
		Date date = new Date(2018, 2, 17);
		System.out.println(date);
		
		for(int i = 0; i < 3; ++i) System.out.println(); 
		
		//troisieme méthode :
		System.out.println("troisieme méthode");
		Calendar agenda = Calendar.getInstance();
		
	    
		String[] jours = {"Dimanche", "Lundi", "Mardi", "Mercredi", "jeudi", "Vendredi", "Samedi", "Dimanche" };
		String[] mois = {"Janvier", "Fevrier", "mars", "avril", "may", "juin", "juillet", "aout", "septembre", "october", "november", "decembre" };
		
		System.out.print("Aujourdhui c'est : "+jours[agenda.get(Calendar.DAY_OF_WEEK)]+" le " + agenda.get(Calendar.DAY_OF_WEEK));
		System.out.println(" " + mois[agenda.get(Calendar.MONTH)] + " " + agenda.get(Calendar.YEAR) )  ;
		
		for(int i = 0; i < 3; ++i) System.out.println();
		
		
		//quatrieme méthode :
		System.out.println("quatrieme méthode");
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd MMMMM yyyy HH:mm"); 
		System.out.println("maintenant: " + f.format(d));
	}

}
