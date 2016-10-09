package com.domduf.exo6_2_2ObjetVolaille;

public class Exo6_2_2ObjetVolaille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Elevage monElevage;
		monElevage=new Elevage("Dom élevage", 150);

		//init des menus
		String[] menuGeneralChoix = { "achat de volaille", "vente",
				"affichage des stocks",
				"affichage et mise à jour des poids d'abattage",
				"affichage et mise à jour des cours de ventes",
				"QUITTER L'APPLICATION" };
		MenuChoix menuGeneral = new MenuChoix("Général", menuGeneralChoix);
		
		String[] achatVolailleChoix={"achat de poulet","achat de canards","RETOUR"};
		MenuChoix  achatVolaille = new MenuChoix("Achat de volaille",achatVolailleChoix);
		
		String[] majPoidsAbattageChoix={"poulet", "canard", "RETOUR"};
		MenuChoix majPoidsAbbatage= new MenuChoix( "poids abattage à mettre à jour", majPoidsAbattageChoix );

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
				
					// retour
					
				}break;
				
				}
				
				
			}break;
			
			case 2: {
				
				monElevage.vente();
				
				
			}break;
			
			case 3: {
				monElevage.afficheLesStocks();
				
			}break;
			case 4: {
				// m a j des poids abattages
				majPoidsAbbatage.choixDansMenu();
				
				
			}break;
			case 5: {
				Terminal.ecrireStringln("cas 5");
			}break;
			
			}

		

		}
		Terminal.ecrireStringln("Coot cot coin coin....good bye !");

	}

}
