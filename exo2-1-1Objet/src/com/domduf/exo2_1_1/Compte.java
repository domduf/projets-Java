package com.domduf.exo2_1_1;
/**
 * 
 * @author domduf
 *
 */
public class Compte {
	
	int solde;
	String nom;
	

	public Compte(String nomCompte){
	nom=nomCompte ;
	}
	
	
	
	void deposer(int montant){
		solde=solde+montant;
	}
	
	void retirer(int montant){
		solde=solde-montant;
	}
	
	void virerVers (int montant, Compte destination){
		Terminal.ecrireStringln("Virement de "+montant+"€ de "+this.nom+" vers "+destination.nom);
		this.retirer(montant);
		destination.deposer(montant);
		this.afficher();
		destination.afficher();
	}
	
	void afficher (){
		Terminal.ecrireStringln("le solde du compte "+nom+" est de "+solde+" €.");
	}
}
