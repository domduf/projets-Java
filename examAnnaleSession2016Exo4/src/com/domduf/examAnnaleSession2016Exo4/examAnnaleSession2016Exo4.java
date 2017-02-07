package com.domduf.examAnnaleSession2016Exo4;

public class examAnnaleSession2016Exo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carnivore chat = new Carnivore();
		chat.statut();
		
		Carnivore loup = new Carnivore("loup");
		loup.statut();
		
		loup.mange(chat);
		chat.setTonNom("Tigrou");
		chat.statut();
		
		Herbivore lapin= new Herbivore("lapinou");
		lapin.statut();
		
		Carnassier hyene =new Carnassier("la hyenne");
		hyene.statut();
		
		hyene.mange(loup);
		loup.statut();
		
		hyene.mange(lapin);
		lapin.statut();
		
		lapin.mange(hyene);
		
		loup.mange(lapin);
		lapin.statut();
		
		hyene.mange(lapin);
		lapin.statut();
		
		lapin.estMangéPar(loup);
		lapin.statut();		

	}

}
