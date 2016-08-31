package com.domduf.exo2_2_2Bibliotheque;

public class Livre {
	
	//variables instances de classe
	String titre;
	String nomAuteur;
	String editeur;
	
	//constructeur
	public Livre(){
		Terminal.ecrireStringln("Entrez le titre");
		titre=Terminal.lireString();
		Terminal.ecrireStringln("Entrez le NOM de l'auteur");
		nomAuteur=Terminal.lireString();
		Terminal.ecrireStringln("Entrez le Nom de l'éditeur");
		editeur=Terminal.lireString();
	}
	
	//methode d instance
	public void afficher(){
		Terminal.ecrireStringln("Titre du livre: \""+this.titre+"\"");
		Terminal.ecrireStringln("AUTEUR: "+this.nomAuteur);
		Terminal.ecrireStringln("Editeur: "+this.editeur);
		
	}
	
	
	

}
