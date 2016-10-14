package com.domuf.examAnnaleSession2016Exo1;

public enum TypeRepas {
	// objets
	complet("complet"), 
	platSeul("plat seul"), 
	entreePlat("entrée et plat principal"),
	platDessert("plat principal et dessert");

	// variables d'instances
	private String name = "";

	// constructeur
	TypeRepas(String name) {
		this.name = name;
	}
}
