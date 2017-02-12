package com.domduf.exo_5_1_interfaces;

public class Exo_5_1_interfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Chat tigrou = new Chat("Tigrou");
		Chat noireau = new Chat("Noireau");
		Chat coton = new Chat("Coton");
		
		PeutCrier couillon = new Chien("Couillon");
		Chien chillien = new Chien("Chichi");
		Chien ducon = new Chien("Fureur");
		
		Lapin carotte = new Lapin("Carotte");
		
		
	
		PeutCrier tabCriant[] = {tigrou, coton, couillon, noireau, chillien,  ducon};
		
		for (int i=0;i<tabCriant.length;i++){
			tabCriant[i].crie();
		}
		
		Terminal.ecrireStringln(couillon.getClass().getSimpleName());
		
		
		

	}

}
