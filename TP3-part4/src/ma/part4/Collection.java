package ma.part4;
/**
 * interface : Collection
 * contient des méthodes pour ajouter, supprimer et vérifier l'existence d'un objet
 * dans un champ tableau de la classe implémentant cette interface
 * @author MUSTAPHA
 *
 */
public interface Collection 
{

	/**
	 * permet d'ajouter l'objet o dans l'emplacement(indice) i si c'est ce dernier est valable.
	 * @param o : objet à ajouter 
	 * @param i : indice ou ajouter l'objet
	 * @return : boolean pour indiquer le succes ou l'echec de l'operation d'ajout
	 */
	Boolean addObject(Object o, int i);
	Boolean removeObject(Object o, int i);
	Object getObject(int i);


}
