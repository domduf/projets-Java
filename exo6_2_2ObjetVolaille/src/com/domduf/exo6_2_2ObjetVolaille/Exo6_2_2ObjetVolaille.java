package com.domduf.exo6_2_2ObjetVolaille;

public class Exo6_2_2ObjetVolaille {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] menuGeneralChoix= {"ajout volaille","vente","affichage stock","QUITTER L'APPLICATION"};
		MenuChoix menuGeneral=new MenuChoix("Général",menuGeneralChoix);
		int navig=0; 
		
		//affichage du menu général de l'application
		while (navig != menuGeneralChoix.length){//boucle générale
			
			navig=menuGeneral.choixDansMenu();
			
			
			
			
		}

	}

}
