package nfa032_avecLanceur;

public class LanceurFiltre {
  

  /**
   * variables d'instances
   */
  private String[] choixMenuLanceur = {"Ordre 1","Ordre 2", "RETOUR au menu Géneral"};
  // le menu Lanceur peut évoluer
  private Menu menuLanceur = new Menu("MENU \n nouveau Filtre",choixMenuLanceur );
  private Filtre filtre;
  private int ordreFiltre;
  
  /**
   * constructeur par défaut du lanceur
   */
  public LanceurFiltre() {
    Terminal.ecrireStringln("Dans le lanceur de nouveau filtre");
    lancerLaBoucle();
  }
  
  private void lancerLaBoucle(){
    
    int choix = menuLanceur.afficheSaisitRetourneChoix();
    
    if (choix!=3) {
      
      this.ordreFiltre=choix; //initialise l'ordre du filtre à construire
      filtre = new Filtre(ordreFiltre);
      
      Terminal.ecrireStringln("instanciation d'un objet Filtre ordre "+choix);
      
      
      
    }
    
    if (choix==3) {
      
      Terminal.ecrireStringln("retour au Menu général et donc destruction du lanceur et des objets créés avec..");
      
    }
    
    
    
    
  }
  
  
 
  
  

}
