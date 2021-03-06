		
	package blatt09;
	
	public class RecursivePrintingOfMultiDimArray {
		static String[][][] eBau = {
				{ // UG
					{ // S�d
						"EU01", "EU02", "EU03", "EU04",
					},
					{ // Mitte
						"WC", "Putzraum", "Dusche", 						},
					{ // Nord
						"EU11", "EU12", "EU13", "EU14", 
					}
				}, 
				{ // EG
					{ // S�d
						"E001", "E002", "E003", "E004", 
					},
					{ // Nord
						"E011", "E012",         "E014", 
					}
				}
		}; 
		static String [] simple = {"a", "b"};
		
		/**
		 * Eine Reihung, die rekursiv wieder Reihungen enthalten kann, ausgeben
		 * 
		 * @param objs
		 *            Reihung, die Reihungen oder Zeichenketten enth�lt
		 */
		static void printRecursively(Object[] objs) {
			for (Object obj : objs) {
				if (obj.getClass().isArray()) {
					printRecursively((Object[]) obj);
				} else {
					System.out.println(obj.toString().trim());
				}
			}
		}

		/**
		 * Eine Reihung, die rekursiv wieder Reihungen enthalten kann, als Xml ausgeben
		 * 
		 * @param objs
		 *            Reihung, die Reihungen oder Zeichenketten enth�lt
		 * @param indent
		 *            Wie viel soll bei der Ausgabe einger�ckt werden. Entspricht der
		 *            Rekursionstiefe.
		 */
		static void printInXml(Object[] objs, String indent) {
			for (Object obj : objs) {
				if (obj.getClass().isArray()) {
					printInXml((Object[]) obj, indent+indent);
				} else {
					System.out.println(indent+"<string>"+obj.toString().trim()+"</string>");
				}
			}
			// TODO
		}

	public static void main(String[] args) {
		printRecursively(eBau); // Gegebene Variante
		printInXml(eBau, " ");   // Zu programmierende Variante
		/* Erwartete Ausgabe:
		<container>
		  <container>
		    <string>EU01</string>
		    <string>EU02</string>
		    <string>EU03</string>
		    <string>EU04</string>
		  </container>
		  <container>
		    <string>WC</string>
		    <string>Putzraum</string>
		    <string>Dusche</string>
		  </container>
		  <container>
		    <string>EU11</string>
		    <string>EU12</string>
		    <string>EU13</string>
		    <string>EU14</string>
		  </container>
		</container>
		<container>
		  <container>
		    <string>E001</string>
		    <string>E002</string>
		    <string>E003</string>
		    <string>E004</string>
		  </container>
		  <container>
		    <string>E011</string>
		    <string>E012</string>
		    <string>E014</string>
		  </container>
		</container>
	 */
	
	}
}
