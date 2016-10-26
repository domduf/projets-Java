package com.domduf.examAnnaleSession2016Exo4;

public class Carnivore extends Animal implements Nourriture, Predateur {

	

	// constructeur
	public Carnivore(String n) {
		super(n);
		Terminal.ecrireStringln(", je suis un carnivore");
	
	}

	
	public void mange(Nourriture n) {

		Terminal.ecrireString(this.nom+" mange ");
		n.disTonNom();
		n.estMangéPar(this);
		
		
	}


	public void estMangéPar(Predateur p) {
		this.statut=false;

	}

}
