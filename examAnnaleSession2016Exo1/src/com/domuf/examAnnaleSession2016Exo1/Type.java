package com.domuf.examAnnaleSession2016Exo1;

enum Type {
	//objets
	entree("entrée"),
	principal("plat principal"),
	dessert("dessert");
	
	//variables d'instances
	private String name = "";
	
	//constructeur
	Type(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
}
