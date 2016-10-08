package com.domduf.exo6_2_2ObjetVolaille;

public class Volaille {
	
	int poids;//poid multiple de  100g
	int numero;
	static int compteur=0;
	String genre;
	
	public Volaille(int poids, String g){ 
		compteur+=1;
		this.numero=compteur;
		this.poids=poids;
		this.genre=g;	
	}
	
	

}
