package com.domduf.exo6_1_3Objet;

public class Exo6_1_3Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe   agl, bar;
		EmployeR soph, dom;
		Employe[] sophResponsable;
		Employe[] domResponsable;
		Employe[] tabSalarie;

		bar= new Employe("Barbara DUFOUR THOUVENIN",1.2);
		agl= new Employe("Aglaé DUFOUR THOUVENIN",1.3);
		
		domResponsable=new Employe[]{bar, agl};
		
		
		dom = new EmployeR("Dominique DUFOUR",1.8,domResponsable);
		

		
		sophResponsable=new Employe[]{agl,dom};
		soph= new EmployeR("Sophie THOUVENIN",5,sophResponsable);
		
		

		
		dom.afficheSalaire();
		
		
		
		
		tabSalarie=new Employe[]{dom,soph,agl,bar};
		
		soph.afficheSalaire();
		soph.afficheIndice();
		soph.afficherMatricule();

		soph.afficheSbires();
		
		dom.afficheSalaire();
		dom.afficheSbires();
		
		bar.afficheSalaire();
		
		
		

	}

}
