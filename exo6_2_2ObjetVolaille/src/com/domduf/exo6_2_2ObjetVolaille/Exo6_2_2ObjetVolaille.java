package com.domduf.exo6_2_2ObjetVolaille;

public class Exo6_2_2ObjetVolaille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Elevage monElevage;
		monElevage=new Elevage("Dom élevage", 30);

		//init des menus
		String[] menuGeneralChoix = { "achat de volaille", "vente",
				"affichage des stocks",
				"affichage et mise à jour des poids d'abattage",
				"affichage et mise à jour des cours des cours des ventes",
				"QUITTER L'APPLICATION" };
		MenuChoix menuGeneral = new MenuChoix("Général", menuGeneralChoix);
		
		String[] achatVolailleChoix={"achat de poulet","achat de canards","RETOUR"};
		MenuChoix  achatVolaille = new MenuChoix("Achat de volaille",achatVolailleChoix);

		// ----------------------------------------------------------------------------
		// ----------------------------------------------------------------------------
		// affichage du menu général de l'application
		int nav=0;
		int nav1, nav2, nav3 = 0;
		
		while ( nav != menuGeneralChoix.length) {// boucle générale

			monElevage.affichePlaceDispo();
			nav = menuGeneral.choixDansMenu();

			switch (nav) {

			case 1 : {
				nav1=achatVolaille.choixDansMenu();
				
				switch (nav1){
				case 1 : {
					monElevage.achatVolaille(nav1);
									
				} break;
				case 2: {
					monElevage.achatVolaille(nav1);
									
				} break;
			
				case 3:{
					
					
					
				}break;
				
				}
				
				
			}break;
			
			case 2: {
				Terminal.ecrireStringln("cas 2");
				
			}break;
			
			case 3: {
				monElevage.afficheLesStocks();
				
			}break;
			case 4: {
				Terminal.ecrireStringln("cas 4");
			}break;
			case 5: {
				Terminal.ecrireStringln("cas 5");
			}break;
			
			}

		

		}
		Terminal.ecrireStringln("Coot cot coin coin....good bye !");

	}

}
