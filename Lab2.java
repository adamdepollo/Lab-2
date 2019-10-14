
/*
 * @Adam DePollo, 10/15/19
 */
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// Create scanner
		Scanner scnr = new Scanner(System.in);
		// Declare variables, assign contValue with 0
		double length;
		double width;
		String cont;
		int contValue = 0;

		// Welcome user
		System.out.println("Welcome to the Grand Circum Room Detail Generator!");

		// Create while loop based on contValue
		while (contValue == 0) {
			System.out.println();

			// Request user input for length and width
			System.out.println("Enter length: ");
			length = scnr.nextDouble();
			System.out.println("Enter width: ");
			width = scnr.nextDouble();

			// Calculate and print area and perimeter
			System.out.println("Area: " + (length * width));
			System.out.println("Perimeter: " + (2 * (length + width)));

			// Clear scanner
			scnr.nextLine();
			System.out.println();

			// Ask whether the user wants to continue
			System.out.println("Continue? (y/n)");
			cont = scnr.nextLine();

			// Change contValue based on user input in order to determine whether to
			// continue the loop
			switch (cont) {
			case "y":
				contValue = 0;
				break;
			case "n":
				contValue = 1;
				break;
			}
		}
		// Say goodbye to user and close scanner
		System.out.println("Bye!");
		scnr.close();

	}
}
