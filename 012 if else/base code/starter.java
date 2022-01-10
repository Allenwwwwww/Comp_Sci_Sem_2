import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	String Eva = ("Pick a number between 1 and 1000");
	System.out.println(Eva);
	int x = sc.nextInt();
	int z = rand.nextInt(1000)+1;
	String correct = ("You're correct, the number was " + z +".");
	String notcorrect = ("Whamp wha, you're wrong, the number was " + z + ".");
	if (x==z)
	{
		System.out.println(correct);
	}
	else if (x!=z)
	{
		System.out.println(notcorrect);
	}
}
}