package com.domduf.exo4_1_3_ExceptionMenuObjet;

public class MenuChoix {

	//variables d'instances
	private String nomDeMenu;
	private String[] tabChoix;
	


	//constructeurs
	MenuChoix(String nom, int n){
		//TODO construit une chaine de n caracteres par exemple {"1","2","3"}
		//et le menu correspondant
		nomDeMenu=nom;
		String[] tableau=new String[n];
		for(int i=0;i<n;i++){
			tableau[i]="Choix---"+String.valueOf(i);
		}
		tabChoix=tableau;
	}

	MenuChoix(String nom, String[] tab){
		nomDeMenu=nom;
		tabChoix=tab;
	}


	//methodes d'instances
	public int afficherNbChoixMenu(){

		Terminal.ecrireStringln("--------------------------------------------");
		Terminal.ecrireStringln("--------------------------------------------");
		
		Terminal.ecrireStringln("-              MENU "+this.nomDeMenu);
		Terminal.ecrireStringln("--------------------------------------------");
		Terminal.ecrireStringln("--------------------------------------------");

		for (int i=0;i<this.tabChoix.length;i++){
			Terminal.ecrireStringln("-"+(i+1)+"- "+tabChoix[i]);
		}
		return this.tabChoix.length;

	}




}
