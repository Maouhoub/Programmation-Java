package jeunavale;

import java.util.*;
public class JeurOrdi extends Joueur
{
	public JeurOrdi()
	{
		super("Ordinateur");
		
	}
	@Override
	public  void placementBateaux()
	{
		Random rand = new Random();
		for(Bateau bateau : this.bateaux)
		{
			
		    //System.out.println("entrer l'abscisse et l'ordonnée de la tete de votre bateau dans la grille");
		    int x = rand.nextInt(Grille.NB_LIGNES);
		    int y = rand.nextInt(Grille.NB_COLONNES);
		   
		    this.grille.getGrille()[x][y] = bateau.getCases()[0];
		    bateau.horizontal = rand.nextBoolean();
		    if(bateau.horizontal)
		    {
		    	if(bateau.getTaille() <= Math.min(y, 10 - y ))
		    	{
		    		//System.out.print("Choix soit à droite soit à gauche!");
		    		this.orieterManH(bateau, x, y);
		    		//this.testMethod(bateau);
		    	}
		    	else
		    	{
		    		if(y == Math.min(y, 10-y))
		    		{
		    			this.placerAdroite(bateau, x, y);
		    			//this.testMethod(bateau);
		    			//System.out.println("placer à droite");
		    		}
		    		else
		    		{	
		    			
		    			System.out.println("placer à gauche");
		    			this.placerAgauche(bateau, x, y);
		    			//this.testMethod(bateau);
		    			
		    		}
		    	}
		    	
		    }
		    else
		    {
		    	if(bateau.getTaille() <= Math.min(x, 10 - x ))
		    	{
		    		//System.out.print("Choix soit vers le haut/bas!");
		    		  this.orieterManV(bateau, x, y);
		    		  //this.testMethod(bateau);
		    	}
		    	else
		    	{
		    		if(x == Math.min(x, 10-x))
		    		{
		    			this.placerVersBas(bateau, x, y);
		    			//this.testMethod(bateau);
		    			//System.out.println("soit vers le bas!");
		    		}
		    		else
		    		{	
		    			
		    			//System.out.println("placer vers le haut");
		    			 this.placerVersHaut(bateau, x, y);
		    			// this.testMethod(bateau);
		    			
		    		}
		    	}
		    	
		    }
		}
		     
	}
	private void orieterManH(Bateau bateau, int x, int y)
	{   
		Random rand = new Random();
		//System.out.println("Entrer 1 ou 2 pour orienter le bateau  :\n1 vers la gauche \n2 vers la droite");
		int choixOrientation = rand.nextInt(2);
		
		if(choixOrientation == 1)
				this.placerAgauche(bateau, x, y);
		else if (choixOrientation == 2)
				this.placerAdroite(bateau, x, y);
		else this.orieterManH(bateau, x, y);
	}
	private void orieterManV(Bateau bateau,int x, int y)
	{   Random rand = new Random();
		//System.out.println("Entrer 1 ou 2 pour orienter le bateau  :\n1 vers le bas \n2 vers le haut");
		int choixOrientation = rand.nextInt(2);
		
		if(choixOrientation == 1)
				this.placerVersBas(bateau, x, y);
		else if (choixOrientation == 2)
				this.placerVersHaut(bateau, x, y);
		else this.orieterManV(bateau,x,y);
		
	}
	
	@Override
	public void tir(Grille grille)
	{
		Random input = new Random();
		int x = input.nextInt(Grille.NB_LIGNES), y = input.nextInt(Grille.NB_COLONNES);
		Case c = grille.getGrille()[x][y];
		boolean r = c.etat;
		if(!r) c.etat = !r;
	}
	
	
}
