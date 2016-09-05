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
		
		Biblio nouvelle= new Biblio("Neuville", 3);
		Biblio vieille= new Biblio("Orléans",5);
		
		//test de remplissage de chaque bibliotheque avec 6 livres
		for (int i=0; i<6; i++){
			Terminal.ecrireStringln("---------------------Tour "+(i+1)+"------------------");			
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
