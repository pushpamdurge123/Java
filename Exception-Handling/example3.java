//Handle multiple exception:
//multiple catch blocks:parent exception is in last

public class example3 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		
		
		try {
			a[6]=6/3;
			System.out.println(a[4]);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		System.out.println("All operations done");

	}

}
