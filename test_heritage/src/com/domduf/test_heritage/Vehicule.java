package com.domduf.test_heritage;

import java.math.BigDecimal;

public class Vehicule {
	
	//init des immatriculations
	static private int noId=0;
	//construction d'un tableau de 10 vehicules
	static private Vehicule[] tabVehicule=new Vehicule[10];
	
	//variables d'instances
	protected int puissance;
	protected int id;
	protected String nom;
	protected GenreVehicule genre;
	
	
	/**
	 * constructeur défaut
	 */
	Vehicule(){
		this.id=noId;
		this.nom="noName";
		this.genre=GenreVehicule.inconnu;
		this.puissance=0;
		tabVehicule[id]=this;
		noId++;
	}
	
	
	Vehicule(String n, GenreVehicule g){
		this.id=noId;
		this.nom=n;
		this.genre=g;
		tabVehicule[id]=this;
		noId++;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCarteGrise(){
		Terminal.ecrireStringln("---------------------------------------");		
		Terminal.ecrireStringln("Nom du vehicule: "+this.nom);
		Terminal.ecrireStringln("n° Id= "+this.id);
		Terminal.ecrireStringln("Genre: "+this.genre);
		Terminal.ecrireStringln(" se déplace au moyen de "+this.genre.getMoyen());
		Terminal.ecrireStringln("Puissance du vehicule "+this.puissance+" W (soit "
				+convertiWattVersCh(this.puissance)+" ch).");
		Terminal.ecrireStringln("---------------------------------------");		

		return noId;
	}
	/**
	 * 
	 * @param Nom du Vehicule
	 */
	public void setNom(String n){
		this.nom=n;
	}
	
	/**
	 * 
	 * @param Puissance en Watt
	 */
	public void setPuissance(int w){
		this.puissance=w;
	}	
	
	
	/**
	 * 
	 * @param Puissance en Watt à convertir en Ch
	 * @return Puissance en Ch
	 */
	public static double convertiWattVersCh(int w){
		return arrondir((double)w/736 , 2);
	}
	
	
	/**
	 * 
	 * @param a  nombre à arrondir
	 * @param nbSignificatif
	 * @return un double avec autant de nbSignificatif après la virgule
	 */
	public static double arrondir(double a, int nbSignificatif){
		BigDecimal bd = new BigDecimal(a);
		bd= bd.setScale(nbSignificatif,BigDecimal.ROUND_DOWN);
		a = bd.doubleValue();
		return a;
	}

	
	/**
	 * 
	 * @param id n° d'id du vehicule
	 * @param w nouvelle puissance
	 */
	public static void changePuissance (int id, int w){
		//TODO
		tabVehicule[id].puissance=w;
			
		
	}
	

}
