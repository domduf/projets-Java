package nfa032;

public class NFA032 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //----------------définition des menus------------------------
    
    
    String[] tabMenuFiltre= new String[2];
    tabMenuFiltre[0]="1er ordre";
    tabMenuFiltre[1]="2eme ordre";
    Menu menuFiltre = new Menu("choixfiltre", tabMenuFiltre);
    
    
    //----------------menu de choix de filtres-------------------
    
    Terminal.ecrireStringln("ce menu contient "+menuFiltre.getNombreChoix()+" choix");
    int odreDufiltre= menuFiltre.afficheSaisitRetourneChoix();
    
    
    // création d'un objet filtre dont l'ordre est fonction du choix précédent
    
    Filtre monFiltre=new Filtre(odreDufiltre);
    
    
    
    
    monFiltre.afficheFonction();
    
    // récuperation des tableaux[ de tableaux [de composants]]
    // par exemple si filtre 1er ordre passe-haut
    // resistance[]= { resistance1}
    // condensateur[] = { condo1 }
    // self[] = {}  
    
    
    //----------définition des composants en fonction du type de filtre---
    
    Composant R1= new Resistance(500); 
    
    Terminal.ecrireStringln("voici le type: "+R1.getType());
    Terminal.ecrireStringln(R1.getValeur());
    
    
    
    
    
    // affichage des caracteristique du filtre
    
    
    
    
    
    
    

  }

}
