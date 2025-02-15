/*throw keyword:- throw keyword is used to throw the 
 * custom exception. It only throw the Exception but 
 * it cannot handle the Exception */

public class example5 {
	
	static void validate(int age) {
		
		if (age<18) {
			//new keyword is used because it has defined classes.
			throw new ArithmeticException("Age is below 18");
		} else {
			System.out.println("Eligible fot vote.");
		}
	}

	public static void main(String[] args) {
		
		try {
			validate(15);
		} catch (Exception e) {
			System.out.println("try next year!");
		}
		
		/* when we call validate method exactly it goes to 
		 * if block and throws the Exception. 
		 * if we don"t call validate() method,we put
		 * it in the try block as a critical statement,then it
		 * can handle the Exception.*/
		
		System.out.println("rest code...");

	}

}
