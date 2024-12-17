package Day4;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		
		int age = scan.nextInt();
		
		if(age>21) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligilbe for vote");
		}

	}

}
