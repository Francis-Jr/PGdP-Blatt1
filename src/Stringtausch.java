
public class Stringtausch {
	private static String 	varA = "eins",
							varB = "zwei",
							varC = "drei",
							tmp = "";
	
	
	public static void main(String[] args){
		
		printVars();
		
		//Tausche A&B
		tmp = varA;
		varA = varB;
		varB = tmp;
		
		printVars();
		
		//Tausche zyklisch
		tmp = varA;
		varA = varC;
		varC = varB;
		varB = tmp;
		
		printVars();
	}
	
	private static void printVars(){
		System.out.println("varA = "+varA);
		System.out.println("varB = "+varB);
		System.out.println("varC = "+varC);
		System.out.println("");
	}
}
