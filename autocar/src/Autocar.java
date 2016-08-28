
public class Autocar {

	/**
	 * affiche les villes du tableau
	 * @param ligne1
	 */
	public static void	affichageDesVilles(String[] ligne){

		for (int i =0 ; i < ligne.length ; i++ ){
			Terminal.ecrireStringln((i+1)+"-"+ligne[i]);
		}
	}

	/**
	 * 
	 * @param entreeVille
	 * @param ligne
	 * @return l indice de la ville
	 */
	public static int donneVille (String entreeVille, String[] ligne){


		Terminal.ecrireStringln("Votre entrée: "+entreeVille);



		for (int i =0 ; i < ligne.length ; i++ ){
			Terminal.ecrireStringln((i+1)+" "+ligne[i]);

			if (ligne[i].equalsIgnoreCase(entreeVille)) {
				Terminal.ecrireStringln("OK");

				return i+1;
			}
		}
		return 0;

	}


	public static float base (int indice, float[] prix){
		float a=0f;
		for (int i = 0 ; i< indice ; i++) {
			a = a + prix[i];	

		}
		return a;
	}

	/**
	 * calcul du prix 
	 * on se base sur une valeur absolue, pour pouvoir
	 * entrer les villes dans n'importe quel ordre
	 * @param villes
	 * @param prix
	 */
	public static void calculPrix (String[] villes, float[] prix){



		Terminal.ecrireString("Entrez l'indice de la ville de départ");
		int ind1=Terminal.lireInt()-1;
		Terminal.sautDeLigne();

		Terminal.ecrireString("Entrez l'indice de la ville d'arrivée");
		int ind2=Terminal.lireInt()-1;
		Terminal.sautDeLigne();	


		float prixBaseInd1= base(ind1, prix);
		Terminal.ecrireStringln("prixBaseInd1 ="+prixBaseInd1);
		float prixBaseInd2= base(ind2, prix);
		Terminal.ecrireStringln("prixBaseInd2 ="+prixBaseInd2);	


		//calcul
		float calcul2 = prixBaseInd1 - prixBaseInd2 ;

		//affichage de la valeur absolue de la différence
		Terminal.ecrireStringln("Le prix (methode de valeur absolue)="+Math.abs(calcul2)+"€");

	}

	public static void calculPrixDegressif (String[] villes, float[] prix){
		
		float prixDegressif=0f;
		int taux=100;
		
		Terminal.ecrireString("Entrez l'indice de la ville de départ");
		int ind1=Terminal.lireInt()-1;
		Terminal.sautDeLigne();

		Terminal.ecrireString("Entrez l'indice de la ville d'arrivée");
		int ind2=Terminal.lireInt()-1;
		Terminal.sautDeLigne();
		
		//on suppose le prix identique dans les deux sens
		//donc interversion des indices si ind1>ind2
		if (ind1>ind2){
			int a=ind1;
			ind1=ind2;
			ind2=a;
		}
		//Terminal.ecrireString("Ind1:"+(ind1+1)+" Ind2:"+(ind2+1));
		Terminal.sautDeLigne();
		
		while (ind1<ind2){
			prixDegressif=prixDegressif+(prix[ind1]*taux/100);
			//Terminal.ecrireStringln("Le prix est de "+prixDegressif+" le taux est de "+taux+" ind1="+ind1);

			ind1=ind1+1;
			taux=taux-10;
		}
		Terminal.ecrireString("Le prix degressif est de "+prixDegressif);
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		// init des villes desservies
		String[] ligne1 = {"Vierzon","Salbris","Nouans","Lamotte Beuvron","La Ferte St Aubin", "Orléans"};
		//init des prix pour ces villes
		float[] prix1 = {3.20f,1.80f,2.30f,4.20f,5.00f,0.00f};

		//affichage des villes desservies
		affichageDesVilles(ligne1);

		calculPrix(ligne1, prix1);
		calculPrixDegressif(ligne1, prix1);
		
		Terminal.ecrireStringln("Entrez votre ville please");
		String entree = Terminal.lireString();

		Terminal.ecrireIntln(donneVille(entree, ligne1 ));
*/
		
		Lignebus ligne7;
		ligne7= new Lignebus();
		Terminal.ecrireStringln(ligne7.nomLigne);
		ligne7.nomLigne="Ligne 7";
		Terminal.ecrireStringln(ligne7.nomLigne);



	}


}	
