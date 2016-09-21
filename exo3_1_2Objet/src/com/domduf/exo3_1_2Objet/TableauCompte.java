package com.domduf.exo3_1_2Objet;



public class TableauCompte {
	
	Compte[] tab;
	int longueur;
	
	
	
	TableauCompte (int n){
		tab= new Compte[n];
		longueur=0;
		
		
	/*
		for (int i=0;i<n;i++){
			tab[i]= new Compte(i);
		}
	*/
	}
	
	
	public void ajouter (Compte c){
		
		if(longueur<tab.length){
			tab[longueur]=c;
			longueur++;
		}
	}
	
	
}
