package com.domduf.exo3_1_2Objet;



public class TableauCompte {

	Compte[] tab;
	int longueur;
	Detentrice detentrice;


	/**
	 * 
	 * @param n
	 * @param d
	 */
	TableauCompte (int n, Detentrice d){
		tab= new Compte[n];
		longueur=0;
		detentrice=d;
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
	 * affiche le tableau des comptes du detenteur du tableau
	 */
	public void afficherTableauCompte (){
		Terminal.ecrireStringln("-------------------------------------");

		Terminal.ecrireStringln("Affichage du tableau des comptes de "
		+detentrice.appartient());

		for (int i=0;i<tab.length;i++){

			if (tab[i]!=null){

				Terminal.ecrireStringln("Compte n°"+i);
				Terminal.ecrireString("------------");
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
