package com.domduf.exo_5_1_interfaces;

public class Lapin {
	private String nom;
	
	Lapin(String n){
		this.nom=n;
	}
	
	public void crie(){
		Terminal.ecrireStringln("Moi, "+this.nom+" je suis muet comme un lapin...");
	}
}
