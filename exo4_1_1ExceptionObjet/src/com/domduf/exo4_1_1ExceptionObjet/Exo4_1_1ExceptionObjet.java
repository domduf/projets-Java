package com.domduf.exo4_1_1ExceptionObjet;

public class Exo4_1_1ExceptionObjet  {

	static int[] tableau = {17,12,15,38,29,157,89,-22,0,5}; // 10 indices

	static int division(int indice, int diviseur) {

		//levée de Exception_tab si indice hors des limites [0;9]
		if (indice<0||indice >= tableau.length){
			throw new Exception_tab();
		}

		//levée de Exception_divParZero si essai de division par zéro
		if (diviseur==0){
			throw new Exception_divParZero();
		}

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
		boolean menu=true;
		x=0; y=0;

		while(menu){
			try {
				Terminal.ecrireString("entrez l'indice de l'entier à diviser");
				x=Terminal.lireInt();
				menu=false;
			}catch (TerminalException e) {
				//Terminal.ecrireStringln("rattrapée exception: "+e);
				Terminal.ecrireStringln("entrez un entier SVP");
			}
		}
		menu=true;
		
		while(menu){	
			try {
				Terminal.ecrireString("entrez le diviseur");
				y=Terminal.lireInt();
				menu=false;
			}catch (TerminalException e) {
				//Terminal.ecrireStringln("rattrapée exception: "+e);
				Terminal.ecrireStringln("entrez un entier SVP");
			}
		}

		try {
			Terminal.ecrireString("le resultat est: ");
			Terminal.ecrireIntln(division(x,y));	
		}catch (Exception_tab e){
			Terminal.ecrireStringln("l'indice est hors des limites");
		}catch (Exception_divParZero e){
			Terminal.ecrireStringln("division par zéro INTERDITE !\n" +
					"Retournez à la primaire...");

		}catch (Attention_pasJuste e){

			Terminal.ecrireStringln("Attention la division n'est pas juste");
		}


	}

}



class Attention_pasJuste extends ArithmeticException{}
class Exception_divParZero extends ArithmeticException{}
class Exception_tab extends ArrayIndexOutOfBoundsException{}
