package nfa032;

public class Composant {
  
  protected TypeComposant type;
  protected int nbPole;
  protected String nom;
  
  
  // constructeur par défaut
  Composant(){
    nbPole=2; 
  }
  
  public String getType(){
    return this.type.donneType();
  }
  
  
  public String getValeur(){
    return "Ce composant est une ";
  }


}
