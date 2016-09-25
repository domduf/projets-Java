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
		Titulaire[] listeTitulaire2= {pierre,paul};		
	
		
		Banque bnp = new Banque("BNP");
		Banque axa = new  Banque("AXA");
		Banque chmol =new Banque ("DUCHMOL");
		
		
		bnp.creerComptePour(listeTitulaire1);
		bnp.creerComptePour(julie);
		
		
		axa.creerComptePour(listeTitulaire2);
		axa.creerComptePour(julie);
		axa.creerComptePour(dom);
		
		dom.mesComptes.afficherTableauCompte();
		dom.mesComptes.compte(1).depot(150000);
		dom.mesComptes.compte(1).retrait(26);
		dom.mesComptes.afficherTableauCompte();
		
		
		dom.donneProcuration(julie, bnp, 0);
		
		dom.mesComptes.afficherTableauCompte();
		julie.mesComptes.afficherTableauCompte();
		axa.getTabCompte().afficherTableauCompte();
		axa.afficherTousCompte(dom);
	
		//axa.setNom();
		chmol.creerComptePour(dom);

		dom.mesComptes.afficherTableauCompte();
		julie.mesComptes.compte(2).depot(1500);
		dom.mesComptes.compte(1).virVersNo(bnp, 0, 255);
		bnp.getTabCompte().afficherTableauCompte();
		dom.mesComptes.afficherTableauCompte();
		julie.mesComptes.afficherTableauCompte();
		julie.mesComptes.compte(2).virVersNo(axa, 1, 1623);
		julie.mesComptes.afficherTableauCompte();
		axa.getTabCompte().afficherTableauCompte();
		Terminal.ecrireStringln("voilà le nom :"+axa.appartient());
		Terminal.ecrireStringln("voilà le nom :"+dom.appartient());
		
	}

}

