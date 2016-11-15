import java.util.Scanner;

public class Exercise2__23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter Distance of Driving, miles per gallon, and price per gallon
		System.out.println("Enter the driving distance(in miles): ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon (MPG): ");
		double mpg = input.nextDouble();
		
		System.out.println("Enter price per gallon: $");
		double pricePerGallon = input.nextDouble();

		// Calculate the cost of driving
		double drivingCost = (distance / mpg * pricePerGallon);
		
		// Display results
		System.out.println("The cost of Driving is: $" + (int)(drivingCost * 100.0) / 100.0);
			
	}
}