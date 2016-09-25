package com.domduf.exo3_1_2Objet;



public class TableauCompte {

	Compte[] tab;
	int longueur;
	Banque bCree;
	Titulaire tCree;



	/**
	 * constructeur par défaut
	 * @param n
	 */
	TableauCompte (int n, Banque b){
		tab= new Compte[n];
		longueur=0;
		bCree=b;
	}
	
	TableauCompte (int n, Titulaire t){
		tab= new Compte[n];
		longueur=0;
		tCree=t;
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
		
		String createur;
		//determine le nom du createur du tableau dynamiquement
		
		if (this.bCree==null){
			createur = tCree.appartient();
			Terminal.ecrireStringln("Affichage du tableau des comptes de "+createur);
		} else 
			Terminal.ecrireStringln("Affichage du tableau des comptes de "+bCree.appartient());

		
		
				
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
