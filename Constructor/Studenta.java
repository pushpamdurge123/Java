//use of this keyword in constructor

public class Studenta {
	
//	int rollno;
//	String name;
//	
//	Studenta(int rollno,String name) {
//		this.rollno = rollno;
//		this.name = name;
//	}
	void show() {
		System.out.println("Hello show");
	}
	
	void display() {
		this.show();
		System.out.println("Hello display");
		//System.out.println("Roll no.:-" + rollno + " Name:-" + name);
	}

	public static void main(String[] args) {
		
		//Studenta obj = new Studenta(25, "ram");
		Studenta obj = new Studenta();
		obj.display();
	

	}

}
