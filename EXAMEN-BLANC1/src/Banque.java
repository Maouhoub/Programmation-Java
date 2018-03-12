import java.util.HashMap;
import java.util.Iterator;



/**
 * Cette classe représente une banque 
 * @author   HAFIDI IMAD
 */
public class Banque {
	/**
	 * Liste des clients, la clé est le numéro du client
	 */
	public HashMap<Integer, Client> mesClients = new HashMap<Integer, Client>();
	/**
	 * Nom de la banque
	 */
	private String nom;
	
	/**
	 * La méthode respecte les régles suivantes :
	 * 1-Le client ne doit pas exister 
	 * 2-Le numéro du client est généré automatiquement ( dernier numéro +1)
	 * @param nom
	 * @param prenom
	 * @param age
	 * @return false : si le client n'est pas ajouté
	 */
	public boolean addClient(String nom,String prenom, Integer age){
		Client cl = new Client(nom, prenom, age);
		
		 if( this.mesClients.containsValue(cl) )
			return false;
		else 
			{
			this.mesClients.put(this.mesClients.size() , cl);
			return true;
			}
	
	}
	/**
	 * La méthode ajoute un compte et l'attribue à un client
	 * @param client
	 * @param typeCompte
	 * @return false : si le compte n'est pas crée
	 */
	public boolean addCompte(Client client, String typeCompte)
	{
		if(typeCompte.equals("courant"))
			{client.mesComptes.add(new CompteCourant(client.mesComptes.size(),(float)22, (float)-2 ));
			 return true;
			
			}
		else if(typeCompte.equals("epargne"))
			{
			client.mesComptes.add(new CompteEpargne(client.mesComptes.size(),(float) 22));
			return true;
			}
		else
			return false;
			
			
		
	}
	/**
	 * La méthode supprime un client si seulement si le solde de tous ses comptes 
	 * est zéro
	 * @param client
	 * @return false si le client est supprimé
	 */
	public boolean removeClient(Client client) {
		float somme = 0.0f;
		for(Compte compte : client.mesComptes)
			somme += compte.getSolde();
		if (somme == 0) this.mesClients.remove(client);
		return false;
	}
	/**
	 * Cette méthode affiche les relvés bancaires d'un client pour une date précise(05/14)
	 * @param id
	 */
	public void afficheTousComptesClient(Integer id, String mois, String année)
	{
		this.mesClients.
		
	}

}
