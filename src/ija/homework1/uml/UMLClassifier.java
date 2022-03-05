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
public class UMLClassifier extends Element {
	private boolean isUserDefined;

	public static UMLClassifier forName(String name) {
		UMLClassifier inst = new UMLClassifier(name);
		return inst;
	}

	public boolean isUserDefined() {
		return this.isUserDefined;
	}

	public String toString() {
		return "nazev(true/false)";
	}

	public UMLClassifier(String name) {
		this.name = name;
	}

	public UMLClassifier(String name, boolean isUserDefined) {
		this.name = name;
		this.isUserDefined = isUserDefined;
	}

}

