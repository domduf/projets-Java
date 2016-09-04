package com.domduf.exo2_2_2Bibliotheque;

public class Biblio {
	
	//variables instances de classe
	String nomBib;
	Livre[] livres;
	int nbLivresBib=0;
	
	/**
	 * 
	 * @param nom
	 * @param nbLivresMax
	 */
	public Biblio(String nom, int nbLivresMax){
		
		nomBib = nom;
		livres = new Livre[nbLivresMax];
		
	}
	
	public void ajouterLivre(){
		Terminal.ecrireStringln("Bibliothèque: "+this.nomBib);
		if (nbLivresBib < this.livres.length){
			livres[nbLivresBib]=new Livre();
			nbLivresBib=nbLivresBib+1;
		}
		else {
			Terminal.ecrireStringln("La bibliotheque est pleine à craquer, désolé.");
			//afficherLivres();
			}
		}
		
		
	
	
	
	public void afficherLivres(){
		
		Terminal.sautDeLigne();
		Terminal.ecrireStringln("Cette bibliothèque \""+nomBib+"\" (capacité "+livres.length+" livres) contient:");
		Terminal.sautDeLigne();
		
		if (nbLivresBib==0){
			Terminal.ecrireStringln("aucun livre pour l'instant");
			}
		
		for (int i=0; i< this.nbLivresBib ; i++){
			livres[i].afficher();
		}
	}
	


}
