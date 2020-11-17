	
	// Datei Fahrenheit4.java
	package blatt02;
	
	public class Fahrenheit4 {
		/**
		 * Geg.: Temperaturbereich in Â°F <br/>
		 * Ges.: Temperaturliste in Â°C
		 * 
		 * @param args
		 *            unused
		 */
		public static void main(String[] args) {
	
			final int UPPER = 250; // obere Grenze
			final int LOWER =   0; // untere Grenze
			final int STEP  =  25; // Schrittweite
			final int NUM_PER_ROW = 5; //Anzahl an Werten pro Zeile
			
			String output = "";
			int valuescount = 0;
	
			for (int fahrenheit = LOWER; fahrenheit <= UPPER; fahrenheit = fahrenheit + STEP )
				//    Initialisierung  ; Bedingung          ; Fortsetzung: Schleifenvariable erhoehen			
			{
				int celsius = 5 * (fahrenheit - 32) / 9;
				output = output +"   "+ fahrenheit + "°F = " + celsius + "°C";
				valuescount++;
				if(valuescount % NUM_PER_ROW == 0 || fahrenheit == UPPER) {
				  System.out.println(output);
				  output = "";
				}
			}
		}
	}

	