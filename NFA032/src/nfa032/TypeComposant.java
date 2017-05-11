package nfa032;

public enum TypeComposant {
  
  
  passif("composant passif"),
  capacite("composant capacitif"),
  self("composant selfique");
  
  
  private String nom;
  
  private TypeComposant(String n) {
    // TODO Auto-generated constructor stub
    this.nom = n;
  }
  
  public String donneType() {
    return this.nom;
    
  }
  

}
