import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* OLD VERSION */
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Which operation do you want?"); System.out.
		 * println("1 - Addition / 2 - Subtraction (A-B)/ 3 - Multiplication / 4 - Division (A/B)"
		 * ); int operation = scanner.nextInt();
		 * 
		 * if (operation>0 && operation <=4) {
		 * 
		 * System.out.println("Enter number A: "); double a = scanner.nextDouble();
		 * System.out.println("Enter number B: "); double b = scanner.nextDouble();
		 * double res;
		 * 
		 * 
		 * switch(operation) {
		 * 
		 * case(1): res = a + b;
		 * System.out.println("The sum of A and B is equal to "+res); break; case(2):
		 * res = a - b;
		 * System.out.println("The subtraction of A and B is equal to "+res); break;
		 * case(3): res = a * b;
		 * System.out.println("The product of A and B is equal to "+res); break;
		 * case(4): res = a / b;
		 * System.out.println("The division of A and B is equal to "+res); break;
		 * 
		 * } } else { System.out.println("Invalid option."); }
		 * 
		 * scanner.close();
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Which operation do you want?");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction (A - B)");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division (A / B)");

		int operation = scanner.nextInt();

		if (operation >= 1 && operation <= 4) {

			System.out.println("Enter the first number: ");
			double num1 = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			double num2 = scanner.nextDouble();

			switch (operation) {

			case (1):
				System.out.println(add(num1, num2));
				break;
			case (2):
				System.out.println(sub(num1, num2));
				break;
			case (3):
				System.out.println(prod(num1, num2));
				break;
			case (4):
				System.out.println(div(num1, num2));
				break;

			}
		} else {
			System.out.println("Invalid Option.");
		}

	}

	static double add(double num1, double num2) {
		System.out.println("The sum of " + num1 + " and " + num2 + " is equal to: ");
		return num1 + num2;
	}

	static double sub(double num1, double num2) {
		System.out.println("The subtraction of " + num1 + " and " + num2 + " is equal to: ");
		return num1 - num2;
	}

	static double prod(double num1, double num2) {
		System.out.println("The product of " + num1 + " and " + num2 + " is equal to: ");
		return num1 * num2;
	}

	static double div(double num1, double num2) {
		System.out.println("The division of " + num1 + " and " + num2 + " is equal to: ");
		return num1 / num2;
	}
}
