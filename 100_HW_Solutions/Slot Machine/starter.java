import java.util.Scanner;
import java.util.Random;

class starter {
	static int totalpoints = 100;
	static final String DEFAULTMESSAGE = "\u001b[4mWelcome to the Slot machine would you like to play? (Yes/yes/y/y)?\u001b[24m";
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(DEFAULTMESSAGE);
		String ans1 = sc.nextLine();
		System.out.println("You have " + totalpoints +  " dollars to start. Spend it wisely...");
		
		while(!ans1.equals("No") || !ans1.equals("no") || !ans1.equals("N") || !ans1.equals("n")){
			if ((ans1).equals ("No") || ans1.equals("no") || ans1.equals("N") || ans1.equals("n")){
				System.out.println("Thanks for playing:) Come Back Soon...");
				System.exit(0);	
			}
			else if ((ans1).equals ("Yes") || ans1.equals("yes") || ans1.equals("Y") || ans1.equals("y")){
	 			System.out.println("Input a wager that is less than or equal to $" + (totalpoints) + ".");
	 			System.out.println("What would you like your wager to be?");
				int wager = sc.nextInt();
	 			sc.nextLine();
	 			handleRolls(wager);
	 			System.out.println("Would you like to continue?");
				ans1 = sc.nextLine();
			}
			else{
	 			System.out.println("Invalid Input");
	 			// System.out.println(ans1);
	 			System.out.println("Would you like to continue?(y/n)");
	 			// sc.nextLine();
				ans1 = sc.nextLine();
			}
			
		}
	}
	
	public static void handleRolls(int wager){
		if (wager > totalpoints){
			System.out.println("You cannot bet more than you have.");
			return;
		}
		Random rand = new Random();
		int r1 = rand.nextInt(9)+1;
	 	int r2 = rand.nextInt(9)+1;
	 	int r3 = rand.nextInt(9)+1;
	 	System.out.println("Great Let's play!!!");
	 	System.out.println("Your rolls are:");
	 	System.out.println("_____________________________");
	 	System.out.println(" | " + (r1) + " | " + (r2) + " | " + (r3) + (" | "));
	 	System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	 	
		if ((r1==r2) && (r1 == r3)){
	 		totalpoints += wager*2;
			System.out.println("J A C K P O T ! ! !");
			System.out.println("You now have $" + (totalpoints) + ".");
		}
		else if (r1 == r2 || r1 == r3 || r2 == r3){
			totalpoints += wager;
			System.out.println("W I N N E R!!!");
			System.out.println("You now have $" + (totalpoints) + ".");
		}
		else{
			System.out.println("Didn't win this time, better luck next time!");
			totalpoints -= wager;
			if (totalpoints <= 0){
				System.out.println("\u001b[4;3mYou Lost!\nGive us more money next time!\u001b[24;23m");
				System.exit(0);
			}
			
		}
	}
}