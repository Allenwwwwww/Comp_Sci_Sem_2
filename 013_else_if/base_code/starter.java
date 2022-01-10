import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	String Eva = ("Pick a number between 1 and 1000");
	System.out.println(Eva);
	int x = sc.nextInt();
	int z = rand.nextInt(1000)+1;
	String correct = ("You're correct, the number was " + z +".");
	String smaller = ("Your number is smaller, the number is  " + z + ".");
	String bigger = ("Your number is bigger, the number is " + z +".");
	if (x==z)
	{
		System.out.println(correct);
	}
	if (x!=z&&x>z)
	{
		System.out.println(bigger);
	}
	else if (x!=z&&x<z)
	{
		System.out.println (smaller);
	}
	}
}
