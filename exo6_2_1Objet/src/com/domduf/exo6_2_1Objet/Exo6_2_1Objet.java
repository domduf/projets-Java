package com.domduf.exo6_2_1Objet;

public class Exo6_2_1Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LaDate domAnniv;
		LaDate sophAnniv;
		LaPersonne dom;
		LaPersonne soph;
		LeLieu sophLieu;
		
		sophLieu= new LeLieu("Paris","75000");
		sophAnniv= new LaDate(11,5,1968);
		domAnniv= new LaDate(26,3,1967);
		dom = new LaPersonne("Dominique",domAnniv);
		soph= new LaPersonneLieu("Sophie",sophAnniv, sophLieu);
		
		dom.ecrire();
		domAnniv.ecrire();
		soph.ecrire();
		
		
	

	}

}
