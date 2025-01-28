//null-pointer exception:
//ArrayIndexOutOfBoundException

public class example2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		try {
//			String s = null;
//			System.out.println(s.length());
			System.out.println(a[5]);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Done");

	}

}
