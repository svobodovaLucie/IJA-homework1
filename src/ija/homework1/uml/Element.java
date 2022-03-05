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
public class Element {
	private String name;

	public String getName() {
		return this.name;
	}

	public void rename (String newName) {
		this.name = newName;
	}
	
	public Element (String name) {
		this.name = name;
	}
}

