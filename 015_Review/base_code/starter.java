import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
	String answer = sc.nextLine();
		System.out.println("What is your title?");
	String answer2 = sc.nextLine();
		System.out.println("Choose your destiny. Would you like to be a Wizard, Warrior, or a Rogue");
	String answer3 = sc.nextLine();

	
	if ((answer3) .equals("Warrior")){
		System.out.println("You've chosen Warrior. FOR THE BROTHERHOOD!");
	}
	else if ((answer3) .equals("Wizard")){
		System.out.println("You've chosen Wizard. An enchanted journey awaits");
	}
	else if ((answer3).equals("Rogue")){
		System.out.println("You've chosen Rogue. Interesting...");
	}
	else {
		System.out.println("You've made a mistake. Check your spelling...");
	}
		System.out.println("You have 25 skill points to spend on any of the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely...");
int totalpoints = 25;
		System.out.println("Strength (1-10):");
		int S = sc.nextInt();
	if (S > 10){
		System.out.println("You can't use more than 10 points per skill...Try Again with a smaller value.");
		S = sc.nextInt();
		
		totalpoints = (totalpoints-S);
	}
	else if (S <= 10){
		
		totalpoints = totalpoints-S;
		
		System.out.println("You have " + (totalpoints) + " points left to spend.");
	}
	System.out.println("Dexterity (1-10):");
		int S2 = sc.nextInt();
	if (S2 > 10){
		System.out.println("You can't use more than 10 points per skill...Try Again with a smaller value.");
		S2 = sc.nextInt();
		
		totalpoints = (totalpoints-S2);
	}
	else if (S2 <= 10){
		
		totalpoints = totalpoints-S2;
		
		System.out.println("You have " + (totalpoints) + " points left to spend.");
	}
	System.out.println("Intelligence (1-10):");
		int S3 = sc.nextInt();
	if (S3 > 10){
		System.out.println("You can't use more than 10 points per skil...Try Again with a smaller value.");
		S3 = sc.nextInt();
		
		totalpoints = (totalpoints-S3);
	}
	else if (S3 <= 10){
		
		totalpoints = totalpoints-S3;
		
		System.out.println("You have " + (totalpoints) + " points left to spend.");
	}
	System.out.println("Constitution (1-10)");
		int S4 = sc.nextInt();
	if (S4 > 10){
		System.out.println("You can't use more than 10 points per skil...Try Again with a smaller value.");
		S4 = sc.nextInt();
		totalpoints = (totalpoints-S4);
	}
	else if (S4 <= 10){
		
		totalpoints = totalpoints-S4;
		
		System.out.println("You have " + (totalpoints) + " points left to spend.");
	}
	System.out.println("Charisma (1-10):");
		int S5 = sc.nextInt();
	if (S5 > 10){
		System.out.println("You can't use more than 10 points per skil...Try Again with a smaller value.");
		S5 = sc.nextInt();
		totalpoints = (totalpoints-S5);
	}
	else if (S5 <= 10){
		
		totalpoints = totalpoints-S5;
		
		System.out.println("You have " + (totalpoints) + " points left to spend.");
	}
System.out.println("---------------------------------------------------------");
System.out.println("You are " + (answer) + ", the " + (answer2) + ".");
System.out.println("You're a " + (answer3) + " with the following stats!");
System.out.println("Strength - " + (S));
System.out.println("Dexterity - " + (S2));
System.out.println("Intelligence - " + (S3));
System.out.println("Constitution - " + (S4));
System.out.println("Charisma - " + (S5));
	System.out.println("Good luck on your quest " + (answer) + "!");
	
if (totalpoints >= 0){
	System.out.println("You have " + (totalpoints) + " points left to spend.");
	}
}
}