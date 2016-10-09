package com.domduf.exo6_2_2ObjetVolaille;

public class Volaille {
	
	int poids;//poid multiple de  100g
	int numero;
	static int compteur=0;
	String genre;
	double poidAbattage;

	
	public Volaille(int poids){ 
		compteur+=1;
		this.numero=compteur;
		this.poids=poids;
		}
	
	public String  getGenre(){
		return this.genre;
	}
	
	public int getPoids(){
		return this.poids;
	}
	
	public int getNumero(){
		return this.numero;
	}



}
