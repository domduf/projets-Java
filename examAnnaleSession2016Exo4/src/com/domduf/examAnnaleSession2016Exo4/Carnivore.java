package com.domduf.examAnnaleSession2016Exo4;

public class Carnivore extends Animal implements Nourriture, Predateur {

	

	// constructeur
	public Carnivore(String n) {
		super(n);
		Terminal.ecrireStringln(", je suis un carnivore");
	
	}
	
	public Carnivore(){
		Terminal.ecrireStringln(", je suis un carnivore");
	}

	
	public void mange(Nourriture n) {

		Terminal.ecrireString(this.nom+" mange ");
		n.disTonNom();
		n.estMangéPar(this);
		
		
	}


	public void estMangéPar(Predateur p) {
		if (p.getClass().getName().contains("Carnassier")){
			Terminal.ecrireStringln("mangé par un Carnassier...");
		}
		else if (p.getClass().getName().contains("Carnassier") &
				statut==false){
			Terminal.ecrireStringln("mangé DEAD par un Carnassier...");
			
		}
		this.statut=false;
		
	}

}
