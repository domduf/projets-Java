package com.domduf.examAnnaleSession2016Exo4;

public class Carnivore implements Animal, Nourriture {

	String nom;

	// constructeur
	public Carnivore(String n) {
		this.nom = n;
		Terminal.ecrireStringln("création d'un carnivore du nom de " + this.nom);
	}

	public void mange(Nourriture n) {

	}

	public int statut() {
		return 0;
	}

	public void estMangéPar(Animal a) {
		
		

	}

}
