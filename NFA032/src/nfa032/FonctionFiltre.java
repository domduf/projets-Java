package nfa032;

/*
 * enum de la fonction du filtre
 */
public enum FonctionFiltre {
  
  passeHaut("passe-haut",0),// attenue BF
  passeBas("passe-bas",1),// attenue HF
  plateau("plateau",2), //  gain min, gain Max, freq, pente
  passeBande("passe-bande",3), // Gain + sur bande freq
  coupeBande("coupe-bande",4); // Gain - sur bande freq
  
  
  private String nom;
  private int numero;
  
  private  FonctionFiltre(String no, int nu){
    this.nom=no;
    this.numero=nu;
  }
  
  public String getFonction(){
    return this.nom;
  }
  
  public int getNumeroFonction(){
    return this.numero;
  }

}
