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
	
	
	/**
	 * permet de supprimer l'objet o dans l'emplacement(indice) i si c'est ce dernier est valable.
	 *et l'objet o est égale(egalité par equals redéfinie dans o.getClass.getName()).
	 * @param o : objet potentiel de la case d'indice i
	 * @param i : indice ou supprimer l'objet
	 * @return : boolean pour indiquer le succes ou l'echec de l'operation d'ajout
	 */
	Boolean removeObject(Object o, int i);
	
	/**
	 *récupérer l'objet d'indice i si cet indice est valable.
	 *@param i : indice de l'element à récupérer.
	 *@return : instance de Object .
	 */
	Object getObject(int i);


}
