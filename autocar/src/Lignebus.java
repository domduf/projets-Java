
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
	
	

	public void afficher(){
		Terminal.ecrireStringln("Nom de la ligne: "+nomLigne);
		for (int i=0;i<tarifTronçons.length;i++){
			Terminal.ecrireString(arretsDesservis[i]+" "+(i+1)+" ");
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
		for (int i=0;i<tarifTronçons.length;i++){
			Terminal.ecrireString("Entrez le tarif du tronçon "+(i+1)+" ");
			tarifTronçons[i]=(float)Terminal.lireDouble();
		}
		
	}
}
