package com.domuf.examAnnaleSession2016Exo1;

public class Plat {
	
	// variables d'instances
	String nom;
	double prix;
	Type type;
	
	//constructeur
	
	Plat(String n,double p,Type t){
		this.nom=n;
		this.prix=p;
		this.type=t;
	}
	
	public void afficherPlat(){
		Terminal.ecrireStringln("---------------------------------------");
		Terminal.ecrireStringln("<<<<  \t"+this.nom+"  >>>>");
		Terminal.ecrireStringln("Ce plat est un "+this.type.getName());
		
		Terminal.ecrireStringln(" \t\t\t\t+"+this.prix+" €");
	}
	

}
