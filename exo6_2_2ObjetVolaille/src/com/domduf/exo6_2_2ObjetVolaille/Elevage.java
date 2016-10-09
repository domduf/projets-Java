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

			Terminal.ecrireStringln("-"+this.tabGeneralVolailles[i].numero+"- \t"+
					this.tabGeneralVolailles[i].getGenre()+"\t poids: "+
					this.tabGeneralVolailles[i].getPoids()+" g");

		}
	}
	
	
	public Volaille[] triStockVendable (){
		Volaille[] tabStockVendable;
		tabStockVendable= new Volaille[nbVolaille];
		int compt=0;
		String g;
		int poids;
		double benef=0;
		
		Terminal.ecrireStringln("------------------------------------");
		Terminal.ecrireStringln("Tri des volailles vendables");
		Terminal.ecrireStringln("------------------------------------");
		
				

			
		for (int i=0; i<nbVolaille;i++){
	
			
			Volaille v = this.tabGeneralVolailles[i];
			g= v.getGenre();
			
			poids= v.getPoids();
			
			if (g=="poulet" & poids >= Poulet.poidAbattage){
				tabStockVendable[compt]=v;
				Terminal.ecrireString("volaille "+v.getGenre()+" n° "+v.getNumero());
				Terminal.ecrireStringln(" prix de vente: "+Poulet.prixKilo*poids/1000+" €");
				compt=compt+1;
			}
			
			if (g=="canard" & poids>=Canard.poidAbattage){
				tabStockVendable[compt]=v;
				Terminal.ecrireString("volaille "+v.getGenre()+" n° "+v.getNumero());
				Terminal.ecrireStringln(" prix de vente: "+Canard.prixKilo*poids/1000+" €");
				compt=compt+1;
			}
		}
		
		return tabStockVendable;
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
		Terminal.ecrireStringln("++++++++++++++++++++++++++++++++++++++++++++++++");
		Terminal.ecrireStringln("Il vous reste " + this.restePlace()
				+ " places dans votre élevage");
	}
	
	
	public void vente(){
		
		
		
		if (Poulet.getPoidAbattage()==0.0||Canard.getPoidAbattage()==0.0){
		
			Terminal.ecrireStringln("ATTENTION, vous n'avez pas mis à jour les poids d'abattage\n" +
					"appuyez sur ENTER");
			Terminal.lireChar();
			
		}else{
			
			this.triStockVendable();
			
			
		}
		
	}
	
	public  static void getPoidsAbattage(){
		Poulet.getPoidAbattage();
		Canard.getPoidAbattage();
	}
	
	public static void setPoidsAbattage(int nav){
		
		if (nav==1) {
			Poulet.getPoidAbattage();
			Poulet.setPoidAbattage();}
		
		else {
			Canard.getPoidAbattage();
			Canard.setPoidAbattage();
		}
	}

}
