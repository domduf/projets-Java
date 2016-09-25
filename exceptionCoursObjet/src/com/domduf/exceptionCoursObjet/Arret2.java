package com.domduf.exceptionCoursObjet;

public class Arret2 {
	
	
	public static void P(){
		Terminal.ecrireStringln("entrez un entier négatif");
		int x= Terminal.lireInt();
		
		if (x>0){
			throw new Stop();
		}
	}

}
