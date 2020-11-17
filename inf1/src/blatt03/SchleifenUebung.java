package blatt03;

public class SchleifenUebung {

	public static void main(String[] args) {
		final double startwert = -4.;
		final double endwert = 4.;
		final double schrittweite = 0.5;
		System.out.println("Alle Quadratzahlen von " + startwert + " ... " + endwert + " in 0.5er-Schritten");
		for (double laufzahl = startwert; laufzahl <= endwert; laufzahl = laufzahl + schrittweite) {
			System.out.println("x, x^2: " + laufzahl + ", " + laufzahl * laufzahl);
		}

		System.out
				.println("Alle Sinus- und Cosinnus-Werte von " + startwert + " ... " + endwert + " in 0.5er-Schritten");
		for (double laufzahl = startwert; laufzahl <= endwert; laufzahl = laufzahl + schrittweite) {
			System.out
					.println("x, sin(x), cos(x): " + laufzahl + ", " + Math.sin(laufzahl) + ", " + Math.cos(laufzahl));
		}
	}

}
