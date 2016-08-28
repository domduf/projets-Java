
public class CalculPrixTTC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Entrée et déclaration des données.
		 */
		double  pHT,pTTC=0;
		int t=2;
		

		/**
		 * algorithme
		 */
		// somme HT et taux à l'utilisateur
		Terminal.ecrireStringln("Entrer une somme HT: ");
		pHT=Terminal.lireDouble();
		
		while  ((t!=0 )&&(t!=1))
		{
		Terminal.ecrireStringln("Taux normal(0) ou réduit(1) ?: ");
		t=Terminal.lireInt();

		}
				
		if (t==0) {
			pTTC=pHT*0.196+pHT;	
		}
		
		else if (t==1) {
			pTTC=pHT*0.05+pHT;
		}
		Terminal.ecrireStringln("Le prix TTC est de "+ pTTC+ "€");
		/**
		 * Autres choses
		 */
		for ( int i=1;i<pHT;i=i+1) {
			Terminal.ecrireString("*");
		}	
		Terminal.sautDeLigne();
		for ( int i=1;i<pTTC;i=i+1) {
			Terminal.ecrireString("*");
		}
		Terminal.sautDeLigne();
			
			
						
			
		
	
	}
}
