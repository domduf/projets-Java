package com.domduf.examAnnaleSession2016Exo4;

public class Animal implements Predateur, Nourriture {

	String nom;

	boolean statut;

	public Animal() {
		this.nom = "inconnu";
		this.statut = true;
		Terminal.ecrireStringln("création d'un animal du nom de " + this.nom);
	}

	public Animal(String n) {
		this.nom = n;
		this.statut = true;
		Terminal.ecrireStringln("==========================================");
		Terminal.ecrireString("création d'un animal du nom de " + this.nom);
	}

	public boolean disTonStatut(){
		return this.statut;
	}
	
	public void statut() {

		Terminal.ecrireString("moi "+ this.nom);
		if (this.statut) {
			Terminal.ecrireStringln("---------------je suis VIVANT");
		} else {
			Terminal.ecrireStringln("+++++++++++++++ I'm DEAD");
		}

	}

	public void disTonNom(){
		Terminal.ecrireStringln(""+this.nom);
	}
	
	
	public void mange(Nourriture n) {

		Terminal.ecrireString(this.nom+" mange ");
		n.disTonNom();
		n.estMangéPar(this);
	
	}
	
	public void estMangéPar(Predateur p){
		Terminal.ecrireStringln(this.nom+ "est mangé");
		
	}
	
	public void recoitMessageMort(){
		this.statut=false;
	}

}
