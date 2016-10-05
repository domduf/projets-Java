package com.domduf.exo6_1_3Objet;

public class EmployeR extends Employe {

	public Employe[] tabSalarie;
	
	
	public EmployeR(String n, double i, Employe[] t){
		super (n,i);

		tabSalarie=t;

	}
	
	public void afficheSbires(){
		Terminal.ecrireStringln(this.nom+" est responsable de cette équipe: ");
		for (int i=0;i<tabSalarie.length;i++){
			Terminal.ecrireStringln("---"+this.tabSalarie[i].nom);
		}
	}
	
	
	
}
