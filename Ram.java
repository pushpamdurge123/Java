//hierarchical inheritance:-one parent and multiple child.

class Dad{
	
	void business() {
		System.out.println("I have business.");
	}
}


class Shaam extends Dad{
	
	void job() {
		System.out.println("I have job.");
	}
}

public class Ram extends Dad {
	
	void band() {
		System.out.println("I have guitar.");
	}

	public static void main(String[] args) {
		
		Ram obj = new Ram();
		obj.band();
		obj.business();
		
		Shaam obj2 = new Shaam();
		obj2.job();
		obj2.business();
		

	}

}
