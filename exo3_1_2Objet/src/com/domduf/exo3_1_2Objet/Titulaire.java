package com.domduf.exo3_1_2Objet;

/**
 * 
 * @author domduf
 *
 */
public class Titulaire implements Detentrice {
	String nom;
	TableauCompte mesComptes;

	/**
	 * Création d'un Titulaire
	 * @param n
	 */
	public Titulaire (String n){
		Terminal.ecrireStringln("Création du titulaire "+n);
		nom=n;
		mesComptes = new TableauCompte(10, this);
	}

	/**
	 * Donne procuration à Titulaire  sur son Compte de la Banque 
	 * @param t Titulaire
	 * @param b Banque 
	 * @param numCompte n° du Compte
	 */
	public void donneProcuration( Titulaire t, Banque b, int numCompte){

		if (true){
			t.mesComptes.ajouter(b.getTabCompte().compte(numCompte));
		Terminal.ecrireStringln(this.getNom()+" donne procuration à "+t.getNom()+" pour son compte n°"+numCompte
				+" à la banque "+b.getNom());
		}

		

	}

	/**
	 * 
	 * @return le nom du Titulaire
	 */
	public String getNom(){
		return this.nom;
	}

	public String appartient(){
		return "Titulaire "+this.getNom();
	}

}
