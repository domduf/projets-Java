package com.domduf.heritageCoursObjet;


public class CompteRemunere extends CompteBanquaire {

	protected double taux;
	protected double interets;

	/**
	 * 
	 * @param proprio
	 * @param num
	 * @param montant
	 * @param taux
	 */
	public CompteRemunere(String proprio, char[] num, double montant,
			double taux) {
		super(proprio, num, montant);
		fixerTaux(montant);
		interets = 0.0;
	}

	public void fixerTaux(double montant) {
		this.taux = montant;
	}

	public void retirer(double montant) {
		Terminal.ecrireStringln("Appel de retrait sur compte remunéré");
		if (this.solde < montant) {
			throw new provisionInsuffisanteErreur();
		} else {
			solde += montant;
		}
	}

	public void calculerInterets() {
		this.interets += 1.0;
		Terminal.ecrireStringln("Les interets pour le compte de "
				+ this.nomProprietaire + " sont de" + (this.interets));
	}

}
