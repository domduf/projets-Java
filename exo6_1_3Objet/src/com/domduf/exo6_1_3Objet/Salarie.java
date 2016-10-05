package com.domduf.exo6_1_3Objet;

public class Salarie {
	
	int matricule ;
	String nom ;
	double indice;
	
	static double salaireGeneral=1000.0;
	static int matriculeListe=0;
	
	//constructeurs
	public Salarie(){
		this.nom="\"non renseigné\"";
		this.indice=1;
		this.matricule=matriculeListe+1;
		matriculeListe+=1;
	}
	
	public Salarie(String n, double i){
		this.nom=n;
		this.indice=i;
		this.matricule=matriculeListe+1;
		matriculeListe+=1;
	}
	
	//methodes d'instance
	
	protected double salaireNet(){
		return ( salaireGeneral*this.indice);
	}
	
	public double afficheSalaire(){
		Terminal.ecrireStringln(this.nom+" a un salaire net de "+this.salaireNet()+"€");
		return this.salaireNet();
	}
	
	

}
