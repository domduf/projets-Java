
public class Exo_4_1_2ObjetExceptions {
	
	
	static void meth1 (int p) throws Exc1, Exc2 {
		Terminal.ecrireStringln("début methode 1");
		if(p==0){
			throw new Exc1();	
			}
		Terminal.ecrireStringln("milieu de methode 1");
		if(p==1){
			throw new Exc2();	
			}
	}
	
	
	static void meth2 (int p) throws Exc1, Exc2, Exc3 {
		Terminal.ecrireStringln("début methode 2");
		if(p==2){
			throw new Exc3();	
			}
		Terminal.ecrireStringln("milieu de methode 2");
	
		meth1(p);
		Terminal.ecrireStringln("fin de methode 2");
	}
	
	static void meth3 (int p) throws Exc1, Exc3 {
		Terminal.ecrireStringln("début methode 3");
		try{
			meth2(p);
		}catch(Exc2 ex){
			Terminal.ecrireStringln("milieu de methode 3");
		}
		Terminal.ecrireStringln("fin de methode 3");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exc1, Exc3 {
		// TODO Auto-generated method stub

		Terminal.ecrireString("entrez un nb");
		meth3(Terminal.lireInt());

	}

}
class Exc1 extends Exception{}
class Exc2 extends Exception{}
class Exc3 extends Exception{}
