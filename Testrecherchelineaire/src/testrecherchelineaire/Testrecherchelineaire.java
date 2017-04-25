package testrecherchelineaire;

import java.util.Random;
import java.util.Formatter;
public class Testrecherchelineaire {
  
  public static void init(int[] tab){
    Random r = new Random();
    Formatter monformat = new Formatter();
    for(int i=0;i<tab.length; i++){
      tab[i]= r.nextInt(10000);
      if ((i%10)== 0){
        monformat.format("%n");
        monformat.format("%5d", i);
      }
      monformat.format("%8d", tab[i]);

    }
    System.out.print( monformat);
    System.out.println('\n');
    monformat.close();
  }

  public static int cherche(int[] tab, int valeur){
    int indice = -1;
    int i = 0;
    int tablength = tab.length-1;
    indice = chercherec( tab , tablength, i, valeur);  
    return indice;
  }

  public static int chercherec(int [] tableau, int longueur, int indice, int valeurCherchee){
    if (indice > longueur) return -1;
    if (tableau[indice]== valeurCherchee) return indice;
    return chercherec(tableau, longueur, indice+1, valeurCherchee);
  }


  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int longueur = 5000;
    int [] monTab = new int[longueur];
    init(monTab);
    int recherche = 236;
    int resultat =0;
    resultat = cherche(monTab, recherche);
    System.out.println(" la recherche de "+ recherche + " a pour resultat "+ resultat);

  }

}
