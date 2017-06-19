package nfa032_avecLanceur;

public class LanceurFiltre {
  

  /**
   * variables d'instances
   */
  private String[] choixMenuLanceur = {"Ordre 1","Ordre 2","Ordre 0", "RETOUR au menu Géneral"};
  // le menu Lanceur peut évoluer
  private Menu menuLanceur = new Menu("MENU \n nouveau Filtre",choixMenuLanceur );
  private String[] choixMenuCeQuePeuxFaireFiltre;
  private Menu menuCeQuePeuxFaireFiltre;
  private Filtre filtre;
  private int ordreFiltre;
  
  /**
   * constructeur par défaut du lanceur
   */
  public LanceurFiltre() {
    Terminal.ecrireStringln("Dans le lanceur de nouveau filtre");
    lancerLaBoucle();
  }
  
  
  /**
   * boucle de choix de filtre
   */
  private void lancerLaBoucle(){
    
    int tailleMenu = choixMenuLanceur.length; // utile pour l'option sortie (dernière position)
    
    int choix = menuLanceur.afficheSaisitRetourneChoix();
    
    if (choix!=tailleMenu) { // si on ne demande pas de sortir
      
      if (choix==tailleMenu-1) {
        choix=0; // filtre d'ordre 0
        filtre = new Filtre();
      }
      
      if (choix==1) {
       
        filtre = new Filtre1();
      }
      
      this.ordreFiltre=choix; //initialise l'ordre du filtre à construire
      filtre = new Filtre(ordreFiltre);
      
      Terminal.ecrireStringln("vous avez choisi un filtre d\'ordre "+filtre.getOrdre());
      
      Terminal.ecrireStringln("instanciation d'un objet Filtre d\'ordre "+choix);
      
       // appel des fonctions disponibles pour ce filtre et construction du menu correspondant
      choixMenuCeQuePeuxFaireFiltre=filtre.getQueVoulezVousFaire();
     
      menuCeQuePeuxFaireFiltre = new Menu("Ce que propose ce filtre:", choixMenuCeQuePeuxFaireFiltre);
      
      menuCeQuePeuxFaireFiltre.afficheSaisitRetourneChoix();
      
    }
    
    else {
      
      Terminal.ecrireStringln("retour au Menu général et donc destruction du lanceur et des objets créés avec..");
      
    }
   
    
  }
  
  
  
  /**
   * propose un menu en fonction de ce que proposer le filtre choisi
   */
  private void fonctionsDuFiltre(Filtre f){
    Terminal.ecrireStringln("dans la boucle de choix des fonctions spécifiques au filtre choisit");
    
    
    
  }
  
 

}
