package com.domduf.exo3_1_2Objet;





class NonInitialise extends Exception{}


public class Exo3_1_2Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Titulaire dom, paul, pierre;
		dom=new Titulaire("Dominique");
		paul=new Titulaire("Paul");
		pierre=new Titulaire("Pierre");
		
		Titulaire[] listeTitulaire1= {dom,paul,pierre};
		Titulaire[] listeTitulaire2= {dom,paul};		
		
		
		
		
		Banque bnp;
		bnp = new Banque("BNP");
		bnp.creerComptePour(listeTitulaire1);
		bnp.creerComptePour(listeTitulaire2);
		
		Banque axa = new  Banque("AXA");
		axa.creerComptePour(listeTitulaire2);
		
		/*
		for (int i=0;i<56;i++){
			bnp.creerComptePour(listeTitulaire1);
		}
		*/
				
		



	}

}

