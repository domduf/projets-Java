package com.domduf.heritageCoursObjet;


public class HeritageCoursObjet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Tests 2 */
		CompteBanquaire dom6;
		
		CompteRemunere dom12;
		dom12= new CompteRemunereAvecDecouvert("Dominique Duf","A00l1".toCharArray(),200.0,2.3,5000);
		
		dom12.retirer(5000);
		dom12.fixerTaux(3);
		dom12.getSoldeCourant();
		
		String num="001";
		
		
		dom6= new CompteAvecDecouvert("Domduf","001".toCharArray(),200.0,50.0);
		
		dom6.getSoldeCourant();
		
	
		
		/*  Tests 1 */
		CompteBanquaire dom;
		CompteBanquaire soph;
		CompteAvecDecouvert dom2;
		CompteRemunereAvecDecouvert domRD;
		
		dom= new CompteBanquaire("Domduf","001".toCharArray(),500.0);
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
			domRD.retirer(70000.2);
		} catch (provisionInsuffisanteErreur g) {
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

