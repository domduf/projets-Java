package com.domduf.exo6_2_2ObjetVolaille;

public class Canard extends Volaille {
	
	
	static double prixKilo=4.36;
	static double poidAbattage=200;
	String genre;
	
	Canard (int poids){
		super(poids);
		this.genre="canard";
		
	}
	
	static public void setPoidAbattage(){
		Terminal.ecrireStringln("Entrez le nouveau poids");
		poidAbattage=Terminal.lireDouble();
	}
	
	static public double getPoidAbattage(){
		Terminal.ecrireStringln("Le poid d'abattage du canard est de: "+poidAbattage+" gr");
		return poidAbattage;
	}
	
	
	public String  getGenre(){
		return this.genre;
	}
	
	public void setPrixKilo(double prixK){
		prixKilo=prixK;
	}
	public double getPrixKilo(){
		return prixKilo;
	}
	
	public static void achat(){
		Terminal.ecrireStringln("achat de canards");
	}
	
}
