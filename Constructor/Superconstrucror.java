//use of super keyword in constructor

class Parent{
	
	Parent(){
		System.out.println("Parent constructor...");
	}
}


public class Superconstrucror extends Parent {
	
	 Superconstrucror(){
		super();
		System.out.println("Child constructor...");
	}

	public static void main(String[] args) {
		
		new Superconstrucror();

	}

}
