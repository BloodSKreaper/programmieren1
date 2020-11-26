package blatt06;

import java.util.Arrays;

public class ArrayStatistic {

	public static void main(String[] args) {
		// int[] array = { 35, 7, 90, 26, 92, 54, 24, 65, 2, 67, 43, 26, 80, 92, 7, 40,
		// 67, 66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51 };
		int[] array = { 1, 2, 5, 10 };
		int summe = 0;
		for (int index = 0; index < array.length; index++) {
			summe = summe + array[index];
		}
		double mittelwert = (double) summe / (double) array.length;
		System.out.printf("Mittelwert: %.2f\n", mittelwert);
		Arrays.sort(array); // Nach Größe sortieren, von niedrig bis hoch
		System.out.printf("Minimaler Wert: %d \t Maximaler Wert: %d\n", array[0], array[array.length - 1]);
		double median;
		int n = array.length;
		if (array.length % 2 == 0) {
			/*
			 * Formel aus dem Internet. Angepasst, dass Index stimmt (Mathematiker fangen
			 * bei 1 an, Informatiker aber mit 0) Folglich muss vom berechneten Index 1
			 * subtrahiert werden.
			 */

			median = (1. / 2.) * (array[(n / 2) - 1] + array[(n / 2 + 1) - 1]);
		} else {
			median = array[((n + 1) / 2) - 1];
		}
		System.out.printf("Median: %.2f\n", median);

		//Aufgabe 6.3
		double[][] schadensWahrscheinlichkeit = {
				{0,74.4},
				{350,18.2},
				{1500,6.1},
				{5000,1.3}
		};
		//Berechnung Erwartungswert
		double erwartungswert = 0;
		for(double[] eintrag:schadensWahrscheinlichkeit) {
			erwartungswert=erwartungswert+eintrag[0]*(eintrag[1]/100);
		}
		System.out.printf("Erwartungswert: %.2f",erwartungswert);
	}

}
