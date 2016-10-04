package com.domduf.exo6_2_1Objet;

public class LaPersonneLieu extends LaPersonne {

	LeLieu lieuNaissance;

	public LaPersonneLieu(String name, LaDate naiss, LeLieu l) {
		super(name, naiss);
		this.lieuNaissance = l;
	}

	public void ecrire() {
		Terminal.ecrireString(nom + " (");
		naissance.ecrire();
		Terminal.ecrireStringln(")\n " + "Né(e) à ");
		this.lieuNaissance.afficher();
	}

}
