package com.domduf.examAnnaleSession2016Exo4;

public class Herbivore extends Animal implements Nourriture{
	
	// constructeur
	public Herbivore(String n) {
		super(n);
		Terminal.ecrireStringln(", je suis un herbivore");
	}
		
	
	@Override
	public void estMangéPar(Predateur p) {
		this.statut=false;
		
	}

}
