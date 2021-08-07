package week1.Day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		int sum = 0;
		int quotient = 1;
		int remainder = 0;
		while (quotient != 0) {

			remainder = number % 10;

			sum += remainder;

			quotient = number / 10;

			number = quotient;

			System.out.println("quotient : " + quotient + " remainder : " + remainder);
		}
		System.out.println("Sum of digits : " + sum);

	}

}
