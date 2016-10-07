package com.domduf.exo6_2_1Objet;

public class Exo6_2_1Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// QUESTION 1
		new Premiere();
		Terminal.ecrireStringln("---------------------------------");
		new Seconde (true);
		Terminal.ecrireStringln("---------------------------------");
		new Troisieme (15);
		Terminal.ecrireStringln("---------------------------------");
		new Quatrieme(12.3);
		Terminal.ecrireStringln("---------------------------------");
		
		// QUESTION 2
		new Cinquieme();
		Terminal.ecrireStringln("---------------------------------");
		new Sixieme();
		Terminal.ecrireStringln("---------------------------------");
		
		// QUESTION 3
		new Septieme(5);
		Terminal.ecrireStringln("---------------------------------");
		new Huitieme();
		Terminal.ecrireStringln("---------------------------------");
		
		// QUESTION 4
		new Dixieme(10.5);
		Terminal.ecrireStringln("---------------------------------");
		new Dixieme(45,true);
		Terminal.ecrireStringln("---------------------------------");
	}

}
