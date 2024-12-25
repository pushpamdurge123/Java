//multilevel inheritance:-grandfather-father-child relationship

class Grandfather{
	void farm() {
		System.out.println("I have farm.");
	}
}


class Father extends Grandfather{
	
	void business() {
		System.out.println("I have business.");
	}
}

public class Ladka2 extends Father {
	
	void band() {
		System.out.println("I have guitar.");
	}

	public static void main(String[] args) {
		
		Ladka2 obj = new Ladka2();
		obj.band();
		obj.business();
		obj.farm();

	}

}
