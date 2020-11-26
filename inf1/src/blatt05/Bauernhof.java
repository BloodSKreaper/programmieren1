package blatt05;

public class Bauernhof {
	public static void main(String[] args) {
		Bauer bauer = new Bauer("Walter");
		Huhn[] huehner = new Huhn[3];
		huehner[0] = new Huhn("Heidrun");
		huehner[1] = new Huhn("Heike");
		huehner[2] = new Huhn("Hannelore");
		
		for(Huhn huhn : huehner) {
			bauer.rufeHuhn(huhn);
			bauer.fuettern(huhn);
		}
		
	}

}
