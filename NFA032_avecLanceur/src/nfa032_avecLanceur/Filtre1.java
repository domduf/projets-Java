package nfa032_avecLanceur;

public class Filtre1 extends Filtre {
  
  Filtre1() {
    super(1);
  }
  
  
  
  public String[] getQueVoulezVousFaire(){
    String[] ceQueJePropose={"Une spécialité du filtre d'ordre 1","choixDesComposant","calculTableauAttenuation","calculTableauPhase",
        "afficheTableauAttenuation","afficheTableauPhase"};
    return ceQueJePropose;
  }
  
  
}
