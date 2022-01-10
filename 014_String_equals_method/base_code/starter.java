import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose your destiny. Would you like to be a Wizard, Warrior, or a Rogue");
	String answer = sc.nextLine();
	
	if ((answer) .equals("Warrior")){
	System.out.println("You've chosen Warrior. FOR THE BROTHERHOOD!");
	}
	else if ((answer) .equals("Wizard")){
		System.out.println("You've chosen Wizard. An enchanted journey awaits");
	}
	else if ((answer).equals("Rogue")){
		System.out.println("You've chosen Rogue. Interesting...");
	}
	else {
		System.out.println("You've made a mistake. Check your spelling...");
	}
	
}
}
