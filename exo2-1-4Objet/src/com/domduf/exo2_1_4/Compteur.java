package com.domduf.exo2_1_4;

public class Compteur {
	int x;
	
	Compteur (int n){
		x=n;
	}
	
	Compteur incremente(){
		x++;
		return this;
	}
	
	int getValeur(){
		return x;
	}

}
