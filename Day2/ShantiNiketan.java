package Day2;

public class ShantiNiketan {

	public static void main(String[] args) {
		
		VidyaNiketan myobj = new VidyaNiketan();
		myobj.kit();
		myobj.bed();
		
		ShantiNiketan myobj1 = new ShantiNiketan();
		myobj1.hello();
		myobj1.hi();
		myobj1.bye();

	}
	
	void hello() {
		System.out.println("Hello");
	}
	void hi() {
		System.out.println("Hi");
	}
	void bye() {
		System.out.println("Bye");
	}

}
class VidyaNiketan {
	
		void kit() {
			System.out.println("I have sugar.");
		}
		
		void bed() {
			System.out.println("Bed");
		}
	
}
