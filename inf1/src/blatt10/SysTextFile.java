package blatt10;

public class SysTextFile extends SysObjectBase {
	private String type, text;

	/**
	 * Konstruktor einer Textdatei
	 * 
	 * @param name Bezeichner der Datei
	 * @param type Abk�rzung f�r Datentyp der Datei. Beispielsweise "yml"
	 */
	public SysTextFile(String name, String type) {
		super(name);
		this.type = type;
	}

	/**
	 * Gibt Bezeichner, Besitzer, Datentyp sowie L�nge des Textes zur�ck.
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
	 * Gibt den Inhalt der Textdatei zur�ck
	 * 
	 * @return Inhalt
	 */
	public String getText() {
		return text;
	}

}
