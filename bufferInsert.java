
public class bufferInsert {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Hello");
		
		buffer.insert(5, " World");
		System.out.println(buffer);
	}

}
