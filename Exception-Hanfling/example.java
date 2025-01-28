//exception-handling:

public class example {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
			System.out.println("result:" +100/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");

	}

}
