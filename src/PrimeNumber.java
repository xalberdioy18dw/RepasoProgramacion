import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to know if it is prime or not");
		int number = sc.nextInt();
		int i = 0;
		int count = 0;
		for (i = 2; i < number; i++) {
			if (number % i == 0 ) {
				count++;
			}		
		}
		if (count == 0) {
			System.out.println(number + " is a prime number.");
		}
		else {
			System.out.println(number + " is not a prime number");
		}

	}

}
