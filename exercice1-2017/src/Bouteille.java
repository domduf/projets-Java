
public class Bouteille {
  
  //variables d'instance
  private boolean bouchee;
  
  //constructeur par defaut
  Bouteille(){
    bouchee=true;
  }
  
  // on débouche
  public void ouvre(){
    this.bouchee=false;
  }
  
  //on remet le bouchon
  public void ferme(){
    this.bouchee=true;
  }
  
  // methode de test de l'état
  public String etat(){
    
    // déclaration d'un String 
    String jeSuis;
    
      // test de l'ouverture ou non de l'objet
      if (this.bouchee) {jeSuis="bouchée...";}
      else jeSuis="ouverte, tchin !!! ";
      
      // on retourne l'état sous forme de String
      return jeSuis;
  }
  

}
