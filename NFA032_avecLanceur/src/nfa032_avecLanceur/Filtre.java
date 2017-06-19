package nfa032_avecLanceur;

public class Filtre  {
  
  protected int ordre;
  protected FonctionFiltre fonction;
  protected float attenuation[];
  protected float phase[];
  protected int freqBasse;
  protected int freqHaute;
  protected int pasDeMesure;

  
  
  
  // constructeur
  Filtre(){
    this.fonction=FonctionFiltre.passeTOUT;
    this.ordre=0;
  }
  
  Filtre(int o){
    this.ordre=o;
  }
 

  
  
  //getters
    public int getOrdre(){
    return this.ordre;
  }
    
    public String[] getQueVoulezVousFaire(){
      String[] ceQueJePropose={"choixDesComposant","calculTableauAttenuation","calculTableauPhase",
          "afficheTableauAttenuation","afficheTableauPhase"};
      return ceQueJePropose;
    }
  

  
  
  // methodes d'instances
  
  public void afficheFonction(){
    
    if (this.ordre==0) {
      Terminal.ecrireStringln("ce filtre d'ordre "+this.getOrdre()+
          " a pour fonction"+this.fonction.getFonction());
      
    }

  }
  

  
  // 
  public void choixDesComposants(){
    
    
  }
  
  public void calculTableauAttenuation(){
    
  }
  
  public void calculTableauPhase(){
    
  }
  
  public void afficheTableauAttenuation(){
    
  }
  
  public void afficheTableauPhase(){
    
  }

}
