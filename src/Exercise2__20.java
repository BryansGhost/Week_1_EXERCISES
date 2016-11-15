import java.util.Scanner;

public class Exercise2__20 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		// Prompt user to enter balance and interest rate
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
			
		// Calculate balance and interest rate (interest = balance * (annualinterestRate/1200)
		
		double interest = (balance * (interestRate/1200));
		
		// Display results
		
		System.out.println("The interest rate is: " + interest);
	}
}