
public class Conversion {

	/**
	 * ce programme d'une complexité absolue
	 * convertie une somme entrée en Euros vers...
	 * des Francs.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double euros, francs=0 ;
		
		Terminal.ecrireStringln("Somme en Euros ? ");
		euros= Terminal.lireDouble();
		//francs = euros*6.55957 ;
		//Terminal.ecrireStringln("Cette somme correspond à : "+ francs + " Francs.");
		
		Terminal.ecrireStringln("Cette somme correspond à : "+ conversion(euros) + " Francs.");		

	}
	
	/**
	 * fonction de conversion d'un argument en euros
	 * @param arguA
	 * @return prix en Francs
	 */
	public static double conversion(double arguA){
		return (arguA*6.55957);
	
	}

}
