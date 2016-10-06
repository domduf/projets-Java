package com.domduf.exo6_1_3Objet;

public class Commercial extends Employe {

	// var instance
	double venteMois;
	static double interressementVentes = 0.045;

	// constructeur
	public Commercial(String n, double i, double v) {
		super(n, i);
		this.venteMois = v;
	}

	// setter ventes;
	public void setVenteMois(double ventesMois) {
		this.venteMois = ventesMois;
		Terminal.ecrireStringln("Merci, les ventes de " + this.nom + "("
				+ this.matricule + ") sont de " + this.venteMois
				+ "€ ce mois ci.");
	}

	// redefinition du salaire
	protected double salaireNet() {

		return (salaireGeneral * this.indice + interressementVentes
				* this.venteMois);
	}

	public double afficheSalaire() {
		Terminal.ecrireStringln(this.nom + "(" + this.matricule
				+ ") a un salaire net de " + this.salaireNet() + "€\n"
				+ "+++ son interressement aux ventes de ce mois ("+(interressementVentes*100)+"% de " 
				+ this.venteMois + "€) est de "
				+ (interressementVentes * this.venteMois) + "€");
		return this.salaireNet();
	}

}
