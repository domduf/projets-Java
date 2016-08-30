package com.domduf.exo2_1_1;

public class exo2_1_1Objet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte compte1 =new Compte("compte test 1");
		Compte compte2 =new Compte("compte test 2");
		
		compte1.deposer(500);
		compte2.deposer(1000);
		compte2.retirer(10);
		compte1.virerVers(75, compte2);
		compte1.afficher();
		compte2.afficher();
		
		//declaration d un tableau de 10 comptes
		Compte  tableauCompte[] = new Compte[10];
		
		
		//initialisation des dix comptes
		for (int i=0;i<10;i++){
			String chaine =String.valueOf(i);
			chaine="no"+chaine;
			Terminal.ecrireStringln("init du compte "+chaine);
			tableauCompte[i]= new Compte(chaine);
			tableauCompte[i].afficher();
		}
		
		Terminal.sautDeLigne();
		
		//depot de 200 € et somme de 100 fois l'indice
		Terminal.ecrireStringln("dépot d'argent sur chaque compte");
		for (int i=0;i<10;i++){
			tableauCompte[i].deposer(200+100*i);
			tableauCompte[i].afficher();
		}
		
		Terminal.sautDeLigne();
		
		//virement de 20€ de chaque compte vers chacun des comptes suivants
		Terminal.ecrireStringln("virement de 20€ de chaque compte vers chacun des comptes suivants");
		int j=0;
		for (int i=0;i<10;i++){
			j=i+1;
			while (j<=9){
				tableauCompte[i].virerVers(20, tableauCompte[j]);
				j+=1;
			}
			
		}
		
		Terminal.sautDeLigne();
		
		//affichage du solde de tous les comptes
		Terminal.ecrireStringln("affichage du solde de tous les comptes");
		Terminal.sautDeLigne();
		for (int i=0;i<10;i++){
			tableauCompte[i].afficher();
		}
		
		/* 
		 * à la question n° 3, je ne pense pas qu'il faille prevoir une 
		 * méthode permettant de changer le nom de compte
		 * car cela est très dangereux dans le secteur bancaire !!!
		*/
		
		tableauCompte[0].retirer(30);
		
		tableauCompte[0].retirer(20);

	}

}
