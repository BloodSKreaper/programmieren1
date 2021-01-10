package blatt08;

public class RecursionUebung {

	public static void main(String[] args) {
		prt1234(13L);
		prtSqr1234(13L);
		prt2468(1L);
		prt2468(13L);
		prt2468(14L);
		xxx(5);
		xxxLoop(5);
	}

	// Aufgabe 8.5
	public static void prt1234(long n) {
		if (n <= 1) {
			System.out.println();
			System.out.print(1);
		} else {
			prt1234(n - 1);
			System.out.print(", " + n);
		}
	}

	// Aufgabe 8.6
	public static void prtSqr1234(long n) {
		if (n <= 1) {
			System.out.println();
			System.out.print(1);
		} else {
			prtSqr1234(n - 1);
			System.out.print(", " + n * n);
		}
	}

	// Aufgabe 8.7
	public static void prt2468(long n) {
		if (n < 2) {

		} else if (n == 2) {
			System.out.println();
			System.out.print(2);
		} else {
			if (n % 2 == 0) {
				prt2468(n - 2);
				System.out.print(", " + n);
			} else {
				prt2468(n - 1);
			}
		}
	}

	// Aufgabe 8.8
	static void xxx(long n) {//Gibt die Zahlen n, n-1, n-2, n-3, ..., 1 aus
		if (n > 0L) {
			System.out.println(n);
			xxx(n - 1);
		} else {
		}
	}
	
	static void xxxLoop(long n) {
		System.out.println();
		for(;n>0;n--) {
			System.out.print(n+" ");
		}
	}

}
