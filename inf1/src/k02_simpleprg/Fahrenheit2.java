	
	// Datei Fahrenheit2.java
	package k02_simpleprg;
	
	public class Fahrenheit2 {
		/**
		 * Geg.: Temperaturbereich in Grad F <br/>
		 * Ges.: Temperaturliste in Grad C
		 * 
		 * @param args
		 *            unused
		 */
		public static void main(String[] args) {
	
			final int UPPER = 250; // obere Grenze
			final int LOWER =   0; // untere Grenze
			final int STEP  =  25; // Schrittweite
	
			int fahrenheit = LOWER; // Schleifenvariable initialisieren
			while (fahrenheit <= UPPER) // Schleifenbedingung
			{
				int celsius = 5 * (fahrenheit - 32) / 9;
				System.out.println(fahrenheit + "°F = " + celsius + "°C");
				fahrenheit = fahrenheit + STEP; // Fortsetzung: Schleifenvariable erhoehen
			}
		}
	}
	
	
	
