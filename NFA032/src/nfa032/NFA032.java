package nfa032;

public class NFA032 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    // voir site http://www.gecif.net/articles/genie_electrique/filtre/#2
    //pour les calculs de filtre 1er et 2nd ordre
    
    //----------------définition des menus------------------------
    
    String choixGeneral[]= { "Sortir du programme", "Nouveau filtre",
                            "Choix des composants","Calculer autre chose avec ce filtre"};
    Menu menuGeneral = new Menu("Maintenant vous voulez ?", choixGeneral);
 
    //déclaration et init variables
    
    Filtre monFiltre = new Filtre(); // filtre d'ordre 0 par défaut ... "passe-tout"
    boolean fin=false; // pour pouvoir entrer dans la boucle de choix générale
    
    
    // boucle de calcul tant que l'utilisateur ne veut pas quitter

    while (! fin){
     
      monFiltre.afficheFonction();
      
      // affiche le menu général et entre le choix
      int choixMenu=menuGeneral.afficheSaisitRetourneChoix();

      if (choixMenu==1) {
        fin = true;
      }
      
      if (choixMenu==2) {
        
       
        // saisir l'ordre du filtre-------------------
        monFiltre.setOrdre();
       
        Terminal.ecrireStringln("Vous avez choisit un filtre d'ordre "+monFiltre.getOrdre());
      }
      

      
      
      if (choixMenu==3) {
        
        
        // choix des composants du filtre
        
        monFiltre.choixDesComposants();
        
      }
     
       

      if (choixMenu==4) {
        
      //---------------que veut faire l'utilisateur ----------------
        //-----construction du menu de choix et entrée de la valeur---
        
        String choix[]= {"Affiche l' attenuation", "Affiche la phase"};
        Menu choixAffichage = new Menu("Que voulez vous faire ?", choix);
        
        // on stocke le choix dans un entier
        int queFaire=choixAffichage.afficheSaisitRetourneChoix();
        
         
        // affichage suivant le choix fait plus haut
        
        if (queFaire==1) {

          monFiltre.calculTableauAttenuation();

        }
        else if (queFaire==2) {
          monFiltre.calculTableauPhase();
        }
        
          // on complètera éventuellement suivant l'implémentation future
        
        // Affichage des résultats 
        
        if (queFaire==1) {

          monFiltre.afficheTableauAttenuation();

        }
        else if (queFaire==2) {
          monFiltre.afficheTableauPhase();
        }
        
      }
      
      
      


      
    }
    
    Terminal.ecrireStringln("Merci et à bientôt...bon filtre");
    

   
   
  

  }

}
