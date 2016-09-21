package com.domduf.exo3_1_2Objet;

public class Banque {
	
	String nom;
	TableauCompte tous;
	int numero=0;
	
	public Banque(String n){
		nom=n;
		tous= new TableauCompte(50);
	}
	
	
	
	public void creerComptePour (Titulaire[] tableauTitulaire){
		Terminal.ecrireStringln("Banque "+this.nom);
		Compte nouveauCompte = new Compte(numero);
		numero++;
		nouveauCompte.afficher();
		
		for (int i=0;i<tableauTitulaire.length;i++){

			Terminal.ecrireStringln("le nom du titulaire "+tableauTitulaire[i].getNom());
			//tous.ajouter(nouveauCompte);
			
		}
		Terminal.ecrireStringln("----------------------------------------------");
		tous.ajouter(nouveauCompte);
		
	}
	
	
	public void afficherTousCompte(){
	
	}
	
	
	//public creerCompte


}
