package com.domduf.exo3_1_2Objet;

/**
 * 
 * @author domduf
 *
 */
public class Compte {
	private int numero; // numero du compte
	private int solde;  // solde
	private Banque createur; //banque créatrice du Compte
	private Titulaire titulaire;

	/**
	 * constructeur par défaut
	 * @param n
	 * @param b
	 */
	public  Compte (int n, Banque b, Titulaire t){
		numero=n;
		solde=0;
		createur= b;
		titulaire=t;
	}

	public Titulaire getTitulaire(){
		return this.titulaire;
	}
	/**
	 * dépot sur le compte
	 * @param n
	 */
	void depot(int n){
		solde=solde+n;
		Terminal.ecrireStringln("++dépot de "+n+" € sur compte N° "+this.numero+ " "+this.createur.appartient());
	}

	/**
	 * retrait du compte
	 * @param n
	 */
	void retrait (int n){
		solde=solde-n;
		Terminal.ecrireStringln("--retrait de "+n+" € sur compte N° "+this.numero+ " "+this.createur.appartient());
	}

	/**
	 * virement vers le Compte n° num de la Banque b  du montant 
	 * @param b
	 * @param num
	 * @param montant
	 */
	public void virVersNo (Banque b, int num, int montant ){


		Compte c= b.getTabCompte().compte(num);
		Terminal.ecrireStringln("Virement de "+montant+" € du compte "+this.numero+ " vers le compte de " +
				"la banque "+b.getNom()+" numéro "+num);
		this.retrait(montant);
		c.depot(montant);

	}

	/**
	 * affiche le solde du Compte
	 */
	void afficher(){
		
		Terminal.ecrireString(
				createur.appartient()+" n°"+numero+" "+titulaire.appartient()+" Solde: ");
		Terminal.ecrireIntln(solde);
	}
}
