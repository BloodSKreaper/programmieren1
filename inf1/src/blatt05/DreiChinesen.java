package blatt05;

public class DreiChinesen {
	static final String text = 
			  "Drei Chinesen mit dem Kontrabass\n" 
			+ "sa�en auf der Stra�e und erz�hlten sich was.\n"
			+ "Da kam ein Mann: Ja was ist denn das?\n"
			+ "Drei Chinesen mit dem Kontrabass.\n\n"
			;

	/**
	 * Einen Text zentriert ausgeben. Es gen�gt eine L�sung f�r nichtproportionale
	 * Schriftarten.
	 * 
	 * @param text
	 *            Text mit mehreren Zeilen (durch '\n' abgetrennt)
	 */
	static void printCentered(String text) {
		String[] zeilen = text.split("\n");
		int maxlength = 0;
		for(String zeile : zeilen) {
			maxlength = zeile.length() > maxlength ? zeile.length() : maxlength;
		}
		for (String zeile : zeilen) {
			while(zeile.length()<maxlength) {
				zeile = " "+zeile+" ";
			}
			System.out.println(zeile);
		}
	}

	/**
	 * Vokale in Text ersetzen.
	 * 
	 * @param text
	 *            Text mit Vokalen
	 * @param replacement
	 *            Ersatz f�r Vokale
	 * @return Text mit ge�nderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		//Regex [aeiou���] See https://docs.oracle.com/javase/1.5.0/docs/api/java/util/regex/Pattern.html
		text = text.replaceAll("[aeiou���]", replacement);
		return text;
	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "�"));
	}

}
