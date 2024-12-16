package Day3;

public class code8 {
	
	//instance variable/global variable:-within the class outside the method but not static  
	//run with the use of object.
	int a = 20;

	public static void main(String[] args) {
		
		code8 obj = new code8();
		obj.number1();
		

	}
	
	void number1() {
		System.out.println(a);
	}
	void number2() {
		System.out.println(a);
	}
	void number3() {
		System.out.println(a);
	}
	void number4() {
		System.out.println(a);
	}

}
