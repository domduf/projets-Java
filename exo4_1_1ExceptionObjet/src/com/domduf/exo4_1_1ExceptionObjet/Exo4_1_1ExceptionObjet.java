package com.domduf.exo4_1_1ExceptionObjet;

public class Exo4_1_1ExceptionObjet  {

	static int[] tableau = {17,12,15,38,29,157,89,-22,0,5}; // 10 indices

	static int division(int indice, int diviseur) {

		//levée de Attention_pasJuste si reste !=0
		if (tableau[indice]%diviseur!=0){
			int reste=tableau[indice]%diviseur;
			Terminal.ecrireInt(tableau[indice]/diviseur);
			Terminal.ecrireStringln(" et le reste est "+reste);
			throw new Attention_pasJuste();
		}

		return tableau[indice]/diviseur;

	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		boolean menu;
		x=0; y=0;

		// entrée de l'indice du tableau tant que non conforme
		menu=true;
		while(menu){
			try {
				//affiche le tableau des entiers
				for(int i=0;i<tableau.length;i++){
					Terminal.ecrireInt(tableau[i]);
					Terminal.ecrireString(" | ");

				}Terminal.sautDeLigne();


				Terminal.ecrireString("entrez l'indice de l'entier à diviser");
				x=Terminal.lireInt();

				//levée de Exception_tab si indice hors des limites [0;9]
				if (x<0||x >= tableau.length){
					throw new Exception_tab();
				}

				//sortie de la boucle d'entrée
				menu=false;

			}catch (TerminalException e) {
				Terminal.ecrireStringln("ERREUR--------entrez un entier SVP");
				
			}catch (Exception_tab e){
				Terminal.ecrireString("ERREUR--------l'indice est hors des limites [0-");
				Terminal.ecrireInt(tableau.length-1);
				Terminal.ecrireStringln("]");
			}
		}


		// entrée du diviseur tant que non conforme
		menu=true;
		while(menu){	
			try {
				Terminal.ecrireString("entrez le diviseur");
				y=Terminal.lireInt();		

				//levée de Exception_divParZero si essai de division par zéro
				if (y==0){
					throw new Exception_divParZero();
				}
				menu=false;
			}catch (TerminalException e) {

				Terminal.ecrireStringln("ERREUR--------entrez un entier SVP");

			}catch (Exception_divParZero e){

				Terminal.ecrireStringln("ERREUR--------division par zéro INTERDITE !\n" +
						"Retournez à la primaire...");
			}
		}

		// appel de la fonction division(x,y)
		try {
			Terminal.ecrireString("le resultat est: ");
			Terminal.ecrireIntln(division(x,y));	
		}catch (Attention_pasJuste e){// signalement si division non entière

			Terminal.ecrireStringln("Attention la division n'est pas juste");
		}

	}


}



class Attention_pasJuste extends ArithmeticException{}
class Exception_divParZero extends ArithmeticException{}
class Exception_tab extends ArrayIndexOutOfBoundsException{}
