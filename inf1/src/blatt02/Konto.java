package blatt02;

import java.util.Scanner;

public class Konto {
  public static void main(String[] args) {
    int modus;
    double guthaben = 0.0;
    double zins = 2.0;
    double erhoehungEndeJahr = 1000;
    int jahre = 30;
    int sparziel = 0;
    Scanner sc = new Scanner(System.in);
    System.out
        .println("Bitte entscheiden Sie welche der folgenden Berechnung Sie ausführen möchten:");
    System.out.println("1) Sparplan mit Zinseszins");
    System.out.println("2) Sparplan ohne Zinseszins");
    System.out.println("3) Erforderliche Dauer eines Sparziels mit Zinseszins");
    modus = sc.nextInt();
    // Sparplan mit Zinseszins
    if (modus == 1) {
      System.out.println("Bitte geben Sie Ihr Startguthaben ein:");
      guthaben = sc.nextDouble();
      System.out.println("Bitte geben Sie den Zinssatz (in %) ein:");
      zins = sc.nextDouble();
      System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein:");
      jahre = sc.nextInt();

      for (int laufjahr = 1; laufjahr <= jahre; laufjahr++) {
        guthaben = guthaben + guthaben * (zins / 100) + erhoehungEndeJahr;
        System.out.println("Guthaben nach dem " + laufjahr + ". Jahr: " + guthaben);
      }
    }
    // Sparplan ohne Zinseszins
    if (modus == 2) {
      System.out.println("Bitte geben Sie Ihr Startguthaben ein:");
      guthaben = sc.nextDouble();
      System.out.println("Bitte geben Sie den Zinssatz (in %) ein:");
      zins = sc.nextDouble();
      System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein:");
      jahre = sc.nextInt();
      
      double zinsauszahlung = 0;
      for (int laufjahr = 1; laufjahr <= jahre; laufjahr++) {
        zinsauszahlung = zinsauszahlung + guthaben * (zins / 100);
        guthaben = guthaben + erhoehungEndeJahr;
        double gesamtguthaben = guthaben + zinsauszahlung;
        System.out.println("Guthaben einschließlich des abgehobenen Betrags nach dem " + laufjahr
            + ". Jahr: " + gesamtguthaben);
      }

    }
    //Erreichung des Sparzieles mit Zinseszins
    if (modus == 3) {
      System.out.println("Bitte geben Sie Ihr Startguthaben ein:");
      guthaben = sc.nextDouble();
      System.out.println("Bitte geben Sie den Zinssatz (in %) ein:");
      zins = sc.nextDouble();
      System.out.println("Bitte geben Sie Ihr Sparziel ein:");
      sparziel = sc.nextInt();
      
      int laufjahr = 0;
      while(guthaben < sparziel) {
        guthaben = guthaben + guthaben * (zins/100)+erhoehungEndeJahr;
        laufjahr++;
      }
      System.out.println("Guthaben nach dem " + laufjahr + ". Jahr: " + guthaben);
    }
    sc.close();
  }
}
