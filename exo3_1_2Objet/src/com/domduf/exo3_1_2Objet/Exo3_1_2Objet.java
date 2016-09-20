package com.domduf.exo3_1_2Objet;





class NonInitialise extends Exception{}


public class Exo3_1_2Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banque bnp;
		//bnp = new Banque(BNP);
		Compte c1;
		c1=new Compte (0);
		c1.afficher();

	}

}

