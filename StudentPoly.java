//method over-loading


public class StudentPoly {
	
	void subject() {
		System.out.println("Subject: All");
	}
	
	void subject(String sub) {
		System.out.println("Subject: " + sub);
	}
	
	void subject(String sub1,String sub2) {
		System.out.println("Subject: " + sub1 + sub2);
	}
	
	void subject(String sub1,String sub2,String sub3) {
		System.out.println("Subject: " + sub1 + sub2 + sub3);
	}

	public static void main(String[] args) {
		
		StudentPoly obj = new StudentPoly();
		//obj.subject("English");
		//obj.subject("English,"," Maths");
		obj.subject("English,"," Maths,"," Science");

	}

}
