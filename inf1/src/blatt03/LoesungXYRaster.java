package blatt03;
import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungXYRaster(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(604,417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
        this.setBackground(Color.WHITE);
       
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungXYRaster();
    }
   

    /** Paint-Methode. Nichts zu ändern hier. Diese Methode 
     *  wird beim Öffnen des Fensters automatisch aufgerufen. 
     *  Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     *  verändert wird. 
     *  @param g Grafik, auf die gezeichnet wird.
     *  */
    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	
    	this.meinRaster(g); // Aufruf der selbst programmierten Methode
    }
   
	/** 
	 * Hier bitte die Lösung, um das Raster zu zeichnen
	 * 
	 */
   public void meinRaster(Graphics g){
     int x25 = this.getWidth() / 4;
     int x75 = this.getWidth() * 3 / 4;
     int linienanzahl = 11;
     int y25 = this.getHeight() / 4;
     int y75 = this.getHeight() * 3 / 4;

     for(int liniennummer = 0; liniennummer<linienanzahl;liniennummer++) {
       if((liniennummer+1) %2 == 0) {
         g.setColor(Color.LIGHT_GRAY);
       }else {
         g.setColor(Color.BLACK);
       }
       //Horizontale Linie
       int y = y25+liniennummer * this.getHeight() * 2 / (4*(linienanzahl-1));
       g.drawLine(x25, y, x75, y);
       
       //Vertikale Linie
       int x = x25+liniennummer * this.getWidth() * 2 / (4*(linienanzahl-1));
       g.drawLine(x, y25, x, y75);
       
     }
   } 
}
