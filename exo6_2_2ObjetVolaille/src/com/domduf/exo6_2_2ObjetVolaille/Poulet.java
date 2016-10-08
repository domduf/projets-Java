package com.domduf.exo6_2_2ObjetVolaille;

public class Poulet extends Volaille{
	
	
	static double prixKilo;
	static double poidAbattagePoulet;
	static String genre="poulet";
	
	public Poulet (int poids){
		super(poids, genre);
		
	}

	public void setPrixKilo(double prixK){
		prixKilo=prixK;
	}
	public double getPrixKilo(){
		return prixKilo;
	}
	
	
	
	
}
