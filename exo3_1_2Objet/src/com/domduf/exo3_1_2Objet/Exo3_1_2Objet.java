package com.domduf.exo3_1_2Objet;

class TableauCompte{
	Compte[] tab;
	int longueur;
	TableauCompte (int n){
		tab= new Compte[n];
	}
	void ajouter (Compte c) throws NonInitialise{
		if(c==null){
			throw new NonInitialise();
		}
		if(longueur<tab.length){
			tab[longueur]=c;
			longueur++;
		}
	}
}

class Banque{
	String nom;
	TableauCompte tous = new TableauCompte(50);
	Banque (String n){
		nom=n;
	}
}

class Titulaire{
	String nom;
	TableauCompte mesComptes = new TableauCompte(10);
	
	Titulaire (String n){
		nom=n;
	}
	
}

class Compte {
	int numero;
	int solde;
	
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

class NonInitialise extends Exception{};

public class Exo3_1_2Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
