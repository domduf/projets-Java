package com.domduf.exo2_2_2Bibliotheque;

public class mainBibliotheque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Livre totoHero = new Livre();
		totoHero.afficher();
		
		Livre a= new Livre();
		a.afficher();
		*/
		
		Biblio nouvelle= new Biblio("petite", 3);
		Biblio vieille= new Biblio("grande",5);
		
		//test de remplissage de chaque bibliotheque
		for (int i=0; i<=6; i++){
			
			//affichage des livres de chaque bibliotheque
			nouvelle.afficherLivres();
			vieille.afficherLivres();
			
			//ajout d'un livre dans chaque bib, jusque plus soif
			nouvelle.ajouterLivre();
			vieille.ajouterLivre();
			
			Terminal.ecrireStringln("-------------------------------------------------");
		}
		
		
	}

}
