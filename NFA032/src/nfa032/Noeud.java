package nfa032;

public class Noeud {
  
  // var instance
  protected int nbConnection;
  protected double potentiel;
  
  
  // constructeur défaut
  public Noeud() {
    // TODO Auto-generated constructor stub
    
    nbConnection=2; // par défaut deux connections sur un noeud
    
  }
  
  // constructeur 
  public Noeud(int connectionNb){
    this.nbConnection= connectionNb;
  }
  
  
  
  

}
