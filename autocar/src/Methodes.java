

public class Methodes {

	
	/**
	 * Permet d'entrer et de filtrer une option de menu.
	 * @return int choix entre 0 et 5
	 */
	public static int entreeMenu(){
		
		while (true){
		
		Terminal.ecrireString(" SVP:");
		char n= Terminal.lireString().charAt(0);// on ne tient compte que du 1er caractere de la chaine entrée
		if (n<48||n>53){ //filtre entre 0 et 5 
			Terminal.ecrireString("Merci d'entrer une valeur correcte..");
		} else return ((int)n - 48); // retourne la valeur correspondante au caractère (ascii)
		}
	}
	
}