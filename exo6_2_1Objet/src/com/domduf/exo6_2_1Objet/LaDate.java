package com.domduf.exo6_2_1Objet;

public class LaDate {
	
	// variables d'instance
	int jour;
	int mois;
	int annee;
	
	//
	// l'annee en cours
	static int CETTE_ANNEE=2016;
	
	//constructeur
	public LaDate(int j, int m, int a){
		this.jour=j;
		this.mois=m;
		this.annee=a;
	}
	
	//methode d'instance
	public void ecrire(){
		Terminal.ecrireString(jour+"/"+mois+"/"+annee);
	}

}
