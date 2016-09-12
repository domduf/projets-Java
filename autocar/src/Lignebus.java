
public class Lignebus {
	
	String nomLigne;
	float[] tarifTronçons;
	String[] arretsDesservis;
	
	public Lignebus (int a){
		nomLigne="ligne Vierge";
		tarifTronçons= new float [a];
		arretsDesservis=new String[a];
		for (int i=0;i<a;i++){
			
			tarifTronçons[i]=0;
			arretsDesservis[i]="arret à definir";
		}	
		
	}
	
	

	public void  calculPrix (){
	
	
	
		Terminal.ecrireString("Entrez l'indice de la ville de départ");
		int depart=Terminal.lireInt();
		int ind1=depart-1;
		Terminal.sautDeLigne();
	
		Terminal.ecrireString("Entrez l'indice de la ville d'arrivée");
		int arrivee=Terminal.lireInt();
		int ind2=arrivee-1;
		Terminal.sautDeLigne();	
	
	
		float prixBaseInd1= base(ind1, this.tarifTronçons);
		Terminal.ecrireStringln("prixBaseInd1 ="+prixBaseInd1);
		float prixBaseInd2= base(ind2, this.tarifTronçons);
		Terminal.ecrireStringln("prixBaseInd2 ="+prixBaseInd2);	
	
	
		//calcul
		float calcul2 = prixBaseInd1 - prixBaseInd2 ;
	
		//affichage de la valeur absolue de la différence
		Terminal.ecrireStringln("Le prix (methode de valeur absolue)="+Math.abs(calcul2)+"€");
	
	}



	public static float base (int indice, float[] prix){
		float a=0f;
		for (int i = 0 ; i< indice ; i++) {
			a = a + prix[i];	
	
		}
		return a;
	}



	public void afficher(){
		Terminal.ecrireStringln("Nom de la ligne: "+nomLigne);
		for (int i=0;i<tarifTronçons.length;i++){
			Terminal.ecrireString("-arrêt n°"+(i+1)+" \""+arretsDesservis[i]+"\" ");
			Terminal.ecrireStringln("Tarif tronçon: "+tarifTronçons[i]);
		}
		
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
}
