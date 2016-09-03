package com.domduf.exo2_2_2Bibliotheque;

public class Biblio {
	
	//variables instances de classe
	String nomBib;
	Livre[] livres;
	
	/**
	 * 
	 * @param nom (nom de la bibliothèque)
	 * @param nbLivres (le nombre de livres)
	 */
	public Biblio(String nom, int nbLivres){
		
		nomBib = nom;
		livres = new Livre[nbLivres];
		for (int i=0; i< nbLivres ; i++){
			livres[i]=new Livre();
		}
	}
	
	public void afficherLivres(){
		
		Terminal.sautDeLigne();
		Terminal.ecrireStringln("Cette bibliothèque \""+nomBib+"\" contient "+livres.length+" livres:");
		Terminal.sautDeLigne();
		
		for (int i=0; i< livres.length ; i++){
			livres[i].afficher();
		}
	}
	


}
