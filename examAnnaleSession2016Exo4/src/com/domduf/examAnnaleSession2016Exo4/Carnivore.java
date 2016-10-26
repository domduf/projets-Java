package com.domduf.examAnnaleSession2016Exo4;

public class Carnivore extends Animal implements Nourriture {

	

	// constructeur
	public Carnivore(String n) {
		super(n);
		Terminal.ecrireStringln(", je suis un carnivore");
	
	}

	/*
	public void mange(Nourriture n) {
		
		
	}*/



	public void estMangéPar(Predateur p) {
		this.statut=false;

	}

}
