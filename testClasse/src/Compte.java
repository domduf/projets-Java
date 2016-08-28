
public class Compte {
	int solde;
	String titulaire;
	int numero;
	
	void afficher(){
		Terminal.ecrireStringln("Solde: "+this.solde);
	}
	
	int deposer(int montant){
		this.solde=this.solde+montant;
		Terminal.ecrireStringln("dépot de "+montant+"€");
		return this.solde;
	}
	
	void retirer(int montant){
		this.solde=this.solde-montant;
	}

}
