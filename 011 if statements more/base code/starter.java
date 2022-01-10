import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int var1 = sc.nextInt();
		System.out.println("Enter another integer");
		int var2 = sc.nextInt();
		
		if (var1==var2){
			System.out.println("The two integers are equal to eachother");
		}
		if (var1!=var2){
			System.out.println("The two integers are not equal to eachtoher");
		}
		
	}
}

