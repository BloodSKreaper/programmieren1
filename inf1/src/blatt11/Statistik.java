package blatt11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Klasse, um Mittelwert zu berechnen
 * 
 * @author Ulrich.Broeckl@hs-karlsruhe.de
 *
 */
public class Statistik {
	private double summe;

	protected double n;

	String name;

	/**
	 * Konstruktor
	 * 
	 * @param name Identifikator/Name f�r die Statistik
	 */
	public Statistik(String name) {
		if(name == null) {
			throw new RuntimeException("Name of statistic must not be null.");
		}else if (name.length() == 0){
			throw new RuntimeException("Name of statistic must not be empty.");
		}else if(!Character.isLetter(name.charAt(0))){
			throw new RuntimeException("Name of statistic must start with a letter.");			
		}
		this.name = name;
		this.summe = this.n = 0.;
	}

	/**
	 * Einen neuen Wert der Statistik hinzuf�gen
	 * 
	 * @param wert
	 */
	public void addWert(double wert) {
		this.n++;
		this.summe += wert;
	}

	/**
	 * Durchschnitt berechnen
	 * 
	 * @return Durchschnitt aller Werte
	 */
	double getDurchschnitt() {
		if (n == 0) {
			throw new RuntimeException("No average for an empty statistic available.");
		} else {
			return this.summe / this.n;
		}
	}

	/**
	 * Statistik in Zeichenkette ausgeben
	 * 
	 */
	@Override
	public String toString() {
		if (n == 0) {
			throw new RuntimeException("Empty String cannot be serialized.");
		} else {
			return String.format("%12s: n==%10.0f, �==%8f", this.name, this.n, this.getDurchschnitt());
		}
	}

	/**
	 * Statistik in Datei mit dem Namen der Statistik und der Endung ".statistik"
	 * ausgeben
	 * 
	 * @see https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java
	 */
	public void writeToFile() throws IOException {
		Files.write(Paths.get(this.name + ".statistik"), this.toString().getBytes());
	}

}