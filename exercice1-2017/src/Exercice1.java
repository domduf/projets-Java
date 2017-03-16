
public class Exercice1 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Bouteille maBouteille = new Bouteille();
    System.out.println(" ma bouteille est " + maBouteille.etat());
    maBouteille.ouvre();
    System.out.println(" ma bouteille est " + maBouteille.etat());
    maBouteille.ferme();
    System.out.println(" ma bouteille est " + maBouteille.etat());

  }

}
