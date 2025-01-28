//interface with static keyword:

interface Banks{
	
	//JAVA-8 feature
	default void display() {
		System.out.println("default method");
	}
	
	static void show() {
		System.out.println("static method.");
	}
	//JAVA-8 feature
	
	//JAVA-9 feature
	private void roi() {
		System.out.println("private method.");
	}
	
}

public class Studenth implements Banks {

	public static void main(String[] args) {

//object call with help of method
//		Studenth myobj = new Studenth();
//		myobj.show();
		
//static method call
		Banks.show();

	}

}
