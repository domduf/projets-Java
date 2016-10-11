package com.domuf.examAnnaleSession2016Exo1;

public class ExamAnnaleSession2016Exo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurant restoDomduf=new Restaurant("Chez Domduf", 15);
		
		Carte cartDodo=new Carte(restoDomduf,"Carte du soleil", 3, 4, 4);
		
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
		
		Repas repaRapidos = new Repas("sur le pouce",rotiPorc,mousseChoc  );
		repaRapidos.afficheMenu();
		repaRapidos.afficheAddition();
		
		Repas repaGrugeur = new Repas ("Le grugeur",mousseChoc,rotiPorc);
		repaGrugeur.afficheMenu();
		repaGrugeur.calculAddition();
		
		Repas repaViandard = new Repas ("Le viandard",rotiPorc);
		repaViandard.afficheMenu();
		repaViandard.afficheAddition();
		
		Repas repasEquilibre =new Repas ("C est bon ça !!!", saladeGarnie, rotiPorc,mousseChoc );
		repasEquilibre.afficheMenu();
		repasEquilibre.afficheAddition();
		

	}

}
