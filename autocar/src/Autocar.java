
public class Autocar {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Terminal.ecrireStringln("Combien d'arrêts pour la ligne de bus ?:");
		int nb=Terminal.lireInt();
		Lignebus bus1= new Lignebus(nb);
		
		
		bus1.setNomLigne();
		bus1.afficher();		
		bus1.setTousArret();
		bus1.donneNumero();
		bus1.setTousTarif();
		bus1.afficher();
		bus1.calculPrix();
		bus1.calculPrixDegressif();

		

	}


}	
