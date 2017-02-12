package com.domduf.interfaces_tests;

public class Interfaces_tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a = new Point(0, 0);
		Point b= new Point(2,8);
		Point c= new Point( -5, 1);
		
		Cercle cercleA = new Cercle (a, 5);
		cercleA.afficheSurface();
		cercleA.rayon=2;
		
		a.translation(2, 0);
		cercleA.afficheSurface();
		
		a.afficheCoordonnées();
		a.translation(-2, 1);
		a.afficheCoordonnées();
		

	}

}
