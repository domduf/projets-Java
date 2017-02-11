package com.domduf.exoCorrige20016_7_1;

public class ExoCorrige20016_7_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Terminal.ecrireStringln("exoCorrige20016_7_1");
		
		//declaration et initialisation des variables utiles
		int nbMaxDeNote=10;
		int tabNotes[]= new int[nbMaxDeNote]; 
		int index=0;
		
		// construction du menu général
		String[] tabChoixGeneral = {
				"ajouter une note",
				"ajouter plusieurs notes",
				"afficher toutes les notes",
				"calculer la moyenne ",
				"SORTIR"};
		
		MenuChoix menuGeneral = new MenuChoix("Général", tabChoixGeneral);
		
		boolean choix= true;
		int c;
		
		// boucle de choix dans le menu general
		while (choix){
			
			c=menuGeneral.choixDansMenu();
			
			if (c==1){
				
				index = ajouterUneNote(index, tabNotes, nbMaxDeNote );
				
				
			}
			else if (c==2){
				
				index = ajouterPlusieursNotes(index,tabNotes, nbMaxDeNote);

				
			}
			else if (c==3){
				
				afficherNotes(index,tabNotes );
	
			}
			else if (c==4){
				
				afficheMoyenne(index, tabNotes);
			}
			else 
				{
				Terminal.ecrireStringln("Goodbye");
				choix=false;
				}
		}
			

	}
	
	/**
	 * 
	 * @param index
	 * @param tableau
	 * @param nbMaxDeNote
	 * @return
	 */
	public static int ajouterUneNote( int index, int[] tableau, int nbMaxDeNote){
		
		if ( testTableauNonComplet(index, nbMaxDeNote)){
			Terminal.ecrireString("entrez votre note");
		int note = Terminal.lireInt();
		tableau[index]=note;
		Terminal.ecrireStringln("une note a été ajoutée");
		index++;
		}
		return index;
	
		
	}
	
	/**
	 * 
	 * @param index
	 * @param tabNotes
	 * @param nbMaxDeNote
	 * @return
	 */
	public static int ajouterPlusieursNotes(int index, int[] tabNotes, int nbMaxDeNote){

	
	Terminal.ecrireStringln("combien de notes à entrer ?");
	int nbNoteAEntrer=Terminal.lireInt();
	
	
	
	for (int i=0; (i < nbNoteAEntrer)& testTableauNonComplet(index, nbMaxDeNote); i++){
		index=ajouterUneNote(index, tabNotes, nbMaxDeNote );
		
	}
	
	return index;
	
	}
	
	
	/**
	 * 
	 * @param index
	 * @param tableau
	 */
	public static void afficherNotes(int index, int[] tableau){
		
		Terminal.ecrireStringln("votre tableau dispose de "+tableau.length + " places");
		Terminal.ecrireStringln("Il vous reste "+(tableau.length-index) + " places");		
		
		for (int i=0; i < index ; i++){
			Terminal.ecrireStringln("	note ("+(i+1)+")-- "+ tableau[i]);
		}
	}
	
	
	/**
	 * calcule et affiche la moyenne des notes du tableau
	 * @param index
	 * @param tableau
	 */
	public static void afficheMoyenne(int index, int[] tableau) {
		
		int somme=0;
		
		afficherNotes(index, tableau);
		
		for (int i=0; i< index; i++){
			somme=somme+tableau[i];
			//Terminal.ecrireStringln("index: "+index+" ---somme: "+somme);
		}
		double moyenne=( (double)somme / (double)index);
		
		
		Terminal.ecrireStringln("La moyenne des notes est de "+ moyenne);
		
		
	}
	
	/**
	 * test si le tableau a encore des cases vides
	 * @param index
	 * @param nbMaxDeNote
	 * @return true si encore de la place dans le tableau de notes
	 */
	public static boolean testTableauNonComplet(int index,int nbMaxDeNote){
		//Terminal.ecrireStringln("dans TEST index:"+ index);
		if (index<nbMaxDeNote){
			
			return true;
		}
		else {
			Terminal.ecrireStringln("IL N Y A PLUS de PLACE...");
			return false;
		}
			
	}
	
}

