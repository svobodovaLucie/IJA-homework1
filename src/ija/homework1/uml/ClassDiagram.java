/* Seminar IJA - demonstracni priklady.
 * Ukazka prace s pameti - objekty v metodach.
 * Spustit s volbou -Xmx3m
 * (C) 2021 Radek Koci
 */
package ija.homework1.uml;

/**
 *
 * @author Lucie Svobodova
 */
public class ClassDiagram extends Element {
	
	public UMLClass createClass(String name) {
		System.out.println("createClass()");
		// pokud v diagramu existuje trida stejneho nazvu, nic nedela
		if (true) {
			return null;
		}	
		UMLClass inst = new UMLClass(name);
		return inst;
	}

	public UMLClassifier classifierForName(String name) {
		// vyhleda klasifikator podle nazvu
		System.out.println("classifierForName()");
		return null;
	}

	public UMLClassifier findClassifier(String name) {
		System.out.println("findClassifier()");
		return null;	
	}

	public ClassDiagram(String name) {
		this.name = name;
	}

}

