//method-overriding

class Father{
	
	void car() {
		System.out.println("Skoda-old");
	}
}


public class Son extends Father {
	
	void car() {
		System.out.println("Skoda-new");
	}

	public static void main(String[] args) {
		
		Son obj = new Son();
		obj.car();

	}

}
