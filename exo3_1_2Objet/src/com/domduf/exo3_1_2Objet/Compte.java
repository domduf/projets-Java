package com.domduf.exo3_1_2Objet;

public class Compte {
	int numero;
	int solde;


	//constructeur par défaut
	public  Compte (int n){
		numero=n;
		solde=0;
	}
	
	void depot(int n){
		solde=solde+n;
	}
	void retrait (int n){
		solde=solde-n;
	}

	void afficher(){
		Terminal.ecrireString("Solde du compte n° "+numero+": ");
		Terminal.ecrireIntln(solde);
	}
}
