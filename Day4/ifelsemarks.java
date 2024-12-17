package Day4;

import java.util.Scanner;

public class ifelsemarks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks =scan.nextInt();
		
		if(marks>90) {
			System.out.println("Grade A");
		}
		else if (marks>80) {
			System.out.println("Grade B");
		}
		else if (marks>70) {
			System.out.println("Grade C");
		}
		else if (marks>60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}

	}

}
