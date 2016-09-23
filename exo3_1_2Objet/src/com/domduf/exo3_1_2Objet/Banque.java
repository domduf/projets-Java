package com.domduf.exo3_1_2Objet;

public class Banque {
	
	String nom;
	TableauCompte tous;
	int numero=0;
	
	/**
	 * Création d'un Banque
	 * @param n
	 */
	public Banque(String n){
		Terminal.ecrireStringln("Création de la banque "+n);
		nom=n;
		tous= new TableauCompte(50);
	}
	
	/**
	 * Création d'un compte pour un seul Titulaire
	 * @param titulaire
	 */
	public void creerComptePour (Titulaire titulaire){
		
		Terminal.ecrireStringln("Banque "+this.nom+" création d'un compte pour "+titulaire.getNom());
		Compte nouveauCompte = new Compte(numero, this);
		numero++;
		nouveauCompte.afficher();
		Terminal.ecrireStringln("le nom du titulaire "+titulaire.getNom());
		titulaire.mesComptes.ajouter(nouveauCompte);		
		Terminal.ecrireStringln("----------------------------------------------");
		tous.ajouter(nouveauCompte);
	}
	
	/**
	 * Création d'un compte pour un tableau de Titulaire[]
	 * @param tableauTitulaire
	 */
	public void creerComptePour (Titulaire[] tableauTitulaire){
		Terminal.ecrireStringln("Banque "+this.nom+", création d'un nouveau compte.");
		Compte nouveauCompte = new Compte(numero, this);
		numero++;
		nouveauCompte.afficher();
		
		for (int i=0;i<tableauTitulaire.length;i++){

			Terminal.ecrireStringln("le nom du titulaire "+tableauTitulaire[i].getNom());
			//tous.ajouter(nouveauCompte);
			tableauTitulaire[i].mesComptes.ajouter(nouveauCompte);
		}
		Terminal.ecrireStringln("----------------------------------------------");
		tous.ajouter(nouveauCompte);
		
	}
	
	/**
	 * affiche le nombre de comptes de cette banque
	 */
	public void nombreDeComptes (){
		
		Terminal.ecrireStringln("Nombre de comptes de la banque "+this.nom+": "+this.tous.longueur);
		
	}
	

	
	
	
	public void afficherTousCompte(){
	
	}
	
	public String getNom(){
		return this.nom;
	}
	
	//public creerCompte


}
