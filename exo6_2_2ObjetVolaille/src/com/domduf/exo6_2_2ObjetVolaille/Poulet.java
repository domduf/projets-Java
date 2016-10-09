package com.domduf.exo6_2_2ObjetVolaille;

public class Poulet extends Volaille{
	
	
	static double prixKilo;
	static double poidAbattagePoulet;
	String genre;
	
	public Poulet (int poids){
		super(poids);
		this.genre="poulet";
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
