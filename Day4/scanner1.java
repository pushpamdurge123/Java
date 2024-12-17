package Day4;

public class scanner1 {
	
	int ram(int a) {
		return a + a;
	}
	
	String name() {
		return "Ram";
	}
	String name1(String myname) {
		return myname;
	}
	float decimal( float d) {
		return d;
	}
	

	public static void main(String[] args) {
		
		scanner1 ramesh = new scanner1();
		int b = ramesh.ram(10);
		String c = ramesh.name();
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(ramesh.name());
		System.out.println(ramesh.name1("pushpam"));
		System.out.println(ramesh.decimal(20));
	}

}
