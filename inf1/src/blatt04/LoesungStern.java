package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse f�r das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

    /** Konstruktor. Nichts zu �ndern hier */
    public LoesungStern(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setTitle("L�sung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu �ndern hier. */
    public static void main(String[] args){
    	new LoesungStern();
    }
   
    /** Paint-Methode. Nichts zu �ndern hier. Diese Methode 
     *  wird beim �ffnen des Fensters automatisch aufgerufen. 
     *  Die Methode wird auch aufgerufen, wenn die Gr��e des Fensters
     *  ver�ndert wird. 
     *  @param g Grafik, auf die gezeichnet wird.
     *  */
    public void paint(Graphics g){
    	/* L�schen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	
    	this.meinStern(g); // Aufruf der selbst programmierten Methode
    }
	/** 
	 * Hier bitte die L�sung, um den Stern zu zeichnen
	 * 
	 */
   public void meinStern(Graphics g){
	   int xMitte = this.getWidth() / 2;
	   int yMitte = this.getHeight()/2;
	   
	   //x = r * cos(phi)
	   //y = r * sin(phi)
	   //phi = 0 bis 2*pi
	   int n = 32;
	   int radius = this.getHeight()/3;
	   for(int i=0; i<n;i++) {
		   int r;
		   if((i+1)%2==0) {
			   r = radius /2;
			   g.setColor(Color.RED);
		   }else {
			   r = radius;
			   g.setColor(Color.BLUE);
		   }
		   double phi = i * (2 * Math.PI)/n;
		   double x = r * Math.cos(phi)+xMitte;
		   double y = r * Math.sin(phi)+yMitte;		   
		   g.drawLine((int)x, (int)y, xMitte, yMitte);
		   
	   }
   }
   
   public void zeichneEinenStern(Graphics g, int midX, int midY, int r) {
	   int n = 32;
	   for(int i=0; i<n;i++) {
		   int radius;
		   if((i+1)%2==0) {
			   radius = r /2;
			   g.setColor(Color.RED);
		   }else {
			   radius = r;
			   g.setColor(Color.BLUE);
		   }
		   double phi = i * (2 * Math.PI)/n;
		   double x = radius * Math.cos(phi)+midX;
		   double y = radius * Math.sin(phi)+midY;		   
		   g.drawLine((int)x, (int)y, midX, midY);
		   
	   }
	   
   }
}