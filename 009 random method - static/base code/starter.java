import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int rand_num1 = rand.nextInt(10);
		int rand_num2 = rand.nextInt(100+1);
		double rand_num3 = rand.nextDouble() + rand.nextInt(1)+2.5;
		double rand_num4 = rand.nextDouble() + rand.nextInt(575)+14;
		System.out.println("A number between 0 and 10 is "+rand_num1);
		System.out.println("A number between 1 and 100 is "+rand_num2);
		System.out.println("A number between 2.5 and 3.5 is "+rand_num3);
		System.out.println("A number between 14 and 589 is "+rand_num4);
	}
}
