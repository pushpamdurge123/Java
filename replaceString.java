
public class replaceString {

	public static void main(String[] args) {
		
		String a = "Hello World";
		String b = "Hello World Hello Hello";
		
		System.out.println(a.replace("World","Java"));
		System.out.println(b.replaceAll("Hello", "Java"));

	}

}
