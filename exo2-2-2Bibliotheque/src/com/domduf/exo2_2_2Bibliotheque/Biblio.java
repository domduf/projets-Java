package com.domduf.exo2_2_2Bibliotheque;

public class Biblio {
	
	//variables instances de classe
	String nomBib;
	Livre[] livres;
	
	public Biblio(String nom, int nbLivres){
		
		nomBib = nom;
		livres = new Livre[nbLivres];
		for (int i=0; i< nbLivres ; i++){
			livres[i]=new Livre();
		}
	}
	
	public void afficherLivres(){
		
		Terminal.ecrireStringln("Cette bibliothèque contient "+livres.length+" livres:");
		
		for (int i=0; i< livres.length ; i++){
			livres[i].afficher();
		}
	}
	


}
