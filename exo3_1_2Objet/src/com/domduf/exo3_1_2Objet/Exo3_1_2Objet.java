package com.domduf.exo3_1_2Objet;





class NonInitialise extends Exception{}


public class Exo3_1_2Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration et init des Titulaires et des groupes
		
		Titulaire dom, paul, pierre, julie;
		
		dom=new Titulaire("Dominique");
		paul=new Titulaire("Paul");
		pierre=new Titulaire("Pierre");
		julie = new Titulaire("Julie");
		
		Titulaire[] listeTitulaire1= {dom,paul,pierre};
		Titulaire[] listeTitulaire2= {dom,paul};		
	
		
		Banque bnp = new Banque("BNP");
		Banque axa = new  Banque("AXA");
		Banque chmol =new Banque ("DUCHMOL");
		
		
		bnp.creerComptePour(listeTitulaire1);
		bnp.creerComptePour(listeTitulaire2);
		bnp.creerComptePour(dom);
		
		
		axa.creerComptePour(listeTitulaire2);
		axa.creerComptePour(julie);
		
		chmol.creerComptePour(dom);
		/*
		for (int i=0;i<56;i++){
			bnp.creerComptePour(listeTitulaire1);
		}
		*/
		Terminal.ecrireStringln("Titulaire "+dom.getNom());	
		dom.mesComptes.afficher();
		
		Terminal.sautDeLigne();
		
		Terminal.ecrireStringln("Banque "+axa.getNom());	
		axa.tous.afficher();

			Terminal.sautDeLigne();
		
		dom.mesComptes.tab[0].depot(100);
		Terminal.ecrireStringln("Titulaire "+dom.getNom());	
		dom.mesComptes.afficher();
		
		Terminal.sautDeLigne();
		
		bnp.nombreDeComptes();
		axa.nombreDeComptes();
		
		Terminal.sautDeLigne();
		
		dom.mesComptes.afficher();
		dom.mesComptes.tab[1].depot(300);
		Terminal.sautDeLigne();
		dom.mesComptes.tab[1].virVersNo(axa, 0, 20);
		dom.mesComptes.tab[1].afficher();
		
		Terminal.sautDeLigne();
		
		axa.tous.afficher();
		dom.mesComptes.afficher();
		
		dom.donneProcuration(julie, axa, 0);
		Terminal.sautDeLigne();
		
		julie.mesComptes.afficher();
		
	}

}

