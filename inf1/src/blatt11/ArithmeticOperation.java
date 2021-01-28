package blatt11;

public class ArithmeticOperation {
	/**
	 * Zwei Werte dividieren
	 * 
	 * @param z, Zahl die dividiert wird (Zähler)
	 * @param n, Zahl durch die dividiert wird (Nenner)
	 * @return z / n
	 */
	public static int div(int z, int n) {
		try {
		return z / n;
		}catch(RuntimeException exception) {
			System.err.printf("Fehlergrund: \"%s\"\n",exception.getMessage());
			exception.printStackTrace();
			return Integer.MAX_VALUE;
		}
	}
	
	public static void main(String[] args) {

		int ergebnis = ArithmeticOperation.div(1, 0);
		System.out.println(ergebnis);
	}

}
