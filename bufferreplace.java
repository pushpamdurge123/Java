
public class bufferreplace {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Hello");
		
		buffer.replace(1,3, "World");
		
		System.out.println(buffer);
	}

}
