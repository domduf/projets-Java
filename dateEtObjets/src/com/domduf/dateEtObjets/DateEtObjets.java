package com.domduf.dateEtObjets;

public class DateEtObjets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jour=28;
        int mois=2;
        int annee=2001;
         
         
        Terminal.ecrireBooleanln(Date.bissextile(annee));
        Terminal.ecrireStringln("Le mois "+Date.moisChiffreLettre(mois)+" de l annee "+annee+" contient "+
        Date.longueur(mois, annee)+" jours");
         
        //creation d un objet par defaut
        Date j = new Date();
        j.afficherDate();
        
        //creation d un objet avec parametres
        Date test= new Date(8,3,1968,"on lance des pavés");
        test.afficherDate();
        //test si l annee de cette objet est bissextile
        Terminal.ecrireStringln("bissextile ? "+Date.bissextile(test.annee));
        
        //creation d un objet 2 avec parametres
        Date test2= new Date(1,5);
        test2.afficherDate();
        
        
        j.annee=annee;
        j.mois=mois;
        j.jour=jour;
         
        j.afficherDate();
        j.passerAuLendemain();
        j.afficherDate();
        
        test2.passerAuLendemain();
        test2.afficherDate();
        
        Personne dom = new Personne(); 
        //dom.naissance = new Date();
        dom.naissance.afficherDate();
       
        dom.naissance.setDate();
        dom.naissance.afficherDate();
        
        
	}

}
