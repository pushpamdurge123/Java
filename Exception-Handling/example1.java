//exception handling: finally keyword\

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a= scan.nextInt();
		int b= scan.nextInt();
		
		int result=0;
		
		try {
			result=a/b;
		} catch (ArithmeticException e) {
			System.out.println("dividing by zero is not allowed" + e.getMessage());
		}
		
		System.out.println("Result:" +result);
		
	}

}
