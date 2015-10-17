
public class DieErlkoenigin {
	public static void main(String[] arg) { 
		/* 
		 * Fehler:
		 * 	Zeile 2: 	Fragezeichen ist außerhalb der Anführungszeichen.
		 * 	Zeile 3: 	mittlere Anführungszeichen überflüssig, oder '+' fehlt.
		 * 	Zeile 4: 	Strichpunkt am Ende des Statements fehlt.
		 *  Zeile 5: 	Statement ist auskommentiert
		 *  Zeile 6: 	Komma statt Strichpunkt.
		 *  Zeile 7:	prettyPrinting-Mangel: Leerzeichen fehl am Platz.
		 *  Zeile 8: 	Statement ist auskommentiert.
		 *  ohne Zeile:	geschweifte Klammer von "public class DieErlkoenigin {" wird nicht geschlossen. 		
		 */
			
		//korrigierte Version:
		System.out.println("Wer reitet so spät"); 
		System.out.println("durch Nacht und Wind?"); 
		System.out.println("Es ist die Mutti"); 
		System.out.println("mit ihrem Kind."); 
		System.out.println("Sie hat den Knaben"); 
		System.out.println("wohl in dem Arm,"); 
		System.out.println("Sie fasst ihn sicher,"); 
		System.out.println("sie hält ihn warm."); 
	}
}

