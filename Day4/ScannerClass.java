package Day4;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name:-");
		String name = scan.next();
		System.out.println("My name is " + name);
	}

}
