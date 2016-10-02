package com.domduf.heritageCoursObjet;

public class HeritageCoursObjet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompteBanquaire dom;
		CompteBanquaire soph;
		CompteAvecDecouvert dom2;
		
		dom2= new CompteAvecDecouvert("Dominique", "dom002".toCharArray(), 200, 400);
		//dom2.getSoldeCourant();
		
		try{
			dom2.retirer(700);
		}catch (provisionInsuffisanteErreur e){
			Terminal.ecrireStringln("oups...retrait impossible, désolé.");
		}
		
		//appel methode de CompteBanquaire
		dom2.getSoldeCourant(); 
		dom=dom2;
		dom.getSoldeCourant();
		Terminal.ecrireStringln("l'objet est identique ?"+dom.equals(dom2));	
		
		
		
		dom =new CompteBanquaire("Dominique","dom001".toCharArray(),150.0);
		
		Terminal.ecrireStringln("l'objet est identique ?"+dom.equals(dom2));
		
		dom.getSoldeCourant();
		dom.retirer(20);
		
		dom.getSoldeCourant();
		
		soph= new CompteBanquaire();
		dom.virerVers(soph, 10.30);
		
		soph.getSoldeCourant();
		soph.setNomProprio();
		
		
		dom.getSoldeCourant();
		soph.getSoldeCourant();
	}

}
