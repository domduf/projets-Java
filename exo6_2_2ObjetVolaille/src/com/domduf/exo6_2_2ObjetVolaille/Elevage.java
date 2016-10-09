package com.domduf.exo6_2_2ObjetVolaille;

public class Elevage {

	Volaille[] tabGeneralVolailles;
	String nomElevage;
	static int nbVolaille = 0;
	static double budget=1000.0;

	Elevage(String n, int v) {
		nomElevage = n;
		tabGeneralVolailles = new Volaille[v];
	}

	public void achatVolaille(int choix) {

		
		String type;
		if (choix == 1) {
			type = "poulet";
		} else
			type = "canard";

		Terminal.ecrireStringln("-----------------------------------------------------");
		this.affichePlaceDispo();
		Terminal.ecrireStringln("achat de "+type+" pour \"" + this.nomElevage
				+ "\" entrez la quantité:");
		int nbAchat = MenuChoix.saisirChoix(this.restePlace());

		Terminal.ecrireStringln("Quel poid unitaire ? (choix par 100g, exemple -3- => 300g)");
		int pd = (MenuChoix.saisirChoix(20) * 100);

		for (int i = 0; (i < nbAchat); i++) {

			switch (choix) {
			case 1: {
				tabGeneralVolailles[nbVolaille] = new Poulet(pd);
			}
				break;
			case 2: {
				tabGeneralVolailles[nbVolaille] = new Canard(pd);
			}
				break;
			}

			nbVolaille++;
			
		}

		this.affichePlaceDispo();
	}
	
	
	public void afficheLesStocks(){
		
		for (int i=0; i<nbVolaille;i++){
			Terminal.ecrireStringln("-"+this.tabGeneralVolailles[i].numero+"- "+
					this.tabGeneralVolailles[i].genre+" poids: "+
					this.tabGeneralVolailles[i].poids+"g.");
		}
	}
	
	
	public void vente(){
		
	}
	

	

	/**
	 * calcul de la place disponible dans l'élevage
	 * 
	 * @return
	 */
	public int restePlace() {
		int reste = tabGeneralVolailles.length - nbVolaille;
		return reste;
	}

	/**
	 * affichage de la place disponible
	 */
	public void affichePlaceDispo() {
		Terminal.ecrireStringln("Il vous reste " + this.restePlace()
				+ " places dans votre élevage");
	}

}
