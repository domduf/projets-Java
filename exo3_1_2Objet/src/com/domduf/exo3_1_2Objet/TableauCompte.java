package com.domduf.exo3_1_2Objet;



public class TableauCompte {

	Compte[] tab;
	int longueur;



	/**
	 * constructeur par défaut
	 * @param n
	 */
	TableauCompte (int n){
		tab= new Compte[n];
		longueur=0;
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
	 * affiche les numéros 
	 */
	public void afficher (){
		for (int i=0;i<tab.length;i++){

			if (tab[i]!=null){

				Terminal.ecrireStringln("Compte n°"+i+" numero "+ tab[i].numero);
				tab[i].afficher();
			}

		}
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
