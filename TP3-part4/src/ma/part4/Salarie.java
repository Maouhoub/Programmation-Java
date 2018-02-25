package ma.part4;
/**
 * interface : Salarie
 * @author MUSTAPHA
 *
 */
public interface Salarie 
{
	/**
	 * prototype de la methode calculeSalaire : calculer le salire
	 * @param NbrHeurs : Integer désignat le nombre d'heures travaillées 
	 * @return : Float salaire correspondant
	 */
	Float calculeSalaire(Integer NbrHeurs) ;
	
	/**
	 * 
	 * @param Nbrjours : Integer désignat le nombre de jours travaillées.
	 * @return : Integer nombre d'heures de vacances.
	 */
	Float calculeVacances(Integer Nbrjours);

}
