//inheritance

class Studentdetails{
	int rollno = 67;
	
	void subjects() {
		System.out.println("Subject Details");
	}
}


public class Student extends Studentdetails {

	public static void main(String[] args) {

		Student stu = new Student();
		System.out.println(stu.rollno);
		stu.subjects();

	}

}
