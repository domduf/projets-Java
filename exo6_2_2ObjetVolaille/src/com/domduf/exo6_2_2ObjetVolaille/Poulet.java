package com.domduf.exo6_2_2ObjetVolaille;

public class Poulet extends Volaille {
	
	
	static double prixKilo= 2.26;
	static double poidAbattage=500;
	String genre;
	
	
	public Poulet (int poids){
		super(poids);
		this.genre="poulet";
	}
	
	static public void setPoidAbattage(){
		Terminal.ecrireStringln("Entrez le nouveau poids");
		poidAbattage=Terminal.lireDouble();
	}
	
	static public double getPoidAbattage(){
		Terminal.ecrireStringln("Le poid d'abattage du poulet est de: "+poidAbattage+" gr");
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
	
	
	
	
}
