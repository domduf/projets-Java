package com.domduf.heritageCoursObjet;

public class HeritageCoursObjet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompteBanquaire dom;
		CompteBanquaire soph;
		
		dom =new CompteBanquaire("Dominique","dom001".toCharArray(),150.0);
		Terminal.ecrireDouble(dom.getSoldeCourant());
		dom.retirer(200);
		

	}

}
