package testRechercheEnObjet;

public class TestRechercheEnObjet {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    TabRecherche monTab = new TabRecherche();
    int recherche = 237;
    int resultat= monTab.cherche();
    
    Terminal.ecrireIntln(resultat);
    

  }

}
