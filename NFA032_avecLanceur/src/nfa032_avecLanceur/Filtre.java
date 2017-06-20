package nfa032_avecLanceur;

public class Filtre  {
  
  protected Composant composantUnique;
  protected String[] choixComposant={"Resistance", "Condensateur", "Self"};
  protected Menu menuComposant = new Menu("Choisissez Votre composant", choixComposant);
  
  protected int ordre;
  protected FonctionFiltre fonction;
  protected float attenuation[];
  protected float phase[];
  protected float freqBasse;
  protected float freqHaute;
  protected float pasDeMesure;
  protected Menu ceQueJePropose;
  protected String[] lesChoixProposes = {"choix du Composant","calcul Tableau Attenuation",
      "calcul du Tableau Phase",
      "affiche le Tableau des Attenuations ","affiche le Tableau de rotation de Phase", "sortir"};
  
  
  
  // constructeur
  Filtre(){
    this.fonction=FonctionFiltre.passeTOUT;
    this.ordre=0;
    Terminal.ecrireStringln("dans le lanceur de filtre 0");
    this.ceQueJePropose=new Menu("Menu Filtre ordre 0 ", this.lesChoixProposes);
  }
  
  Filtre(int o){
    this.ordre=o;
  }
 

  
  
  //getters
    public int getOrdre(){
    return this.ordre;
  }
    


  
  // methodes d'instances
    
    /**
     *  oriente vers la methode spécifique au voeux
     * @param voeux
     */
    public void faitDonc(int voeux){
      
      
      if (voeux==1) {// choix Des Composants
        this.choixDesComposants();
        
      }
      
      if (voeux==2){// calcul Tableau Attenuation
        this.calculTableauAttenuation();
        
      }
      
      if(voeux==3){//calcul du Tableau Phase
        this.calculTableauPhase();
        
      }
      
      if(voeux==4){// affiche attenuations
        this.afficheTableauAttenuation();
        
      }
      
      if(voeux==5){// affiche phase
        this.afficheTableauPhase();
      }
      
    }
  
    
  /** 
   * affiche la fonction du filtre
   */
  public void afficheFonction(){
    
    if (this.ordre==0) {
      Terminal.ecrireStringln("ce filtre d'ordre "+this.getOrdre()+
          " a pour fonction"+this.fonction.getFonction());
      
    }

  }
  
  /**
   * choixDesComposants
   */
 public void choixDesComposants(){
   
     
    Terminal.ecrireStringln("Quel type de composant voulez-vous ?");
    
    //Composant.afficheTypesDeComposant();
    
    int choixComposant = menuComposant.afficheSaisitRetourneChoix();
    
    if (choixComposant==1) {
      
      this.composantUnique=new Resistance();
      
      Terminal.ecrireStringln("Entrez sa valeur:");
      double valeur = Terminal.lireDouble();
      Terminal.sautDeLigne();
      composantUnique.setValeur(valeur);
      } 
    
    
      

      
      
     Terminal.ecrireStringln(composantUnique.nom+ " "+composantUnique.getValeur());
      
    
    

    
  }
  
  

  public void calculTableauAttenuation(){
    Terminal.ecrireStringln("Pour les attenuations, soyons tranquilles... aucune.." +
    		"et hop !");
  }
  
  public void calculTableauPhase(){
    Terminal.ecrireStringln("Pour la phase, ça ne tourne pas... calme plat" +
        "et hop !");
    
  }
  
  public void afficheTableauAttenuation(){
    
    Terminal.ecrireStringln("0dB ---------------");
    
  }
  
  public void afficheTableauPhase(){
    
  }

}
