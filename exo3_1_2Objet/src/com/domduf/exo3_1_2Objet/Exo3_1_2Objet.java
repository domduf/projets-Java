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
	
		
		Banque bnp = new Banque("BNP");
		Banque axa = new  Banque("AXA");
		
		
		bnp.creerComptePour(listeTitulaire1);
		bnp.creerComptePour(listeTitulaire2);
		bnp.creerComptePour(dom);
		
		
		axa.creerComptePour(listeTitulaire2);
		
		/*
		for (int i=0;i<56;i++){
			bnp.creerComptePour(listeTitulaire1);
		}
		*/
		Terminal.ecrireStringln("Titulaire "+dom.getNom());	
		dom.mesComptes.afficher();

		Terminal.ecrireStringln("Banque "+axa.getNom());	
		axa.tous.afficher();

			Terminal.sautDeLigne();
		
		dom.mesComptes.tab[0].depot(100);
		Terminal.ecrireStringln("Titulaire "+dom.getNom());	
		dom.mesComptes.afficher();
		
		bnp.nombreDeComptes();
		axa.nombreDeComptes();
	
		dom.mesComptes.tab[1].virVersNo(axa, 0, 20);
		dom.mesComptes.tab[1].afficher();
		
		Terminal.sautDeLigne();
		
		axa.tous.afficher();
		dom.mesComptes.afficher();
	}

}

