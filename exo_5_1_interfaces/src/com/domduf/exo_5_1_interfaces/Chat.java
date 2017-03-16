package com.domduf.exo_5_1_interfaces;

public class Chat implements PeutCrier {
	
	private String nom;
	
	Chat(String n){
		this.nom=n;
	}
	
	public void crie(){
		Terminal.ecrireStringln("Moi, "+this.nom+" je miaule...");
	}
	


}
