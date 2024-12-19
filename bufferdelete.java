
public class bufferdelete {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Hello");
		
		buffer.delete(0, 4);
		
		System.out.println(buffer);

	}

}
