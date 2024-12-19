
public class internToPoolMemory {

	public static void main(String[] args) {
		
		String a = "Hello World";
		
		String b = new String("Hello World");
		
		String c = b.intern();
		
		System.out.println(a==c);

	}

}
