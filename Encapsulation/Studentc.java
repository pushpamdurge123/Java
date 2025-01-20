//Encapsulation concept:-
//use getter and setter method

class StudentcDetails{
	
//1st way:-
	
//	private int a;
//
//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//	
	
//2nd way:-
	private int num;
	
	public void setNum(int num) {
		this.num = num;
		
	}
	
	public int getNum() {
		return num;
	}
	
	
}

public class Studentc {

	public static void main(String[] args) {
			
		StudentcDetails stu = new StudentcDetails();
		stu.setNum(20);
		
		System.out.println(stu.getNum());
		
//		stu.setA(10);
//		int a = stu.getA();
//		System.out.println(a);
	}

}
