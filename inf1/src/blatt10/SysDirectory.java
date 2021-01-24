package blatt10;

public class SysDirectory extends SysObjectBase {
	private SysObjectBase[] sysObjects;

	/**
	 * Konstruktor der Klasse SysDirectory
	 * 
	 * @param name       Bezeichner des Ordners
	 * @param sysObjects Dateien, die in dem Ordner gespeichert sind
	 */
	public SysDirectory(String name, SysObjectBase... sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
	}

	@Override
	/**
	 * Gibt den Bezeichner, Besitzer und die Anzahl der Objekte im Ordner aus.
	 */
	public String toString() {
		return super.toString() + String.format(", NumberOfObjects=%d", sysObjects.length);
	}

	/**
	 * Struktur des Verzeichnisses ermitteln
	 *
	 * @param indent Einrückung links (wird durch Rekursion verbreitert)
	 * @return Struktur des Verzeichnisses als String
	 */
	public String dirStructure(String indent) {
		String baseindent = "| - ";
		if (indent == "") {
			indent = "| - ";
		} else {
			indent = indent + baseindent;
		}
		String ret = toString() + "\n";
		for (SysObjectBase obj : sysObjects) {
			if (!(obj instanceof SysDirectory)) {
				ret = ret + indent + obj.toString() + "\n";
			} else {
				ret = ret + indent + ((SysDirectory) obj).dirStructure(indent);
			}
		}
		return ret;
	}

}
