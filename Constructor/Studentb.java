
public class Studentb {
	
	Studentb() {
		System.out.println("Constructor...");
	}
	
	Studentb(int a) {
		this(10,20);
		System.out.println("Constructor..." + a);
	}
	
	Studentb(int a,int b) {
		this();
		System.out.println("Constructor..." + a + b);
	}
	public static void main(String[] args) {
		
		new Studentb(10);
		

	}

}
