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
	
	public void virVersNo (Banque b, int num, int montant ){
		
		
		Compte c= b.tous.compte(num);
		
		this.retrait(montant);
		c.depot(montant);
		Terminal.ecrireStringln("Virement de "+montant+" € du compte "+this.numero+ " vers le compte de " +
				"la banque "+b.nom+" numéro "+num);
	}
	
	void afficher(){
		Terminal.ecrireString("Solde du compte n° "+numero+": ");
		Terminal.ecrireIntln(solde);
	}
}
