import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String question1 = new String ("What's your first name?");
		System.out.println(question1);
		String answer1 = sc.nextLine ();
		String question2 = new String ("How old are you?");
		System.out.println(question2);
		String answer2 = sc.nextLine();
		String question3 = new String ("What month were you born in?");
		System.out.println(question3);
		String answer3 = sc.nextLine ();
		String question4 = new String ("What day were you born on?");
		System.out.println(question4);
		String answer4 = sc.nextLine ();
		String question5 = new String ("What year were you born in?");
		System.out.println(question5);
		String answer5 = sc.nextLine ();
		String question6 = new String ("How much is a buck fifty?");
		System.out.println(question6);
		String answer6 = sc.nextLine ();
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);
		System.out.println(answer5);
		System.out.println(answer6);
		}
}
