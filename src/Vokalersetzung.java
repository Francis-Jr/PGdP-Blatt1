import java.util.Scanner;


public class Vokalersetzung {
	
	private static String text = "Hat der alte Hexenmeister \n"
			+ "sich doch einmal wegbegeben! \n"
			+ "Und nun sollen seine Geister \n"
			+ "auch nach meinem Willen leben. \n"
			+ "Seine Worte und werke\n"
			+ "merkt ich und den Brauch,\n"
			+ "und mit Geisterstärke\n"
			+ "tu ich Wunder auch.\n"
			+ "Walle! walle\n"
			+ "Manche Strecke,\n"
			+ "daß, zum Zwecke,\n"
			+ "Wasser fließe\n"
			+ "und mit reichem, vollem Schwalle\n"
			+ "zu dem Bade sich ergieße.\n";
	
	private static String c = "a";
	
	public static void main(String[] args){
		
		System.out.print("Please enter a vowel:  ");
		Scanner keyboard = new Scanner(System.in);
		c = keyboard.nextLine();
		
		if(c.length() > 1){
			System.out.println("That's more than one Character! I won't do this!!!");
			return;
		}
		
		if("aeiouAEIOU".indexOf(c) < 0){
			System.out.println("That's not a vowel! Well... I will do it anyway...");
		}
		
		c = c.toLowerCase();
		text = text.replace("a", c).replace("e", c).replace("i", c).replace("o", c).replace("u", c);
		c = c.toUpperCase();
		text = text.replace("A", c).replace("E", c).replace("I", c).replace("O", c).replace("U", c);
		System.out.println(text);
	}
}
