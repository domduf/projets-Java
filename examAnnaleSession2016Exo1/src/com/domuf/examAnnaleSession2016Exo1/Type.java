package com.domuf.examAnnaleSession2016Exo1;

enum Type {
	//objets
	apero("apéritif"),
	entree("entrée"),
	principal("plat principal"),
	dessert("dessert"),
	liqueur("liqueur");
	
	//variables d'instances
	private String name = "";
	
	//constructeur
	Type(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	static public String[] getTabName (){
		int nb=0;//compte les instances de Type
		for (Type typePlats : Type.values()){
			nb+=1;
		}
		
		String[] tabType= new String[nb];//construit un tableau
		int i=0;
		for (Type typePlats : Type.values()){//remplit le tableau
			
			tabType[i]=typePlats.name;
			i+=1;
		}
		return tabType;
	}
}
