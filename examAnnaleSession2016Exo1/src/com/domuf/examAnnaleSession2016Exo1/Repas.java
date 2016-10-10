package com.domuf.examAnnaleSession2016Exo1;

public class Repas {

	String nom;
	Plat entree;
	Plat principal;
	Plat dessert;

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
			Terminal.ecrireStringln("Votre repas complet est enregistré.\n  Merci.");
		}
	}

	public void afficheMenu(){

		try{
			this.entree.afficherPlat();
			this.principal.afficherPlat();
			this.dessert.afficherPlat();		
			Terminal.ecrireStringln("-----6969696969696969696969696969----");
		Terminal.ecrireStringln("   Nom du repas : "+this.nom);
		}catch (Exception e){
			Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");
			Terminal.ecrireStringln("Votre repas n'est pas enregistré");
			Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");

		}

	}
	
	public void afficheAddition(){
		Terminal.ecrireStringln("                               __________");
		Terminal.ecrireStringln("ADDITION net:\t\t\t"+this.calculAddition()+" €uros");
	}
	
	
	public double calculAddition (){
		double addition=0;
		addition= 
				this.entree.prix+
				this.principal.prix+
				this.dessert.prix;
		return addition;
	}
}
