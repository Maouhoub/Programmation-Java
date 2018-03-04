package jeunavale;

import java.util.Scanner;

public class ClasseTest {
	public static Scanner input = new Scanner(System.in);
			public static void main(String[] args) {
	
	//test de case
						Croiseur bateau1 = new Croiseur();
						PorteAvion bateau2 = new PorteAvion();
						Destroyer bateau3 = new Destroyer();
					
						bateau1.ajouteCase(new Case());	bateau1.ajouteCase(new Case());	bateau1.ajouteCase(new Case());	bateau1.ajouteCase(new Case());
						bateau2.ajouteCase(new Case());bateau2.ajouteCase(new Case());
						bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());
						
	
						
	
	//  bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());
	  
	 // bateau2.getCases()[0].etat = true;
	// System.out.println(bateau2.estCoule());
		
						Bateau[] bateaux = {bateau3, bateau2, bateau1};
						Bateau[] bateaux2 = {bateau1, bateau2, bateau3};
	//bateau.ajouteCase(new Case());
						JeurOrdi gamerO = new JeurOrdi();
						Joueur gamer2 = new Joueur("a");
						
	           // System.out.println(gamer.nom);
	gamerO.setBateaux(bateaux);
	//gamer2.setBateaux(bateaux2);
	
	gamerO.placementBateaux();
	//gamer.tir(gamer2.getGrille());
	gamerO.getGrille().affiche();

	
	
	
	
			
  
	
	

	}

}
