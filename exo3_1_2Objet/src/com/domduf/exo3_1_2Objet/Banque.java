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
		tous= new TableauCompte(50, this.getNom());
	}

	/**
	 * Création d'un compte pour un seul Titulaire
	 * @param titulaire
	 */
	public void creerComptePour (Titulaire titulaire){

		Terminal.ecrireStringln("Banque "+this.nom+" création d'un compte pour "+titulaire.getNom());
		Compte nouveauCompte = new Compte(numero, this, titulaire);
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

		// determine 1er de la liste comme titulaire principal
		Titulaire titulairePrincipal=tableauTitulaire[0];
		Terminal.ecrireStringln("Titulaire principal "+titulairePrincipal.getNom());
		Compte nouveauCompte = new Compte(numero, this, titulairePrincipal );
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




	/**
	 * affiche tous les Comptes de cette Banque
	 */
	public void afficherTousCompte(){
		Terminal.ecrireStringln("----------------------------");
		Terminal.ecrireStringln("Affiche tous les comptes de la banque "+this.nom+":");

		for (int i=0;i<this.tous.longueur;i++){

			this.tous.compte(i).afficher();

		}
		Terminal.ecrireStringln("----------------------------");
	}

	/**
	 * Affiche tous les Comptes de cette Banque appartenant au Titulaire
	 * @param t
	 */
	public void afficherTousCompte(Titulaire t){
		
		Terminal.ecrireStringln("----------------------------");
		Terminal.ecrireStringln("Affiche tous les comptes de la banque "+this.nom+" appartenant à "+t.getNom());

		for (int i=0;i<this.tous.longueur;i++){

			if(this.tous.compte(i).titulaire==t){
				this.tous.compte(i).afficher();
			}


		}
		Terminal.ecrireStringln("----------------------------");
	}

	public String getNom(){
		return this.nom;
	}

	


}
