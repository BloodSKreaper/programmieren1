package blatt05;

public class Huhn {
	private static int anzahlHuehner;
	private String name;
	private boolean hungrig = true;
	
	public Huhn(String name) {
		this.name = name;
		anzahlHuehner++;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isHungrig() {
		return hungrig;
	}
	
	public void setHungrig(boolean hungrig) {
		this.hungrig = hungrig;
	}
	
	public static int getAnzahlHuehner() {
		return anzahlHuehner;
	}
	

}
