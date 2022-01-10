import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
	int	x = a;
	int y = b;
	int count = 0;
	int c = 1;
	while (count < y){
		c = (c*x);
		count = count + 1;
	}
	System.out.println(c);
	return c;	
		}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = sc.nextInt();
		System.out.println("Enter another integer");
		int b = sc.nextInt();
		pow(a,b);
	}
}
