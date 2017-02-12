package com.domduf.exo_5_1_interfaces;

public class Chien implements PeutCrier {
	private String nom;
	
	Chien(String n){
		this.nom=n;
	}
	
	public void crie(){
		Terminal.ecrireStringln("Moi, "+this.nom+" j' aboie comme un con...");
	}

}
