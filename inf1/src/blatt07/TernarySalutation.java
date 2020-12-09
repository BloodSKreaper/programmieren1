package blatt07;

public class TernarySalutation {
	/**
	 * Alle m�glichen Gru�formeln ausgeben 
	 */
	private static void testSalutation() {
		boolean bools[] = {true, false};
		for(boolean firstNameBase : bools) {
			for(boolean signature : bools) {
				System.out.println("\n..........<Mail-Text>..........\n"); // Platzhalter  
				System.out.println(salutation(firstNameBase, signature, "Kim", "May", "Raum E502\nTel.: 01234/567890"));
				System.out.println("\n"); // Abstand zur uebersichtlichen Ausgabe 
			}
		}
	}
	
	/**
	 * Gru�formeln abh�ngig vom Bekanntheitsgrad und wahlweise mit oder ohne Signatur ausgeben
	 * @return Gru�formeln
	 * @param onFirstNameBase Per-Du?
	 * @param signature Signatur anf�gen?
	 * @param given	Vorname
	 * @param name Nachname
	 * @param signatureText Signatur
	 */
	static String salutation(boolean onFirstNameBase, boolean signature, String firstname, String name, String signatureText)
	{
		String ret = "";
		ret = ret+(onFirstNameBase? "Viele Gr��e\n"+firstname : "Mit freundlichen Gr��en\n"+firstname+" "+name);
		ret = ret+(signature? "\n_______________________\n"+signatureText:"");
		return ret; // TODO

	}
	
	public static void main(String[] args) {
		testSalutation();							
	}
}
