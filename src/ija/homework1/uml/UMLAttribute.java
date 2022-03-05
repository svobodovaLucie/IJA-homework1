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
public class UMLAttribute extends Element {
	private UMLClassifier type;

	public UMLClassifier getType() {
		return this.type;
	}

	public String toString() {
		return "nazev:typ in UMLAttribute";
	}

	public UMLAttribute(String name, UMLClassifier type) {
		this.name = name;
		this.type = type;
		// vytvori instanci objektu?
	}
}

