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
	
	
	
	public void afficher (){
		for (int i=0;i<tab.length;i++){
			
			if (tab[i]!=null){
			
			Terminal.ecrireStringln("Compte n°"+i+" numero "+ tab[i].numero);
			tab[i].afficher();
			}
			
		}
	}
	
	public Compte compte (int indice){
		return this.tab[indice];
		
		 
	}
	
	
}
