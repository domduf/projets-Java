package com.domduf.exo3_1_2Objet;

public class Banque {
	
	String nom;
	TableauCompte tous;
	int numero=0;
	
	public Banque(String n){
		nom=n;
		tous= new TableauCompte(50);
	}
	
	public void creerComptePour (Titulaire titulaire){
		Terminal.ecrireStringln("Banque "+this.nom);
		Compte nouveauCompte = new Compte(numero);
		numero++;
		nouveauCompte.afficher();
		Terminal.ecrireStringln("le nom du titulaire "+titulaire.getNom());
		//tous.ajouter(nouveauCompte);
		titulaire.mesComptes.ajouter(nouveauCompte);		
		Terminal.ecrireStringln("----------------------------------------------");
		tous.ajouter(nouveauCompte);
	}
	
	
	public void creerComptePour (Titulaire[] tableauTitulaire){
		Terminal.ecrireStringln("Banque "+this.nom+", création d'un nouveau compte.");
		Compte nouveauCompte = new Compte(numero);
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
	
	public void nombreDeComptes (/*int numCompte, int montant*/){
		
		Terminal.ecrireStringln("Nombre de comptes de la banque "+this.nom+": "+this.tous.longueur);
		
	}
	

	
	
	
	public void afficherTousCompte(){
	
	}
	
	public String getNom(){
		return this.nom;
	}
	
	//public creerCompte


}
