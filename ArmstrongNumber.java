package week1.Day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Number to check whether it is an Armstrong number or not
		int input = 370;
		int calculated = 0;
		int remainder;
		int originalNumber;
		
		originalNumber = input;
		while (originalNumber > 0) {

			remainder = originalNumber % 10;
			// cubic power is added to the calculated variable
			calculated += (remainder * remainder * remainder);

			originalNumber = originalNumber / 10;
		}

		if (calculated == input) {
			System.out.println("It is an Armstrong Number");
		} else
			System.out.println("It is not an Armstrong number");

	}

}
