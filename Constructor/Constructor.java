//Constructor Overloading

public class Constructor {
	
	Constructor(){
		System.out.println("Constructor..");
	}
	
	Constructor(int a){
		System.out.println("Constructor..");
	}
	
	Constructor(int a,int b){
		System.out.println("Constructor..");
	}
	
	Constructor(int a,String b){
		System.out.println("Constructor..");
	}
	
	Constructor(String a,int b){
		System.out.println("Constructor..");
	}

	public static void main(String[] args) {
		
		new Constructor();

	}

}
