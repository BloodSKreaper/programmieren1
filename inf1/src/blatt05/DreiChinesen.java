package blatt05;

public class DreiChinesen {
	static final String text = "Drei Chinesen mit dem Kontrabass\n" + "sa�en auf der Stra�e und erz�hlten sich was.\n"
			+ "Da kam ein Mann: Ja was ist denn das?\n" + "Drei Chinesen mit dem Kontrabass.\n\n";

	/**
	 * Einen Text zentriert ausgeben. Es gen�gt eine L�sung f�r nichtproportionale
	 * Schriftarten.
	 * 
	 * @param text Text mit mehreren Zeilen (durch '\n' abgetrennt)
	 */
	static void printCentered(String text) {
		String[] zeilen = text.split("\n");
		int maxlength = 0;
		for (String zeile : zeilen) {
			maxlength = zeile.length() > maxlength ? zeile.length() : maxlength;
		}
		for (String zeile : zeilen) {
			while (zeile.length() < maxlength) {
				zeile = " " + zeile + " ";
			}
			System.out.println(zeile);
		}
	}

	/**
	 * Vokale in Text ersetzen.
	 * 
	 * @param text        Text mit Vokalen
	 * @param replacement Ersatz f�r Vokale
	 * @return Text mit ge�nderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		/*
		 * Regex [aeiou���] Siehe
		 * https://docs.oracle.com/javase/1.5.0/docs/api/java/util/regex/Pattern.html
		 * text = text.replaceAll("[aeiou���AEIOU���]", replacement); return text;
		 */
		// Da es hier keine Gro�buchstaben gibt, m�ssen nur die Kleinbuchstaben ersetzt
		// werden.
		text = text.replace("a", replacement);
		text = text.replace("e", replacement);
		text = text.replace("i", replacement);
		text = text.replace("o", replacement);
		text = text.replace("u", replacement);
		text = text.replace("�", replacement);
		text = text.replace("�", replacement);
		text = text.replace("�", replacement);
		/*
		 * text = text.replace("A", replacement); text = text.replace("E", replacement);
		 * text = text.replace("I", replacement); text = text.replace("O", replacement);
		 * text = text.replace("U", replacement); text = text.replace("�", replacement);
		 * text = text.replace("�", replacement); text = text.replace("�", replacement);
		 */
		return text;

	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "�"));
	}

}
