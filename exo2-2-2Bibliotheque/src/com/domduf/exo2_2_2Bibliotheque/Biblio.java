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
	
	/**
	 * ajoute un livre à la bibliotheque
	 */
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
		
		
	
	
	/**
	 * affiche le contenu de la bibliotheque
	 */
	public void afficherLivres(){
		
		Terminal.sautDeLigne();
		Terminal.ecrireStringln("Cette bibliothèque \""+nomBib+
				"\" (capacité "+livres.length+" livres) contient "+nbLivresBib+" livre(s):");
		Terminal.sautDeLigne();
		
		if (nbLivresBib==0){
			Terminal.ecrireStringln("aucun livre pour l'instant");
			Terminal.sautDeLigne();
			}
		
		for (int i=0; i< this.nbLivresBib ; i++){
			livres[i].afficher();
		}
	}
	


}
