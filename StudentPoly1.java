//method over-loading


public class StudentPoly1 {
	
	void num() {
		System.out.println("result: none");
	}
	
	void num(int a) {
		System.out.println("result:" + a);
	}
	
	void num(int a, int b, int c) {
		System.out.println("result:" + a + b + c);
	}
	
	void num(int a, String b) {
		System.out.println("result:" + a + b);
	}
	
	void num(String b, int a) {
		System.out.println(b + a);
	}
	
	public static void main(String[] args) {
		
		StudentPoly1 stu = new StudentPoly1();
		stu.num(10,"A");

	}

}
