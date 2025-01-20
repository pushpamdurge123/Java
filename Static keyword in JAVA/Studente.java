
//use of static keyword:-

class StudentDetailse{
	
	String name;
	int rollno;
	static String college="KDK";
	
	StudentDetailse(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	void display() {
		System.out.println("Name= " + name + " Roll no.= " + rollno + " College= " + college);
	}
}

public class Studente {

	public static void main(String[] args) {
		StudentDetailse sd = new StudentDetailse("Pushpam", 67);
		StudentDetailse sd1 = new StudentDetailse("Ram", 27);
		StudentDetailse sd2 = new StudentDetailse("Dhiraj", 67);
		sd.display();
		sd1.display();
		sd2.display();

	}

}
