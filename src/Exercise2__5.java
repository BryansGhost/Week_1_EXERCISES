import java.util.Scanner;

public class Exercise2__5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Promt user to enter gratuity rate
		System.out.println("Enter the subtotal and Gratuity rate: ");
		
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		// calculate gratuity and convert to two decimal places
		
		double tipAmount = (subtotal / 100.0 * gratuity);
		double tableTotal = (subtotal + (int)(tipAmount * 100.0) / 100.0);
		
		//Display results
		System.out.println("The gratuity is $" + tipAmount + " and the total is $"
				+ tableTotal);
	}
}
