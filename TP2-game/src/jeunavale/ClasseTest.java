package jeunavale;

import java.util.Scanner;

public class ClasseTest {
	public static Scanner input = new Scanner(System.in);
			public static void main(String[] args) {
	
	//test de case
						Bateau bateau1 = new Bateau(1);
						Bateau bateau2 = new Bateau(2);
						Bateau bateau3 = new Bateau(3);
					
						bateau1.ajouteCase(new Case());
						bateau2.ajouteCase(new Case());bateau2.ajouteCase(new Case());
						bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());
						
	
						
	
	//  bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());bateau3.ajouteCase(new Case());
	  
	  bateau2.getCases()[0].etat = true;
	// System.out.println(bateau2.estCoule());
		
						Bateau[] bateaux = {bateau1, bateau2,bateau3};
	//bateau.ajouteCase(new Case());
						JeurOrdi	gamer = new JeurOrdi();
	            System.out.println(gamer.nom);
	gamer.setBateaux(bateaux);
	gamer.placementBateaux();
	//gamer.placementBateaux();
	//gamer.placementBateaux();
	//gamer.getGrille().afficheTirs();
	gamer.getGrille().affiche();
	
	//System.out.println(gamer.getBateaux()[1].horizontal);
	
	
	
	
			
  
	
	

	}

}
