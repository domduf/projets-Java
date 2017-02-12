package com.domduf.interfaces_tests;

public class Rectangle implements AvecSurface,AvecTranslation{
	Point basGauche;
	Double dimHor, dimVer;
	
	Rectangle (Point bg, double dh, double dv){
		basGauche=bg;
		dimHor=dh;
		dimVer=dv;
	}
	
	public double surface(){
		return dimHor*dimVer;
	}
	
	 public void afficheSurface(){
		 Terminal.ecrireStringln("ce rectangle a une surface de "+this.surface());
	 }
	public void translation(double deplHor, double deplVer){
		basGauche.translation(deplHor, deplVer);
	}

}
