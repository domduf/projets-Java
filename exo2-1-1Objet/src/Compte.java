
public class Compte {
	
	int solde;
	String nom;
	
	public Compte(String nomCompte){
	nom=nomCompte ;
	}
	
	
	
	void deposer(int montant){
		solde=solde+montant;
	}
	
	void retirer(int montant){
		solde=solde-montant;
	}
	
	void virerVers (int montant, Compte destination){
		this.retirer(montant);
		destination.deposer(montant);
	}
	
	void afficher (){
		Terminal.ecrireStringln("le solde du compte "+nom+" est de "+solde+" €.");
	}
}
