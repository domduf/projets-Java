package com.domduf.examAnnaleSession2016Exo4;

public class Carnassier extends Carnivore implements Nourriture{
	
	public Carnassier(String n){
		super (n);
		Terminal.ecrireStringln(", et carnassier");
		
	}	
	
	public void mange(Nourriture n) {

		if (!n.disTonStatut()){
		Terminal.ecrireString(this.nom+" mange ");
		n.disTonNom();
		n.estMangéPar(this);	
		}else Terminal.ecrireStringln("un carnassier ne mange que la viande pourrie...");
		
	}

}
