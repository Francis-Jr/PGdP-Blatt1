
public class DieErlkoenigin {
	public static void main(String[] arg) { 
		/* 
		 * Fehler:
		 * 	Zeile 2: 	Fragezeichen ist au�erhalb der Anf�hrungszeichen.
		 * 	Zeile 3: 	mittlere Anf�hrungszeichen �berfl�ssig, oder '+' fehlt.
		 * 	Zeile 4: 	Strichpunkt am Ende des Statements fehlt.
		 *  Zeile 5: 	Statement ist auskommentiert
		 *  Zeile 6: 	Komma statt Strichpunkt.
		 *  Zeile 7:	prettyPrinting-Mangel: Leerzeichen fehl am Platz.
		 *  Zeile 8: 	Statement ist auskommentiert.
		 *  ohne Zeile:	geschweifte Klammer von "public class DieErlkoenigin {" wird nicht geschlossen. 		
		 */
			
		//korrigierte Version:
		System.out.println("Wer reitet so sp�t"); 
		System.out.println("durch Nacht und Wind?"); 
		System.out.println("Es ist die Mutti"); 
		System.out.println("mit ihrem Kind."); 
		System.out.println("Sie hat den Knaben"); 
		System.out.println("wohl in dem Arm,"); 
		System.out.println("Sie fasst ihn sicher,"); 
		System.out.println("sie h�lt ihn warm."); 
	}
}

