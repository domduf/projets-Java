package com.domduf.heritageCoursObjet;


public class CompteBanquaire {

	protected String nomProprietaire;
	protected char[] numero;
	protected double solde;

	// constructeurs

	public CompteBanquaire() {

	}

	/**
	 * 
	 * @param proprio
	 * @param num
	 * @param montant
	 */
	public CompteBanquaire(String proprio, char[] num, double montant) {
		this.nomProprietaire = proprio;
		this.numero = num;
		this.solde = montant;
	}

	// methodes d'instances

	public double getSoldeCourant() {

		String numeroCompte = "";
		String proprio = this.nomProprietaire;

		try {
			for (int i = 0; i < this.numero.length; i++) {
				numeroCompte += this.numero[i];
			}
		} catch (NullPointerException e) {
			// on ne fait rien...pas de n° de compte
			numeroCompte = " (pas défini)";
		}

		if (proprio == null) {
			proprio = "Nom pas défini";
		}

		Terminal.ecrireStringln("Le solde du compte n°" + numeroCompte + " de "
				+ proprio + " est de " + this.solde + " €");
		return this.solde;
	}

	public void setSoldeCourant(double montant) {
		this.solde += montant;
	}

	public void setNomProprio() {
		Terminal.ecrireStringln("Entrez le nouveau nom pour ce compte ("
				+ this.nomProprietaire + ")");
		this.nomProprietaire = Terminal.lireString();
	}

	public void deposer(double montant) {
		this.solde += montant;
	}

	public void retirer(double montant) {
		Terminal.ecrireStringln("appel de retrait sur compte simple");
		if (this.solde < montant) {
			throw new provisionInsuffisanteErreur();
		} else {
			this.solde -= montant;
		}
	}

	public void virerVers(CompteBanquaire c, double montant) {
		this.retirer(montant);
		c.deposer(montant);
	}

}
class provisionInsuffisanteErreur extends Error{}
