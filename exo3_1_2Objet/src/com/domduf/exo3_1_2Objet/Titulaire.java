package com.domduf.exo3_1_2Objet;

/**
 * 
 * @author domduf
 *
 */
public class Titulaire {
	String nom;
	TableauCompte mesComptes;

	/**
	 * Création d'un Titulaire
	 * @param n
	 */
	public Titulaire (String n){
		Terminal.ecrireStringln("Création du titulaire "+n);
		nom=n;
		mesComptes = new TableauCompte(10);
	}

	/**
	 * Donne procuration à Titulaire  sur son Compte de la Banque 
	 * @param t Titulaire
	 * @param b Banque 
	 * @param numCompte n° du Compte
	 */
	public void donneProcuration( Titulaire t, Banque b, int numCompte){


		t.mesComptes.ajouter(this.mesComptes.compte(numCompte));

	}

	/**
	 * 
	 * @return le nom du Titulaire
	 */
	public String getNom(){
		return this.nom;
	}


}
