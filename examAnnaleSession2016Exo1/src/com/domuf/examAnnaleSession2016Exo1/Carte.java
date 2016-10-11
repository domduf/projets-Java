package com.domuf.examAnnaleSession2016Exo1;

public class Carte {//carte à presenter aux clients
	
	//variables instance
	Restaurant resto;
	String nomCarte;
	Plat[] entrees;
	Plat[] principaux;
	Plat[] desserts;
	
	//constructeur
	public Carte(Restaurant r,String nC, int nbE, int nbP, int nbD){
		this.resto=r;
		this.nomCarte=nC;
		this.entrees=new Plat[nbE];
		this.principaux=new Plat[nbP];
		this.desserts=new Plat[nbD];
		
	}
	
	
	

}
