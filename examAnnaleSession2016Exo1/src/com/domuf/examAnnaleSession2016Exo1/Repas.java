package com.domuf.examAnnaleSession2016Exo1;

public class Repas {

	String nom;
	Plat entree;
	Plat principal;
	Plat dessert;
	TypeRepas typeRepas;

	/**
	 * constructeur de repas complet
	 * 
	 * @param n
	 *            nom du repas
	 * @param e
	 *            entree
	 * @param p
	 *            plat
	 * @param d
	 *            dessert
	 */
	public Repas(String n, Plat e, Plat p, Plat d) {
		if (e.type != Type.entree || p.type != Type.principal
				|| d.type != Type.dessert) {
			Terminal.ecrireStringln("Votre " + n + " est vraiment nul...");
			Terminal.ecrireStringln("Un des plat ne correspond pas à un équilibre indispensable à la santé...");
		} else {
			this.nom = n;
			this.entree = e;

			this.principal = p;

			this.dessert = d;

			this.typeRepas = TypeRepas.complet;

			Terminal.ecrireStringln("Votre repas complet est enregistré.\n  Merci.");
		}
	}

	/**
	 * repas avec deux choix dont un repas principal
	 * 
	 * @param n
	 *            nom
	 * @param p1
	 *            plat 1
	 * @param p2
	 *            plat 2
	 */
	public Repas(String n, Plat p1, Plat p2) {// repas rapide
		if (p1.type == Type.entree & p2.type == Type.principal) {
			this.nom = n;
			this.entree = p1;
			this.principal = p2;
			this.typeRepas = TypeRepas.entreePlat;
			Terminal.ecrireStringln("Votre repas rapide est enregistré.\n  Merci.");
		} else if (p1.type == Type.principal & p2.type == Type.dessert) {
			this.nom = n;
			this.principal = p1;
			this.dessert = p2;
			this.typeRepas = TypeRepas.platDessert;
			Terminal.ecrireStringln("Votre repas rapide est enregistré.\n  Merci.");

		} else {
			Terminal.ecrireStringln("Votre " + n
					+ " n'est pas compatible RAPIDE...");
			Terminal.ecrireStringln("Un des plat ne correspond pas.");
		}

	}

	public void afficheMenu() {

		if (this.typeRepas == TypeRepas.complet) {
			try {
				this.entree.afficherPlat();
				this.principal.afficherPlat();
				this.dessert.afficherPlat();
				Terminal.ecrireStringln("-----6969696969696969696969696969----");
				Terminal.ecrireStringln("   Nom du repas "
						+ this.typeRepas.name() + ": " + this.nom);
			} catch (Exception e) {
				Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");
				Terminal.ecrireStringln("Votre repas n'est pas enregistré");
				Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");

			}
		}

	}

	public void afficheAddition() {
		Terminal.ecrireStringln("                               __________");
		Terminal.ecrireStringln("ADDITION net:\t\t\t" + this.calculAddition()
				+ " €uros");
	}

	public double calculAddition() {

		double addition = 0;

		if (this.typeRepas == TypeRepas.complet) {//reduction de 10%
			addition = (this.entree.prix + this.principal.prix
					+ this.dessert.prix)*0.9;
		}

		else if (this.typeRepas == TypeRepas.entreePlat) {
			addition= this.entree.prix+this.principal.prix;
		}
		
		else if (this.typeRepas == TypeRepas.platDessert){
			addition= this.principal.prix+this.dessert.prix;
		}
		
		else if (this.typeRepas == TypeRepas.platSeul){// majoration de 10%
			addition= this.principal.prix*1.1;
		}
		return addition;
	}
}
