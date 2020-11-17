

/**
 * Datei: Befragung.java Erstes Java-Programmbeispiel
 */
package k01_intro;

import java.util.Scanner;

/**
 * @author Ulrich.Broeckl@hs-karlsruhe.de
 */
public class Befragung {


  /**
   * Geg.: n Ja-/Nein-Fragen <br/>
   * Ges.: Relative Haeufigkeiten p_i in Prozent, i = 1...n
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    int h; // Anzahl Hoerende
    float p_i; // Laufende Wahrscheinlichkeit in %

    System.out.println("Bitte Anzahl Hoerende eingeben:");
    Scanner sc = new Scanner(System.in);
    h = sc.nextInt();
    System.out.println("Es gibt " + h + " Hoerende.");

    String[] fragen = new String[] {
        "Persoenlicher Internetanschluss bzw. -zugang? Anzahl:",
        "Eigener PC? Anzahl:", 
        "Eigene Webcam? Anzahl:", 
        "Eigenes Mikrofon? Anzahl:"
    };

    for (int i = 0; i < fragen.length; i++) {

      System.out.println(i + 1 + ". " + fragen[i]);
      p_i = 100.f * sc.nextInt() / h;
      System.out.println("Anteil: " + p_i + "%");
    }
    sc.close();
  }
}

