package com.domduf.heritageCoursObjet;

public class CompteAvecDecouvert extends CompteBanquaire {

	double decouvertMax;

	public void fixerDecouvertMaximal(double montant) {
		this.decouvertMax = montant;
	}

	/**
	 * 
	 * @param proprio
	 * @param num
	 * @param montant
	 * @param decouvertMax
	 */
	public CompteAvecDecouvert(String proprio, char[] num, double montant,
			double decouvertMax) {
		super(proprio, num, montant);
		this.decouvertMax = decouvertMax;
	}

	public void retirer(double montant) {
		Terminal.ecrireStringln("Appel de retrait sur compte avec découvert autorisé");
		if (this.solde - montant < -decouvertMax) {
			throw new provisionInsuffisanteErreur();
		} else {
			this.solde -= montant;
		}
	}

}
