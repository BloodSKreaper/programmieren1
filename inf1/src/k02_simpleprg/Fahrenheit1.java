	
	// Datei Fahrenheit1.java
	package k02_simpleprg;
	public class Fahrenheit1 {
	    /**
	     * Geg.:   Einige Temperaturen in °F <br/>
	     * Ges.:   Temperaturen in °C
	     * @param  args unused
	     */
	    public static void main(String[] args) {
	     	
	    	final int F100  = 100; // Fester Wert von Interesse
	    	
	    	int celsius = 5 * (F100 - 32) / 9;
	    	System.out.println(celsius);
	
	   }
	}
	
	
	/* Weitere Bauteile:
	 
	 		// Methode println ist ueberladen, fkt. auch mit Zeichenketten
	    	System.out.println(celsius + "°C");
	    	
	    	// (5/9) ist 0 bei int!
	    	celsius = (F100 - 32) * (5/9);
	    	System.out.println(celsius);
	
			// Einfacher Wechsel nach Datentyp float funktioniert nicht
	   		float fcelsius = ((F100 - 32) * (5/9));
	    	System.out.println(fcelsius);
			
			// Einfacher Wechsel auf Gleitpunkt-Literal fkt. auch nicht
	   		float fcelsius = ((F100 - 32) * (5./9));
	    	System.out.println(fcelsius);
	
			// Entweder float-Literal einsetzen
	   		float fcelsius = ((F100 - 32) * (5.f/9));
	    	System.out.println(fcelsius);
	    	
	    	// Oder in den gewuenschten Datentyp casten:
	   		float fcelsius = (float) ((F100 - 32) * (5./9));
	    	System.out.println(fcelsius);
	    	
	   		// Oder mit Datentyp double arbeiten:
	   		double dcelsius = ((F100 - 32) * (5./9));
	    	System.out.println(dcelsius);
	
	
	*/