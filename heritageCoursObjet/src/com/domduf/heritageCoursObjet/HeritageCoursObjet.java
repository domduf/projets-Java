package com.domduf.heritageCoursObjet;

public class HeritageCoursObjet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompteBanquaire dom;
		CompteBanquaire soph;
		CompteAvecDecouvert dom2;
		CompteRemunereAvecDecouvert domRD;

		domRD = new CompteRemunereAvecDecouvert("Pierre",
				"445ft5".toCharArray(), 6000.0, 0.05, 2000);
		dom2 = new CompteAvecDecouvert("Dominique", "dom002".toCharArray(),
				200, 400);
		domRD.getSoldeCourant();
		domRD.fixerTaux(0.02);
		domRD.calculerInterets();
		domRD.calculerInterets();
		domRD.getSoldeCourant();
		domRD.deposer(235);
		domRD.getSoldeCourant();

		dom2.virerVers(domRD, 25.5);
		try {
			dom2.retirer(700);
		} catch (provisionInsuffisanteErreur e) {
			Terminal.ecrireStringln("oups...retrait impossible, désolé.");
		}

		// appel methode de CompteBanquaire
		dom2.getSoldeCourant();
		dom = dom2;

		// dom2=dom; //IMPOSSIBLE
		dom.getSoldeCourant();
		Terminal.ecrireStringln("l'objet est identique ?" + dom.equals(dom2));

		dom = new CompteBanquaire("Dominique", "dom001".toCharArray(), 150.0);

		Terminal.ecrireStringln("l'objet est identique ?" + dom.equals(dom2));

		dom.getSoldeCourant();
		dom.retirer(20);

		dom.getSoldeCourant();

		soph = new CompteBanquaire();
		dom.virerVers(soph, 10.30);

		soph.getSoldeCourant();
		soph.setNomProprio();

		dom.getSoldeCourant();
		soph.getSoldeCourant();
	}

}
