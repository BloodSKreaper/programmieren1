package blatt05;

/** Beispiel f�r Referenzen: Klasse f�r Mitarbeiter-Raumzuordnung */
public class Raumzuordnung {
	private Raum raum; // Referenz auf Raum
	private Person nutzer; // Referenz auf Nutzer/in
	private String zuordnungsGrund; // Grund f�r die Zuordnung

	/** Konstruktor */
	public Raumzuordnung(Raum raum, Person nutzer, String zuordnungsGrund) {
		this(raum, nutzer);
		if (zuordnungsGrund != null && zuordnungsGrund.trim().length() >= 3) {
			this.zuordnungsGrund = zuordnungsGrund;
		} else {
			// ESKALATION, aber wie nur?
			System.err.println("Ung�ltiger Grund f�r die Zuordnung");
		}

	}

	/** Konstruktor */
	public Raumzuordnung(Raum raum, Person nutzer) {
		if (raum != null && nutzer != null) {
			this.raum = raum;
			this.nutzer = nutzer;
		} else {
			// MAXIMALE ESKALATION
			throw new IllegalArgumentException("Raum und Nutzer m�ssen d�rfen nicht NULL sein");
		}
	}

	public void print() {
		this.getNutzer().print();
		System.out.print(" nutzt den Raum: ");
		this.getRaum().print();
		if (zuordnungsGrund != null) {
			System.out.print(" als "+zuordnungsGrund);
		}
	}

	Raum getRaum() {
		return this.raum;
	}

	Person getNutzer() {
		return this.nutzer;
	}

	String getZuordnungsGrund() {
		return zuordnungsGrund;
	}

	public static void main(String[] a) {
		// Br�ckl nutzt den Raum E 212a
		Person ub = new Person("Ulrich", "Br�ckl");
		Raum e212a = new Raum("e 212a", 2);
		Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub, "B�ro");
		ub2e212a.print();

		// Br�ckl nutzt au�erdem den Raum E 201
		Raumzuordnung ub2e201 = new Raumzuordnung(new Raum("e 201", 77, true), // keine Zwischenvariable f�r e201
																				// n�tig...
				ub);
		// Den Raum dieser Zuordnung ausgeben:
		System.out.print("\n     Au�erdem: ");
		ub2e201.getRaum().print();
		System.out.println("\n");

		// Vogelsang nutzt den Raum E 209
		Raumzuordnung hv2e209 = new Raumzuordnung(new Raum("e 209", 3), new Person("Holger", "Vogelsang"), "B�ro");
		hv2e209.print();

	}

}