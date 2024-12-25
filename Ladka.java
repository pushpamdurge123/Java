//single inheritance:- parent-child relationship

class Papa{
	
	void business() {
		System.out.println("I have business.");
	}
}


public class Ladka extends Papa {

	void band() {
		System.out.println("I play guitar.");
	}
	
	public static void main(String[] args) {
		
		Ladka obj = new Ladka();
		obj.band();
		obj.business();

	}

}
