package com.domduf.exo6_2_2ObjetVolaille;

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
			tableau[i]="Choix---"+String.valueOf(i+1);
		}
		tabChoix=tableau;
	}

	MenuChoix(String nom, String[] tab){
		nomDeMenu=nom;
		tabChoix=tab;
	}


	// getter
	public void getNomMenu(){
		Terminal.ecrireStringln(this.nomDeMenu);
	}
	//setter
	public void setNomMenu(){
		Terminal.ecrireStringln("Entrez le nouveau nom pour "+this.nomDeMenu);
		this.nomDeMenu=Terminal.lireString();
	}
	
	
	//methodes d'instances
	
	/**
	 * affiche le menu
	 * @return le nb de choix
	 */
	public int afficherChoixMenu(){

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


	/**
	 * Affiche une proposition de choix parmis n valeurs
	 * @param n
	 * @return le choix
	 */
	static int saisirChoix(int n){
		int choix=0;
		boolean fini=false;
		Terminal.ecrireStringln("vous avez le choix entre "+n+ " valeurs.\n" +
				"'-->");

		while (!fini){
			try{
				choix=Terminal.lireInt();

				if (choix<1||choix>n){
					throw new ChoixHorsLimites();
				}
				fini=true;
			}catch (TerminalException e) {
				Terminal.ecrireStringln("Erreur d'entrée-----\nIL FAUT UN ENTIER" +
						" ENTRE 1 et "+n+"\n Recommencez:");
			}catch (ChoixHorsLimites e){
				Terminal.ecrireStringln("Erreur d'entrée--\nRESTEZ DANS LES LIMITES---" +
						" [1-"+n+"]\n Recommencez:");
			}

		}

		return choix;
	}
	
	/**
	 * affiche les choix du menu
	 * saisit l'entrée
	 * et retourne le choix
	 * @return entier
	 */
	public int choixDansMenu(){
		int retour=0;
		int n=this.afficherChoixMenu();
		
		try{
			
			if (n<1){
				throw new MenuImpossible();
			}
			 retour = saisirChoix(n);
			Terminal.ecrireStringln("votre choix est: "+retour);
			

		}catch (MenuImpossible e){
			Terminal.ecrireStringln("Votre menu est impossible à construire");
		}
		return retour;
		
	}



}


class MenuImpossible extends ArithmeticException{}
class ChoixHorsLimites extends ArithmeticException{}