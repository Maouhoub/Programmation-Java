package tp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sommet 
{
	private int numero;
	
	private List<Arret> voisinage ;
	
	public Sommet(int numero, int nombreArret) 
	{
		this.numero = numero;
		this.voisinage = new ArrayList<Arret>(nombreArret);
		
		for(int i = 0; i < nombreArret; i++)
		{	
			Arret arret = new Arret();
			arret.setExtUn(this);
			//source stackOverflow.
			double cout = new BigDecimal(new Random().nextDouble()*100 + 1).setScale(2, RoundingMode.HALF_UP).doubleValue();
			
			arret.setCout(cout);
			
			this.voisinage.add(arret);
			
		}
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Arret> getVoisinage() {
		return voisinage;
	}

	public void setVoisinage(List<Arret> voisinage) {
		this.voisinage = voisinage;
	}

	
	
	
	

}
