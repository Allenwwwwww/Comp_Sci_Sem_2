import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Pick a number between 1 - 1000.");
	int a1 = sc.nextInt();
	int r = rand.nextInt(1000)+1;
	
	if (r == a1){
		System.out.print("Good job you got it right!");
	}
	
	while (r!=a1){
		System.out.println("Try again...");
		a1 = sc.nextInt();
	}
	System.out.print("Good job you got it right!");
	}
}
