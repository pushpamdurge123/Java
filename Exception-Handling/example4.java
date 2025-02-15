//Finally block:-

public class example4 {

	public static void main(String[] args) {
		
		try {
			int a=10/0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//finally block cannot handle exception only run the important code 
		//without catch block handle the exception is not possible
		finally {
			System.out.println("closing...");
		}
		System.out.println("rest code");

	}

}
