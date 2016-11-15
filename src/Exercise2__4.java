import java.util.Scanner;

public class Exercise2__4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter number in pounds
		System.out.println("Enter a number in pounds: ");
		
		//convert pounds to kilograms
		double pounds = input.nextDouble();
		double kilograms = (pounds * 0.454);
		
		//display results
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	}
}