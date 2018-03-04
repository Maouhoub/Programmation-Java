package jeunavale;

public class Croiseur extends Bateau
{
	public Croiseur()
	{
		super(3);
		this.Symbole = "C";
	}
	
	public  String getSymbole() 
	{
		return this.Symbole;
	}
    public void ajouteCase(Case c)
    {
		int ajoutee = 0;
		for(int i = 0; i < this.cases.length; i++)
		{
			if(this.cases[i] == null) 
		
				{
					this.cases[i] = c;
					System.out.println("Ajoutee");
					c.setBateau(this);
					ajoutee = 1;
					break;
				}
		}
		if(ajoutee == 0) System.out.println("Pas de place!");
		
		
		
	}
}
