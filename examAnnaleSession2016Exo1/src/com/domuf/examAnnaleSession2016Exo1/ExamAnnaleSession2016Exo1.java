package com.domuf.examAnnaleSession2016Exo1;

public class ExamAnnaleSession2016Exo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Type entree = Type.entree;
		Type principal =Type.principal;
		Type dessert =Type.dessert;
		
	
		//entree
		Plat saladeGarnie = new Plat ("Salade garnie à la noix",1.23,entree);
		//plat principal
		Plat rotiPorc= new Plat("Roti de port façon Domduf",5.35,principal);
		rotiPorc.afficherPlat();
		//dessert
		Plat mousseChoc= new Plat("Mousse au chocolat",1.20,dessert);
		mousseChoc.afficherPlat();
			
		Repas repasNul = new Repas ("repas nul ",mousseChoc,rotiPorc, mousseChoc );
		repasNul.afficheMenu();
		
		Repas repasEquilibre =new Repas ("C est bon ça !!!", saladeGarnie, rotiPorc,mousseChoc );
		repasEquilibre.afficheMenu();
		

	}

}
