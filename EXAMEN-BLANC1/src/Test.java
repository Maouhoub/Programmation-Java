
public class Test {

	public static void main(String[] args) {
		Client cl = new Client("hamid", "hamoda", 22);
		Banque b = new Banque();
		System.out.println(b.addClient("hamid", "hamoda", 22));
		b.removeClient(cl);
		System.out.print(b.mesClients);
		
		
		
		

	}

}
