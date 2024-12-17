package Day4;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num1:-");
		int num1 = scan.nextInt();
		System.out.println("Enter num2:-");
		int num2 = scan.nextInt();
		
		int result = num1 + num2;
		System.out.println("Result : " + result);

	}

}
