package nfa032;

public enum TypeComposant {
  
  actif ("composant actif"),
  passif("composant passif");
  
  
  private String nom;
  
  private TypeComposant(String n) {
    // TODO Auto-generated constructor stub
    this.nom = n;
  }
  
  public String donneType() {
    return this.nom;
    
  }
  

}
