package com.domduf.exo4_1_3_ExceptionMenuObjet;

public class Exo4_1_3_ExceptionMenuObjet {


	/**
	 * Test de la Class MenuChoix
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] tabChoix = {"Premier","Deuxième","Troisième","Quatrième","4eme Bis","Cinquième"};
		//String[] tabChoix = {};//test de menu vide levant l'exception MenuImpossible


		MenuChoix m1, m2;
		m1= new MenuChoix("menu1",3);//construction d'un menu proposant trois choix
		
		//construction d'un menu utilisant la chaine "tabChoix"
		m2= new MenuChoix("menuclassique" , tabChoix); 
		
		m2.choixDansMenu();
		int c1=m1.afficherChoixMenu();//affiche et retourne  les choix du menu, sans demander d'entrée
		Terminal.ecrireIntln(c1);
		Terminal.ecrireIntln(m2.afficherChoixMenu());

		m1.choixDansMenu();
		Terminal.ecrireIntln(m1.choixDansMenu());

		MenuChoix.saisirChoix(8);

	}

}


