package com.domduf.exo3_1_2Objet;

public class TableauCompte {
	
	Compte[] tab;
	int longueur;
	
	
	
	TableauCompte (int n){
		tab= new Compte[n];
	}
	
	
	
	
	public void ajouter (Compte c) throws NonInitialise{
		if(c==null){
			throw new NonInitialise();
		}
		if(longueur<tab.length){
			tab[longueur]=c;
			longueur++;
		}
	}
	
	
}
