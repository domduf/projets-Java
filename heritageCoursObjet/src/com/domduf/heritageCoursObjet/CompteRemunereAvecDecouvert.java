package com.domduf.heritageCoursObjet;

public class CompteRemunereAvecDecouvert extends CompteRemunere {

	double decouvertMax;

	public void fixeDecouvertMaximal(double montant) {
		this.decouvertMax = montant;
	}

	/**
	 * 
	 * @param proprio
	 * @param num
	 * @param montant
	 * @param taux
	 * @param decouvertMax
	 */
	public CompteRemunereAvecDecouvert(String proprio, char[] num,
			double montant, double taux, double decouvertMax) {
		super(proprio, num, montant, taux);
		fixeDecouvertMaximal(decouvertMax);
	}

	public void retrait(double montant) {
		Terminal.ecrireStringln("Appel de retrait sur compte remunere avec decouvert.");
		if (this.solde - montant < -decouvertMax) {
			throw new provisionInsuffisanteErreur();
		} else {
			solde -= montant;
		}
	}

}
