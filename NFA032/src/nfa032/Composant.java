package nfa032;

public class Composant {
  
  protected TypeComposant type;
  protected int nbPole;
  
  
  // constructeur par défaut
  Composant(){
    type= TypeComposant.passif;
    nbPole=2;
    
  }
  
  Composant( TypeComposant type, int nb){
    this.type = type;
    this.nbPole = nb;
  }

}
