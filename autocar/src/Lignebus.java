
public class Lignebus {
	
	private String nomLigne;
	private float[] tarifTronçons;
	private String[] arretsDesservis;
	
	//constructeur
	public Lignebus (int a){
		nomLigne="ligne Vierge";
		tarifTronçons= new float [a];
		arretsDesservis=new String[a];
		for (int i=0;i<a;i++){
			
			tarifTronçons[i]=0;
			arretsDesservis[i]="?";
		}	
		
	}
	
	//stetter
	public void setNomLigne(){
		Terminal.ecrireStringln("entrez le nom de la ligne de bus:");
		this.nomLigne=Terminal.lireString();
	}
	
	
	public int donneNumero (){


		Terminal.ecrireStringln("Entrez le nom de l'arrêt dont vous souhaitez connaître le n°: ");
		String arret=Terminal.lireString();
		Terminal.ecrireStringln("Votre entrée: "+arret);



		for (int i =0 ; i < this.arretsDesservis.length ; i++ ){
			//Terminal.ecrireStringln((i+1)+" "+this.arretsDesservis[i]);

			if (this.arretsDesservis[i].equalsIgnoreCase(arret)) {
				Terminal.ecrireString("Voici le n°: "+(i+1));
				Terminal.sautDeLigne();

				return i+1;
			}
		}
		return 0;

	}
	
	public void afficher(){
		Terminal.ecrireStringln("Nom de la ligne: "+nomLigne);
		for (int i=0;i<tarifTronçons.length;i++){
			Terminal.ecrireStringln("-arrêt n°"+(i+1)+" \""+arretsDesservis[i]+"\" ");
			if(i<tarifTronçons.length-1)Terminal.ecrireStringln("           --"+tarifTronçons[i]+"€"+"--");
		}
		Terminal.sautDeLigne();
		
	}

	public void setTousArret(){
		for (int i=0;i<arretsDesservis.length;i++){
			Terminal.ecrireString("Entrez le nom de l'arrêt "+(i+1)+" ");
			arretsDesservis[i]=Terminal.lireString();
		}
	}

	public void setUnArret(int a){
		Terminal.ecrireString("Entrez le nom de l'arrêt "+(a));
		arretsDesservis[a-1]=Terminal.lireString();
		
		
	}

	public void setTousTarif(){
		for (int i=0;i<(tarifTronçons.length-1);i++){
			Terminal.ecrireString("Entrez le tarif du tronçon "+(i+1)+" ");
			tarifTronçons[i]=(float)Terminal.lireDouble();
		}
	
	}

	public  void calculPrixDegressif (){
		
		float prixDegressif=0f;
		int taux=100;
		
		Terminal.ecrireStringln("Calcul prix entre deux arrêts (tarif degressif) ");
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
		//Terminal.sautDeLigne();
		
		while (ind1<ind2){
			prixDegressif=prixDegressif+(this.tarifTronçons[ind1]*taux/100);
			//Terminal.ecrireStringln("Le prix est de "+prixDegressif+" le taux est de "+taux+" ind1="+ind1);

			ind1=ind1+1;
			taux=taux-10;
		}
		Terminal.ecrireString("Le prix degressif est de "+prixDegressif+"€");
		
		
	}

	public void  calculPrix (){
	
		Terminal.ecrireStringln("Calcul prix entre deux arrêts (tarif normal) ");
	
		Terminal.ecrireString("Entrez l'indice de la ville de départ");
		int depart=Terminal.lireInt();
		int ind1=depart-1;
		Terminal.sautDeLigne();
	
		Terminal.ecrireString("Entrez l'indice de la ville d'arrivée");
		int arrivee=Terminal.lireInt();
		int ind2=arrivee-1;
		//Terminal.sautDeLigne();	
	
	
		float prixBaseInd1= base(ind1, this.tarifTronçons);
		//Terminal.ecrireStringln("prixBaseInd1 ="+prixBaseInd1);
		float prixBaseInd2= base(ind2, this.tarifTronçons);
		//Terminal.ecrireStringln("prixBaseInd2 ="+prixBaseInd2);	
	
	
		//calcul
		float calcul2 = prixBaseInd1 - prixBaseInd2 ;
	
		//affichage de la valeur absolue de la différence
		Terminal.ecrireStringln("Le prix normal est de "+Math.abs(calcul2)+"€");
	
	}



	private static float base (int indice, float[] prix){
		float a=0f;
		for (int i = 0 ; i< indice ; i++) {
			a = a + prix[i];	
	
		}
		return a;
	}
}
