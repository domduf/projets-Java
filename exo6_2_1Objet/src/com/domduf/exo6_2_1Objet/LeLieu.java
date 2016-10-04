package com.domduf.exo6_2_1Objet;

public class LeLieu {
	
	//
	String codePostal;
	String nomVille;
	
	public LeLieu(){
		this.codePostal="-----";
		this.nomVille="inconnue";
	}
	
	public LeLieu(String v, String cp){
		this.nomVille=v;
		this.codePostal=cp;
	}
	
	public void afficher(){
		Terminal.ecrireString(" "+this.nomVille+" "+this.codePostal);
	}
	
	
	

}
