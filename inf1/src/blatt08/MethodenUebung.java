package blatt08;

public class MethodenUebung {

	public static void main(String[] args) {
		System.out.println(berechneBetrag(-1));
		System.out.println(berechneBetrag(-2.87));
		System.out.println(berechneBetrag(2.87));
		System.out.println(berechneBetrag(-1));
		System.out.println();
		System.out.println(rundeZahlAuf(1));
		System.out.println(rundeZahlAuf(1.1));
		System.out.println(rundeZahlAuf(1.9));
		System.out.println(rundeZahlAuf(0));
		System.out.println(rundeZahlAuf(0.5));
		System.out.println();
		System.out.println(rundeZahlAb(1));
		System.out.println(rundeZahlAb(1.1));
		System.out.println(rundeZahlAb(1.9));
		System.out.println(rundeZahlAb(0));
		System.out.println(rundeZahlAb(0.5));
		System.out.println();
		System.out.println(istRestlosTeilbarDurch(1, 0.5));
		System.out.println(istRestlosTeilbarDurch(1.1, 1));
		System.out.println(istRestlosTeilbarDurch(1.6, 0.8));
		System.out.println(istRestlosTeilbarDurch(0, 0));
		System.out.println(istRestlosTeilbarDurch(-0.5, 0.25));
		System.out.println();
		System.out.println(berechneEuklidischeDistanz(new Punkt(1, 0.5), new Punkt(2, 9)));
		System.out.println(berechneEuklidischeDistanz(new Punkt(2, 9), new Punkt(1, 0.5)));
		System.out.println(berechneEuklidischeDistanz(new Punkt(-1, -0.5), new Punkt(-2, -9)));
		System.out.println(berechneEuklidischeDistanz(new Punkt(-2, -9), new Punkt(-1, -0.5)));
		System.out.println();
		System.out.println(bestimmeKleinsteZahl(1, 0.5, 5));
		System.out.println(bestimmeKleinsteZahl(1.1, 1, 0));
		System.out.println(bestimmeKleinsteZahl(1.6, 6.2, 0.8));
		System.out.println(bestimmeKleinsteZahl(0, 0, -5));
		System.out.println(bestimmeKleinsteZahl(-0.5, 0.25, 15));
	}

	public static double berechneBetrag(double zahl) {
		return zahl > 0 ? zahl : zahl * -1;
	}

	public static int rundeZahlAuf(double zahl) {
		int ret;
		if (zahl % 1 == 0) {
			ret = (int) zahl;
		} else {
			ret = (int) (zahl + 1);
		}
		return ret;
	}

	public static int rundeZahlAb(double zahl) {
		return (int) zahl;
	}

	public static boolean istRestlosTeilbarDurch(double dividend, double divisor) {
		return dividend % divisor == 0 ? true : false;
	}

	public static double berechneEuklidischeDistanz(Punkt P1, Punkt P2) {
		double deltaX = P2.x - P1.x;
		double deltaY = P2.y - P1.y;
		double distanz = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return distanz;
	}

	public static double bestimmeKleinsteZahl(double a, double b, double c) {
		double ret;
		if (a <= b) {
			if (a <= c) {
				ret = a;
			} else {
				ret = c;
			}
		} else {
			if (b <= c) {
				ret = b;
			} else {
				ret = c;
			}
		}
		return ret;
	}

	// Aufgabe 8.4
	enum KartenFarbe {
		KARO, HERZ, PIK, KREUZ
	}

	static int farbenWert(KartenFarbe farbe) {
		int ret;
		switch (farbe) {
		case KARO:
			ret = 9;
			break;
		case HERZ:
			ret = 10;
			break;
		case PIK:
			ret = 11;
			break;
		default:
			ret = 12;
			break;
		}
		return ret;
	}
}

class Punkt {
	double x, y;

	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
