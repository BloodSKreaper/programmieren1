package blatt10;

public class SysTextFile extends SysObjectBase {
	private String type, text;

	/**
	 * Konstruktor einer Textdatei
	 * 
	 * @param name Bezeichner der Datei
	 * @param type Abkürzung für Datentyp der Datei. Beispielsweise "yml"
	 */
	public SysTextFile(String name, String type) {
		super(name);
		this.type = type;
	}

	/**
	 * Gibt Bezeichner, Besitzer, Datentyp sowie Länge des Textes zurück.
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", Type=%s, Length=%d", type, text == null ? 0 : text.length());
	}

	// Setter
	/**
	 * Setzt den Inhalt der Textdatei
	 * 
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	// Getter
	/**
	 * Gibt den Inhalt der Textdatei zurück
	 * 
	 * @return Inhalt
	 */
	public String getText() {
		return text;
	}

}
