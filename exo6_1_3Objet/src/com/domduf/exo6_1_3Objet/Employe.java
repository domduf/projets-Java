package com.domduf.exo6_1_3Objet;

public class Employe {
	
	public int matricule ;
	public String nom ;
	public double indice;
	
	static double salaireGeneral=1000.0;
	static int matriculeListe=0;
	
	//constructeurs
	public Employe(){
		this.nom="\"non renseigné\"";
		this.indice=1;
		this.matricule=matriculeListe+1;
		matriculeListe+=1;
	}
	
	public Employe(String n, double i){
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
		Terminal.ecrireStringln(this.nom+"("+this.matricule+") a un salaire net de "+this.salaireNet()+"€");
		return this.salaireNet();
	}
	
	public void afficheIndice(){
		Terminal.ecrireStringln(this.nom+" a un indice salarial de "+this.indice);
	}
	
	public int afficherMatricule(){
		Terminal.ecrireStringln(this.nom+" a le matricule "+this.matricule);
		return this.matricule;
	}
	
	

}
