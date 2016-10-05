package com.domduf.exo6_2_1Objet;

public class LaPersonne {

	// variables d'instance
	LaDate naissance; // objet type LaDate
	String nom;

	//

	// constructeur
	public LaPersonne(String name, LaDate naiss) {
		this.nom = name;
		this.naissance = naiss;
	}

	public void ecrire() {
		Terminal.ecrireString(nom + " (");
		naissance.ecrire();
		Terminal.ecrireStringln(")");
	}
}
