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
		Plat saladeGarnie = new Plat ("Salade garnie à la noix",12.35,entree);
		//plat principal
		Plat rotiPorc= new Plat("Roti de port façon Domduf",50.53,principal);
		rotiPorc.afficherPlat();
		//dessert
		Plat mousseChoc= new Plat("Mousse au chocolat",12.60,dessert);
		mousseChoc.afficherPlat();
			
		Repas repasNul = new Repas ("repas nul ",mousseChoc,rotiPorc, mousseChoc );
		repasNul.afficheMenu();
		
		Repas repasEquilibre =new Repas ("C est bon ça !!!", saladeGarnie, rotiPorc,mousseChoc );
		repasEquilibre.afficheMenu();
		repasEquilibre.afficheAddition();
		

	}

}
