package com.domduf.interfaces_tests;

public class Cercle implements AvecTranslation, AvecSurface{
	
	Point centre;
	double rayon;
	
	 Cercle(Point ctr, double r){
		 centre=ctr;
		 rayon=r;
	 }
	 
	 public double surface(){
		 return Math.PI*rayon*rayon;
	 }
	 
	 public void afficheSurface(){
		 Terminal.ecrireStringln("ce cercle a une surface de "+this.surface());
	 }

	 public void translation (double deplHor, double deplVer){
		 centre.translation(deplHor, deplVer);//on fait la translation sur le point "centre"
	 }
}
