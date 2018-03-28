package tp;

public class Arret 
{
	private Sommet ExtUn, ExtDeux;
	private double cout;
	
	public Arret(Sommet extUn, Sommet extDeux, double cout) {
		ExtUn = extUn;
		ExtDeux = extDeux;
		this.cout = cout;
	}
	
	public Arret() 
	{
		
	}

	public Sommet getExtUn() {
		return ExtUn;
	}

	public void setExtUn(Sommet extUn) {
		ExtUn = extUn;
	}

	public Sommet getExtDeux() {
		return ExtDeux;
	}

	public void setExtDeux(Sommet extDeux) {
		ExtDeux = extDeux;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}

	@Override
	public String toString() {
		return "Arret [ExtUn=" + ExtUn.getNumero() + ", ExtDeux=" + ExtDeux.getNumero() + ", cout=" + cout + "]";
	}
	
	
	
	
	
	
	
	
	

}
