package com.domduf.exceptionCoursObjet;

public class ExceptionCoursObjet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4; // modifiez ici la valeur dont on veut connaitre la factorielle
		int res;

		// essai de la fonction factorielle protegée par Pasdefini
		try {
			res = Factorielle.factorielle(n);
			Terminal.ecrireStringln("resultat: !"+n+" = "+res);}
		catch (PasDefini e){
			res=n;
			Terminal.ecrireStringln("Retour à l'envoyeur, entrez un nombre positif.\n " +
					"Vous avez entré "+n +"\n"+
					"Exception levée et rattrapée: "+e);
		}

		Terminal.ecrireStringln("----------------------------------------");
		
		//essai de l'exception Stop
		try{
			Arret2.P();
			Terminal.ecrireStringln("dans le try de P()");
		}
		catch (Stop e){ // entree negative, comme testée dans Arret2
			Terminal.ecrireStringln("dans le catch de P()"+
					"Exception levée et rattrapée: "+e);
		}
		catch (TerminalException e){ // exception levée par Terminal.java
			Terminal.ecrireStringln("dans le deuxieme catch de P()\n" +
					"erreur d'entree class Terminal"+e);
		}
		catch (Exception e){
			Terminal.ecrireStringln("dans le troisieme catch de P()\n" +
					"erreur d'entrée sortie "+e);
		}
		Terminal.ecrireStringln("fin du programme");

	}

}
