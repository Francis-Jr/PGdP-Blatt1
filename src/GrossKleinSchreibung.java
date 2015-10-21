
public class GrossKleinSchreibung {
	
	private static String s = "Hello World!";

	public static void main(String[] args) {
		System.out.println(toUpperCase(s));
		System.out.println(toLowerCase(s));
	}

	public static String toUpperCase(String a){
		for(int n = 0 ; n<a.length(); n++){
			a = a.replace(a.charAt(n), Character.toUpperCase(a.charAt(n)));;
		}
		return a;
	}
	
	public static String toLowerCase(String a){
		for(int n = 0 ; n<a.length(); n++){
			a = a.replace(a.charAt(n), Character.toLowerCase(a.charAt(n)));;
		}
		return a;
	}
}
