package blatt07;

public class SimplifyOrTransform {
	
	/**  Formen Sie bitte die folgenden Ausdr�cke etc. in vereinfachte Varianten um: */  
	static void toBeSimplified()
	{
		int a, b, c;
		
		// Beispiel: Mehrfache Initialisierung mit dem selben Wert:
		a = 0; b = 0; c = 0;
		// Vereinfacht:
		a = b = c = 0; 
		
		a = (b = 1 + (c = 0));
		// Vereinfacht:
		a = b = 1 + (c = 0);
		
		a = b++ - (b += 2) - (b = 0); //Substraktion mit 0 �berfl�ssig -> kann weggelassen werden
		// Vereinfacht:
		a = b++ - (b+=2);
		
		// �ndern Sie bitte ab auf, wo passend, Dekrement/Inkement-Opratoren 
		// oder kombinierte Zuweisungsoperatoren (jeweils ohne die Ausgabe zu �ndern ...)
		final int N0 = 0, N1 = 17;
		for(int i = N0; i < N1; i = i + 1) {
			System.out.print(i + ", ");
		}

		System.out.println();
		for(int i = N1 - 1; i >= N0; i = i - 1) {
			System.out.print(i + ", ");
		}

		System.out.println();
		for(int i = N0; i < N1; i = i + 2) {
			System.out.print(i + ", ");
		}

		System.out.println();
		for(int i = N1 - 1; i >= N0; i = i - 2) {
			System.out.print(i + ", ");
		}

		System.out.println();
		for(int i = N0 + 1; i < N1 * N1; i = i + i) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// Formen Sie bitte die folgende while-Schleifen in for-Schleifen um 
		// und verwenden Sie wieder Inkrementoperatoren/kombinierte Zuweisungsoperatoren 
		a = 1;
		final int NMAX = 10;
		/*
		while(a < NMAX)
		{
			b = 1;
			while(b < NMAX) {
				System.out.printf("%3d", a * b);
				b = b + 1;
			}
			System.out.println();
			a = a + 1;
		}
		*/
		for(a = a; a<NMAX ; a++) {
			b = 1;
			while(b < NMAX) {
				System.out.printf("%3d", a * b);
				b = b + 1;
			}
			System.out.println();			
		}

		System.out.println();
		a = 3; 
		while(a < 100)
		{
			b = 2;
			while(b*b < a && a % b != 0) {
				b = b + 1;
			}
			if(b * b > a) {
				System.out.print(a + ", ");
			}
			a = a + 2;
		}
		
		// Transformieren Sie bitte folgende If-/Else-Kette in eine Switch-Anweisung
		int zufallsZahl = 1  + (int) (Math.random() * 6.);

		String seite;
		if(zufallsZahl == 1) {
			seite = "Eins"; 
		}
		else if(zufallsZahl == 2) {
			seite = "Zwei"; 
		}
		else if(zufallsZahl == 3) {
			seite = "Drei"; 
		}
		else if(zufallsZahl == 4) {
			seite = "Vier"; 
		}
		else if(zufallsZahl == 5) {
			seite = "F�nf"; 
		}
		else if(zufallsZahl == 6) {
			seite = "Sechs"; 
		}
		else  {
			seite = "Ung�ltig"; 
		}
		System.out.println("\nGew�rfelt: " + seite );
	}
	public static void main(String[] args) {
		toBeSimplified();
	} 

}
