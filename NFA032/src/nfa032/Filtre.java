package nfa032;

public class Filtre {
  
  protected int ordre;
  protected FonctionFiltre f;
  
  
  
  // constructeur
  

  Filtre(int o){
    this.ordre=ordre;
  }
  
  
  //getters
  
  public int getOrdre(){
    return this.ordre;
  }
  
  
  // methodes d'instances
  
  public void afficheFonction(){
    Terminal.ecrireStringln("ce filtre d'ordre "+this.getOrdre()+" a pour fonction"+this.f.getFonction());
  }

}
