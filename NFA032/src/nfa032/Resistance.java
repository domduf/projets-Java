package nfa032;

public class Resistance extends Composant {

  // variable de classe
  static int indice=0;
  
  // variables d'instance
  protected int numero;
  protected double resistance; // valeur de R
 
  
  public Resistance(int R) {
 
    super();
    super.type= TypeComposant.resistif;
    
    
    this.resistance =R;
    this.numero=indice;
    super.nom="Resistance";
    indice+=1;
    
  }
  
  
  public String getValeur(){
    return super.getValeur() +
     "résistance de "+Double.toString(this.resistance)+" Ohms" ;
    
  }
  

}
