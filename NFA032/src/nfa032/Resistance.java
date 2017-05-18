package nfa032;

public class Resistance extends Composant {

  static int indice=0;
  protected int numero;
  protected int r; // valeur de R
  protected double q; // qualité +/- %
  
  public Resistance(int R) {
 
    super();
    super.type= TypeComposant.passif;
    
    
    this.r =R;
    this.q=10;
    this.numero=indice;
    super.nom="Resistance";
    indice+=1;
    
  }
  
  
  public String getValeur(){
    return super.getValeur() +
     "résistance de "+Integer.toString(this.r)+" Ohms" ;
    
  }
  

}
