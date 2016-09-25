package com.domduf.exo3_1_2Objet;



public class TableauCompte {

	Compte[] tab;
	int longueur;
	String createur;



	/**
	 * constructeur par défaut
	 * @param n
	 */
	TableauCompte (int n, String c){
		tab= new Compte[n];
		longueur=0;
		createur=c;
	}

	/**
	 * ajoute le Compte au tableau
	 * @param c
	 */
	public void ajouter (Compte c){

		if(longueur<tab.length){
			tab[longueur]=c;
			longueur++;
		}
	}


	/**
	 * affiche le tableau des comptes du createur du tableau
	 */
	public void afficherTableauCompte (){
		Terminal.ecrireStringln("-------------------------------------");
		Terminal.ecrireStringln("Affichage du tableau des comptes de "+createur);
		for (int i=0;i<tab.length;i++){

			if (tab[i]!=null){

				Terminal.ecrireStringln("Compte n°"+i);
				Terminal.ecrireString("---");
				tab[i].afficher();
			}

		}
		Terminal.ecrireStringln("-------------------------------------");
	}

	/**
	 * retourne l'objet Compte suivant l'indice dans le tableau
	 * @param indice
	 * @return Compte
	 */
	public Compte compte (int indice){
		return this.tab[indice];
	}


}
