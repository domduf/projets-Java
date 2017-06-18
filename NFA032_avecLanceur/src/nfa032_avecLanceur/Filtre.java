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
 
  /**
   * 
   * @param ordre
   */
  Filtre(int o){
    this.ordre=o;
    
  }
  
  
  //getters
    public int getOrdre(){
    return this.ordre;
  }
  
  //setters
    public void setOrdre(){
    this.ordre= this.choixDansMenu();
  }
  
  
  // methodes d'instances
  
  public void afficheFonction(){
    
    if (this.ordre==0) {
      Terminal.ecrireStringln("ce filtre d'ordre "+this.getOrdre()+
          " a pour fonction"+this.fonction.getFonction());
      
    }

  }
  
  //choix du Filtre
  public  int choixDansMenu(){
    
    int ordreMenu;
    String[] tabMenuFiltre= new String[2];
    tabMenuFiltre[0]="1er ordre";
    tabMenuFiltre[1]="2eme ordre";
    Menu menuFiltre = new Menu("choix de votre filtre", tabMenuFiltre);
    ordreMenu=menuFiltre.afficheSaisitRetourneChoix();
    return ordreMenu;
    
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
