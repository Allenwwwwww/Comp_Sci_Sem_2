import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do you want your name to be printed?");
		int a = sc.nextInt();
		int count = (0);
		
		while (true){
			System.out.println(name);
			count = count + 1;
		if (count == a){
			break;
		}
	}
	}
}
