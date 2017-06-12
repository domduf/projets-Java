package nfa032;

public enum TypeComposant {
  
  
  resistif("composant passif"),
  capacitif("composant capacitif"),
  selfique("composant selfique");
  
  
  private String nom;
  
  private TypeComposant(String n) {
    // TODO Auto-generated constructor stub
    this.nom = n;
  }
  
  public String donneType() {
    return this.nom;
    
  }
  

}
