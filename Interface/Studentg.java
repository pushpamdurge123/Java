//interface

interface Bank{
	
	float interest();
	
}
class Pnb implements Bank{

	
	public float interest() {
		
		return 7.5f;
	}
	
}

class Icici implements Bank{

	
	public float interest() {
		
		return 9.5f;
	}
	
}

class Sbi implements Bank{

	
	public float interest() {
		
		return 9.0f;
	}
	
}


public class Studentg {

	public static void main(String[] args) {
		
		Bank roi;
		roi = new Pnb();
		System.out.println("Pnb Roi: "+roi.interest());
		roi = new Icici();
		System.out.println("Icici Roi: "+roi.interest());
		roi = new Sbi();
		System.out.println("Sbi Roi: "+roi.interest());

	}

}
