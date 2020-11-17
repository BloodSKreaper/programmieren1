package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Zusatzaufgabe:
 * Klasse f�r das Zeichnen von Sternen entlang einer Spirale.
 * Wir leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu k�nnen.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {

    /** Konstruktor. Nichts zu �ndern hier */
    public LoesungSterneAufSpirale(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024,768);
        this.setTitle("L�sung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu �ndern hier. */
    public static void main(String[] args){
    	new LoesungSterneAufSpirale();
    }
   
	/** 
	 * Bitte ab hier L�sung zum Zeichnen der Sterne auf der Spirale entwickeln.
	 */
    public void paint(Graphics g){
    	/* L�schen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());

   } 
}
