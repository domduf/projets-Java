package com.domduf.exo2_1_1;
/**
 * 
 * @author domduf
 *
 */
public class Compte {
	
	int solde;
	String nom;
	int numero;
	static int numeroBase=0;
	

	public Compte(String nomCompte){
	nom=nomCompte ;
	numero=numeroBase+1;
	numeroBase++;
	}
	
	
	
	void deposer(int montant){
		solde=solde+montant;
	}
	
	void retirer(int montant){			

		if (this.solde<montant){
		Terminal.ecrireStringln("Votre solde est de "+solde+"€ et vous demandez " +
			montant+"€");
			Terminal.ecrireStringln("Opération refusée... changez de banque !");
		}else
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
		Terminal.ecrireStringln("le solde du compte (n°"+numero+") "+nom+" est de "+solde+" €.");
	}
}
