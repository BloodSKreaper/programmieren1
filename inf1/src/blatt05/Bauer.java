package blatt05;

public class Bauer {
	private int anzahlGefuetterterHuehner; // Mit einem weiteren Bauer ist hier eine Klassenvariable sinnvoll
	private String name;

	public Bauer(String name) {
		this.name = name;
	}

	public void fuettern(Huhn huhn) {
		if (huhn.isHungrig()) {
			huhn.setHungrig(false);
			anzahlGefuetterterHuehner++;
		}
	}

	public void rufeHuhn(Huhn huhn) {
		System.out.println(huhn.getName());
	}

	public int berechneAnzahlHungrigerHuehner() {
		return Huhn.getAnzahlHuehner() - anzahlGefuetterterHuehner;
	}

}
