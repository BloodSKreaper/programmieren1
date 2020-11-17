package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse f�r das zuf�llige Zeichnen von Sternen
 */
public class LoesungZufallsSterne extends JFrame {

	/** Konstruktor. Nichts zu �ndern hier */
	public LoesungZufallsSterne() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 768);
		this.setTitle("L�sung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu �ndern hier. */
	public static void main(String[] args) {
		new LoesungZufallsSterne();
	}

	/**
	 * Bitte ab hier L�sung zum Zeichnen der zuf�lligen Sterne entwickeln.
	 */
	/**
	 * 1. Teilaufgabe: Methode, um einen Stern zu zeichnen.
	 * 
	 * @param g    Grafikbereich, auf dem gezeichnet wird
	 * @param midX x-Koordinate des Mittelpunkts des Sterns
	 * @param midY y-Koordinate des Mittelpunkts des Sterns
	 * @param r    Radius des Sterns
	 */
	public void zeichneEinenStern(Graphics g, int midX, int midY, int r) {
		int n = 32;
		for (int i = 0; i < n; i++) {
			int radius;
			if ((i + 1) % 2 == 0) {
				radius = r / 2;
				g.setColor(Color.RED);
			} else {
				radius = r;
				g.setColor(Color.BLUE);
			}
			double phi = i * (2 * Math.PI) / n;
			double x = radius * Math.cos(phi) + midX;
			double y = radius * Math.sin(phi) + midY;
			g.drawLine((int) x, (int) y, midX, midY);
		}
	}

	/**
	 * Zweite Teilaufgabe: Sterne zuf�llig platzieren mit zuf�lligem Radius
	 */
	public void paint(Graphics g) {
    	/* L�schen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
		for(int i = 0; i<(int) (Math.random()*100);i++) {
		int x = (int) (Math.random() * this.getWidth());
		int y = (int) (Math.random() * this.getHeight());
		int r = (int) (Math.random() * (this.getWidth()/10));
		zeichneEinenStern(g,x,y,r);
		}
	}
}
