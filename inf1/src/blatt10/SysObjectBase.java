package blatt10;

public abstract class SysObjectBase {
	private String name, owner;

	/**
	 * Konstruktor zur Erzeugung eines SysObjectBase-Objects mit Name.
	 * 
	 * @param name Bezeichner des Objektes
	 */
	public SysObjectBase(String name) {
		this.name = name;
		this.owner = System.getenv("USERNAME");
	}

	@Override
	/**
	 * Gibt die Eigenschaften von SysObjectBase als Text zurück.
	 */
	public String toString() {
		return String.format("Class=%s, Name=%s, User=%s", this.getClass().getSimpleName(), this.name, this.owner);
	}

	// Setter
	/**
	 * Setzt den Bezeichner eines SysObjectBase-Objekts.
	 * 
	 * @param name Bezeichner
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setzt den Namen des Besitzers der Datei
	 * 
	 * @param owner Name des Besitzers
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	// Getter
	/**
	 * Gibt den Bezeichner der Datei zurück
	 * 
	 * @return Bezeichner
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gibt den Namen des Besitzers der Datei zurück.
	 * 
	 * @return Name des Besitzers
	 */
	public String getOwner() {
		return owner;
	}

}
