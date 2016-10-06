package com.domduf.exo6_1_3Objet;

public class Entreprise {

	Employe[] tabEmployes;
	String nomEntreprise;
	double totalSalaire;

	public Entreprise(String n, Employe[] t) {
		this.nomEntreprise = n;
		this.tabEmployes = t;
	}

	private void totauxSalaires() {
		double calcul = 0.0;
		for (int i = 0; i < this.tabEmployes.length; i++) {
			calcul = calcul + this.tabEmployes[i].salaireNet();
		}
		this.totalSalaire = calcul;

	}

	public void afficheSalaireEmployesTOTAUX() {

		totauxSalaires();
		Terminal.ecrireStringln("La somme des salaires versés chez \""
				+ this.nomEntreprise + "\" est de " + this.totalSalaire + "€");

	}
	
	public void afficheSalaries(){
		Terminal.ecrireStringln("Voici le tableau des salariés de l'entreprise \""+this.nomEntreprise+"\":");
		for (int i = 0; i < this.tabEmployes.length; i++) {
			Terminal.ecrireStringln("-- "+(i+1)+"-- salaire:\t "+this.tabEmployes[i].salaireNet()+"€\t"+this.tabEmployes[i].nom);
		}
	}

}
