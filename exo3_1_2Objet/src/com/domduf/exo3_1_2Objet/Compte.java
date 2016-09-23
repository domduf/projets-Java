package com.domduf.exo3_1_2Objet;

/**
 * 
 * @author domduf
 *
 */
public class Compte {
	int numero; // numero du compte
	int solde;  // solde
	Banque createur; //banque créatrice du Compte


	/**
	 * constructeur par défaut
	 * @param n
	 * @param b
	 */
	public  Compte (int n, Banque b){
		numero=n;
		solde=0;
		createur= b;
	}

	/**
	 * dépot sur le compte
	 * @param n
	 */
	void depot(int n){
		solde=solde+n;
	}

	/**
	 * retrait du compte
	 * @param n
	 */
	void retrait (int n){
		solde=solde-n;
	}

	/**
	 * virement vers le Compte n° num de la Banque b  du montant 
	 * @param b
	 * @param num
	 * @param montant
	 */
	public void virVersNo (Banque b, int num, int montant ){


		Compte c= b.tous.compte(num);

		this.retrait(montant);
		c.depot(montant);
		Terminal.ecrireStringln("Virement de "+montant+" € du compte "+this.numero+ " vers le compte de " +
				"la banque "+b.nom+" numéro "+num);
	}

	/**
	 * affiche le solde du Compte
	 */
	void afficher(){
		//String banque= ;
		Terminal.ecrireString("Solde du compte n° "+numero+" banque "+this.createur.nom+": ");
		Terminal.ecrireIntln(solde);
	}
}
