package com.domduf.exo6_2_2ObjetVolaille;

public class Canard extends Volaille{
	
	
	static double prixKilo;
	static double poidAbattageCanard;
	static String genre="canard";
	
	Canard (int poids){
		super(poids, genre);
		
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
