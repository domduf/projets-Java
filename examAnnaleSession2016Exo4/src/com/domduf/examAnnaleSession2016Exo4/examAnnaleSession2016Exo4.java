package com.domduf.examAnnaleSession2016Exo4;

public class examAnnaleSession2016Exo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carnivore chat = new Carnivore();
		Carnivore loup = new Carnivore("loup");		
		chat.setTonNom("Tigrou");
		Herbivore lapin= new Herbivore("lapinou");
		Carnassier hyene =new Carnassier("la hyenne");
		
		
		chat.statut();
		

		loup.statut();
		
		
		
		loup.mange(chat);

		chat.statut();
		

		lapin.statut();
		

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
		
		
		Terminal.ecrireStringln("----------------------------");
		
		lapin.estMangéPar(loup);
		lapin.statut();		

	}

}
