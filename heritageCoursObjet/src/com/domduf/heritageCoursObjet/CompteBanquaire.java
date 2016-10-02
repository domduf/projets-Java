package com.domduf.heritageCoursObjet;

public class CompteBanquaire {
	
	 String nomProprietaire;
	 char[] numero;
	 double solde;
	
	
	// constructeurs
	
	public CompteBanquaire() {
		
	}
	
	public CompteBanquaire(String proprio, char[] num, double montant){
		this.nomProprietaire=proprio;
		this.numero=num;
		this.solde=montant;
	}

	
	
	// methodes d'instances
	
	public double getSoldeCourant(){
		Terminal.ecrireStringln("Le solde du compte de "+this.nomProprietaire+" est de "+this.solde);
		return this.solde;
	}
	
	public void setSoldeCourant(double montant){
		this.solde+=montant;
	}
	
	public void setNomProprio(){
		Terminal.ecrireStringln("Entrez le nouveau nom pour ce compte ("+this.nomProprietaire+")");
		this.nomProprietaire=Terminal.lireString();
	}
	
	public void deposer (double montant){
		this.solde += montant;
	}
	
	public void retirer(double montant){
		Terminal.ecrireStringln("appel de retrait sur compte simple");
		if (this.solde < montant){
			throw new provisionInsuffisanteErreur();
		}else{
			this.solde -= montant;
		}		
	}
	
	public void virerVers (CompteBanquaire c, double montant){
		this.retirer(montant);
		c.deposer(montant);
	}
	
	
}
class provisionInsuffisanteErreur extends Error{}