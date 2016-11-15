import java.util.Scanner;

public class Exercise4__22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter first string
		System.out.println("Enter string s1: ");
		String s1 = input.nextLine();
		System.out.println("Enter string s2: ");
		String s2 = input.next();
		
		// Calculate argument
		if (s1.contains(s2)) {
			System.out.println(s2 + " is a substring of " + s1);
		}
		else {
			System.out.println(s2 + " is not a substring of " + s1);
		}
	}
}
