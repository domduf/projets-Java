package com.domduf.dateEtObjets;

/**
 * 
 * @author domduf
 *
 */
public class Date {

int jour;
int mois;
int annee;
String evenement;

//variables statiques ou de classe
static String[] moisEnLettres={"janvier","fevrier","mars","avril","mai","juin","juillet",
		"août","septembre","octobre","novembre","decembre"};



//constructeur par defaut
public Date(){
	jour=1;
	mois=1;
	annee=2016;
	evenement="rien de spécial";
}

//constructeur avec parametres
/**
 * 
 * @param j
 * @param m
 * @param a
 * @param e
 */
public Date(int j, int m, int a, String e){
	jour=j;
	mois=m;
	annee=a;
	evenement=e;
	
}

/**
 * 
 * @param j
 * @param m
 */
public Date(int j, int m){
	jour=j;
	mois=m;
	annee=2016;
}

/**
 * setter de date
 */
public void setDate(){
	Terminal.ecrireString("entrez le jour:");
	this.jour=Terminal.lireInt();
	Terminal.ecrireString("entrez le mois (en chiffre):");
	this.mois=Terminal.lireInt();
	Terminal.ecrireString("entrez l'année:");
	this.annee=Terminal.lireInt();
	if (longueur(mois,annee)<jour){
		Terminal.ecrireStringln("vous avez fait une erreur, le mois ne " +
				" comporte que "+longueur(mois,annee)+" jours" );
		this.setDate();
	}
	
}

//methodes de 
/**
 * 
 */
public void afficherDate(){
    Terminal.ecrireStringln("Cette date: "+this.jour+" "+
            moisChiffreLettre(this.mois)+" "+this.annee+
            " correspond à: \""+this.evenement+"\".");
}

public void passerAuLendemain(){
    if (this.jour<longueur(this.mois,this.annee)){
        this.jour=this.jour+1;
         
    }
    else if (this.mois==12){
        this.jour=1;
        this.mois=1;
        this.annee=this.annee+1;
         
    }
    else{
        this.jour=1;
        this.mois+=1;
    }
} 


public static boolean bissextile (int a){
    return ((a%4==0)&&(!(a%100==0)||a%400==0));
}

public static int longueur (int m, int a){
    if (m==1 || m== 3 || m==5||m==7||m==8||m==10||m==12){
        return 31;}
    else if (m==2){
        if (bissextile(a)){
            return 29;
        }
        else {return 28;}
    }
    else return 30;
}


public static String moisChiffreLettre (int entree){
	
	return moisEnLettres[entree-1];
	
	
}

}
