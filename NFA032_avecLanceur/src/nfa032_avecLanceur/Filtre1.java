package nfa032_avecLanceur;

public class Filtre1 extends Filtre {
  
  protected Composant composantA;
  protected Composant composantB;
  protected String[] lesChoixProposes = {"choix Des Composants","calcul Tableau Attenuation", "sortir"};
  
  Filtre1() {
    super(1);
    this.ceQueJePropose=new Menu("Menu Filtre ordre 1 ", this.lesChoixProposes);
    Terminal.ecrireStringln("dans le lanceur de filtre 1");
    
  }
  
  
  
//methodes d'instances
  
  /**
   *  oriente vers la methode spécifique au voeux
   * @param voeux
   */
  public void faitDonc(int voeux){
    
    
    
    if (voeux==1) {// choix Des Composants
      this.choixDesComposants();
      
    }
    
    if (voeux== 2){
      this.calculTableauAttenuation();
    }
    
    
  }
  
  
  public void choixDesComposants(){
    
    Terminal.ecrireStringln("à implémenter pour les deux composants 1 dans Filtre1");

  }
  
  public void calculTableauAttenuation(){
    Terminal.ecrireStringln("à implémenter dans Filtre1");
  }
}
