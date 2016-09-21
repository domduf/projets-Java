package com.domduf.exo3_1_2Objet;

public class Titulaire {
	String nom;
	TableauCompte mesComptes = new TableauCompte(10);
	
	public Titulaire (String n){
		nom=n;
	}
	
	public String getNom(){
		return this.nom;
	}
	
}
