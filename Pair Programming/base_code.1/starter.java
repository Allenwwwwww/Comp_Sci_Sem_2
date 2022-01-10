import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer...");
	int x = sc.nextInt();
	
	int y = x;
	int c = x;
	
	int count = 1;
	while(true){
		c = c - 1;
		y = y * c;
		if(count == (x-1)){
			break;
		}
		count = count + 1;
	}
	System.out.println(y);
	}
}
