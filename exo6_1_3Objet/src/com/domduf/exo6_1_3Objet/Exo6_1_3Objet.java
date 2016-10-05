package com.domduf.exo6_1_3Objet;

public class Exo6_1_3Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salarie dom, soph;

		dom = new Salarie();
		soph = new Salarie("Sophie THOUVENIN",2.5);
		Terminal.ecrireStringln("matricule :" + dom.matricule);
		Terminal.ecrireStringln("matricule :" + soph.matricule);
		dom.afficheSalaire();
		soph.afficheSalaire();

	}

}
