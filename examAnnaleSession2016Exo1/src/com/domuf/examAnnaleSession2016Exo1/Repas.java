package com.domuf.examAnnaleSession2016Exo1;

public class Repas {

	String nom;
	Plat entree;
	Plat principal;
	Plat dessert;
	static Plat nulEntree= new Plat ("---",0.0,Type.entree);
	static Plat nulDessert= new Plat("---",0.0,Type.dessert);

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

	public Repas(String n, Plat p1, Plat p2){
		if (p1.type==Type.entree & p2.type==Type.principal){
			// entrée principal
			this.nom=n;
			this.entree=p1;
			this.principal=p2;
			this.dessert=nulDessert;
		}
		else if (p1.type ==Type.principal & p2.type==Type.dessert ){
			this.nom=n;
			this.entree=nulEntree;
			this.principal=p1;
			this.dessert=p2;
		}
		else Terminal.ecrireStringln("verifiez le type de vos plats...");
	}
	
	public Repas(String n, Plat p){
		if (p.type==Type.principal){
			this.nom=n;
			this.entree=nulEntree;
			this.principal=p;
			this.dessert=nulDessert;
		}
	}


	public void afficheMenu() {

		try {
			if (this.entree!=nulEntree) this.entree.afficherPlat();
			this.principal.afficherPlat();
			if (this.dessert!=nulDessert) this.dessert.afficherPlat();
			Terminal.ecrireStringln("====================================");
			
			Terminal.ecrireStringln("   Nom du repas : " + this.nom);
		} catch (Exception e) {
			Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");
			Terminal.ecrireStringln("Votre repas n'est pas enregistré");
			Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");

		}

	}

	public void afficheAddition() {
		Terminal.ecrireStringln("                               __________");
		Terminal.ecrireStringln("ADDITION net:\t\t\t" + this.calculAddition()
				+ " €uros");
		Terminal.ecrireStringln("_____________________________________________");
	}

	public double calculAddition() {
		double addition = 0;
		try{
			addition = this.entree.prix + this.principal.prix + this.dessert.prix;
		}catch (Exception e){
			Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");
			Terminal.ecrireStringln("Repas non enregistré, désolé, pas possible de facturer");
			Terminal.ecrireStringln("++++++++++++++++++++++++++++++++");

		}
		
		return addition;
	}
}
