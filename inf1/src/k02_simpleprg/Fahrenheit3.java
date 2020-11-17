	
	// Datei Fahrenheit3.java
	package k02_simpleprg;
	
	public class Fahrenheit3 {
		/**
		 * Geg.: Temperaturbereich in °F <br/>
		 * Ges.: Temperaturliste in °C
		 * 
		 * @param args
		 *            unused
		 */
		public static void main(String[] args) {
	
			final int UPPER = 250; // obere Grenze
			final int LOWER =   0; // untere Grenze
			final int STEP  =  25; // Schrittweite
	
			int fahrenheit = LOWER; // Schleifenvariable initialisieren
			do
			{
				int celsius = 5 * (fahrenheit - 32) / 9;
				System.out.println(fahrenheit + "°F = " + celsius + "°C");
				fahrenheit = fahrenheit + STEP; // Fortsetzung: Schleifenvariable erhoehen
			}
			while (fahrenheit <= UPPER); // Schleifenbedingung
		}
	}