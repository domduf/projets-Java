package com.domduf.examAnnaleSession2016Exo2;

class Grand {
	Petit[] tab;
	Grand(int x){
		tab=new Petit[1];
		tab[0]=new Petit(x);
	}
	
}

class Petit {
	int x;
	Petit (int xx){
		x=xx;
		Terminal.ecrireStringln("nouvel objet, voici la valeur de sa variable d'instance x: "+this.x);
	}
}

public class ExamAnnaleSession2016Exo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grand[] chose;
		chose= new Grand[1];
		chose[0]=new Grand(1);
		
		

	}

}
