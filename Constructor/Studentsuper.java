

class StudentData{
	
	void attendance() {
		System.out.println("All student Attendance.");
		
	}
	
}


public class Studentsuper extends StudentData {

	
	void attendance() {
		//super.attendance();
		//use of super keyword to call the parent instance 
		System.out.println("Section A: Attendance.");
	}
	
	void display() {
		super.attendance();
		attendance();
	}

	public static void main(String[] args) {
		
		Studentsuper obj = new Studentsuper();
		obj.display(); 
		
	}

}
