package com.domduf.examAnnaleSession2016Exo4;

public class Herbivore extends Animal implements Nourriture, Predateur{
	
	// constructeur
	public Herbivore(String n) {
		super(n);
		Terminal.ecrireStringln(", je suis un herbivore");
	}
		
	public void mange(Nourriture n){
		
		if (AuMenu.peutManger(this, n)){
			Terminal.ecrireStringln(n.getClass().getSimpleName());
		}
		
		
		
	}
	
	
	@Override
	public void estMangéPar(Predateur p) {
		this.statut=false;
		
	}

}
