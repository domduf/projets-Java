package com.domduf.exo4_1_3_ExceptionMenuObjet;

public class Exo4_1_3_ExceptionMenuObjet {

	static int saisirChoix(int n){
		int choix=0;
		boolean fini=false;
		Terminal.ecrireStringln("vous avez un menu proposant "+n+ " valeurs.\n" +
				"Entrez votre choix.");

		while (!fini){
			try{
				choix=Terminal.lireInt();

				if (choix<1||choix>n){
					throw new ChoixHorsLimites();
				}
				fini=true;
			}catch (TerminalException e) {
				Terminal.ecrireStringln("Erreur d'entrée-----IL FAUT UN ENTIER---" +
						"-ENTRE 1 et "+n+"--------------\n Recommencez:");
			}catch (ChoixHorsLimites e){
				Terminal.ecrireStringln("Erreur d'entrée--RESTEZ DANS LES LIMITES---" +
						"-ENTRE 1 et "+n+"--------------\n Recommencez:");
			}

		}

		return choix;
	}
	
	
	
	static int afficherChoixMenu(String[] chaineEntree){
		
		for (int i=0;i<chaineEntree.length;i++){
			Terminal.ecrireStringln("-"+(i+1)+"- "+chaineEntree[i]);
		}
		return chaineEntree.length;
		
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0;
		String[] tabChoix = {"Premier","Deuxième","Troisième","Quatrième","Cinquième"};
		//String[] tabChoix = {};
		n=afficherChoixMenu(tabChoix);
		
		

		try{
			
			if (n<1){
				throw new MenuImpossible();
			}
			int retour = saisirChoix(n);
			Terminal.ecrireStringln("votre choix est: "+retour);

		}catch (MenuImpossible e){
			Terminal.ecrireStringln("Votre menu est impossible à construire");
		}






	}

}

class MenuImpossible extends ArithmeticException{}
class ChoixHorsLimites extends ArithmeticException{}