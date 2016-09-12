package com.domduf.exo2_1_4;

public class Exo2_1_4Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compteur c1,c2, c3;
		c1= new Compteur(0);
		c1.incremente();
		c2= new Compteur(1);
		c3=c1;
		
		if (c1==c3){
			Terminal.ecrireStringln("c1 et c3 égaux");
		}
		
		if (c1.getValeur()==c2.getValeur()){
			Terminal.ecrireStringln("c1 et c2 ont même valeur");	
		}
		
		if (c1!=c2){
			Terminal.ecrireStringln("c1 et c2 ne sont pas égaux");
		}
		
		if (c1.getValeur()!=c1.incremente().getValeur()){
			Terminal.ecrireStringln("c1 et c1 incremente n'ont pas même valeur");
		}
		
		if (c1==c1.incremente()){
			Terminal.ecrireStringln("c1 et c1 incremente sont égaux");
		}

	}

}
