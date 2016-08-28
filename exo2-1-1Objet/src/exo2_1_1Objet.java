
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
		
		for (int i=0;i<10;i++){
			String chaine =String.valueOf(i);
			chaine="compte "+chaine;
			Terminal.ecrireStringln(chaine);
		
		}
		
		

	}

}
