import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which operation do you want?");
		System.out.println("1 - Sum / 2 - Subtraction (A-B)/ 3 - Multiplication / 4 - Division (A/B)");
		int operation = scanner.nextInt();
		
		if (operation>0 && operation <=4) {
		
		System.out.println("Enter number A: ");
		double a = scanner.nextDouble();
		System.out.println("Enter number B: ");
		double b = scanner.nextDouble();
		double res;
		
		
		switch(operation) {
		
		case(1): res = a + b;
		System.out.println("The sum of A and B is equal to "+res);
		break;
		case(2): res = a - b;
		System.out.println("The subtraction of A and B is equal to "+res);
		break;
		case(3): res = a * b;
		System.out.println("The product of A and B is equal to "+res);
		break;
		case(4): res = a / b;
		System.out.println("The division of A and B is equal to "+res);
		break;
		
		}
		}
		else {
			System.out.println("Invalid option.");
		}
		
	}
	
}
