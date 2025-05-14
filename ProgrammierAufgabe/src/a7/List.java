package a7;

/**
 * einfaches Listeninterface für 0-indexierte Listen
 *
 * @param <T> Datentyp der zu speicherden Elemente
 */
public interface List<T> {
	/**
	 * Fügt das Objekt obj an das Ende der Liste an.
	 * @param obj
	 */
	public void add(T obj);
	
	/**
	 * Fügt das Objekt obj vor dem an Stelle index stehenden Element in die Liste ein.
	 * 
	 * Ist index gleich 0, wird das Objekt vor dem ersten Objekt, d.h. an den Anfang der Liste, eingefügt.
	 * 
	 * Ist der Index gleich der Länge der Liste, wird das Objekt an das Ende der Liste angefügt.
	 * 
	 * @param obj einzufügendes Element
	 * @param index Index, an dessen Stelle das Element eingefügt werden soll
	 */
	public void insert(T obj, int index);
	
	/**
	 * Liefert das an der Position index stehende Listenelement zurück.
	 * 
	 * @param index Index des Elementes, das zurückgeliefert werden soll
	 * @return
	 */
	public T get(int index);
	
	/**
	 * Entfernt das in der Position index stehende Listenelement aus der Liste
	 * 
	 * @param index Index des zu löschenden Elementes
	 */
	public void delete(int index);
	
	
	/**
	 * Liefert den Index des ersten Elements (von vorn) der Liste zurück, das gleich obj ist. Hierfür wird die
	 * Gleichheit mittels equals getestet.
	 * 
	 * @param obj Vergleichsobjekt
	 * @return
	 */
	public int indexOf(T obj);
	
	/**
	 * Gibt die Länge der Liste zurück, also die Anzahl der Elemente in der Liste. (*Nicht* den höchsten Index der Liste)
	 * @return Länge der Liste
	 */
	public int length();
}

