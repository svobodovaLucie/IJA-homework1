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
public class UMLOperation extends UMLAttribute {
	private List <UMLAttribute> attributes;

	public static UMLOperation create(java.lang.String name, UMLClassifier type, UMLAttribute... args) {
		
	}

	public boolean addArgument(UMLAttribute arg) {
		return false;
	}

	public List <UMLAttribute> getArguments() {
		return this.attributes;
	} 
}

