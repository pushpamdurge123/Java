
/*Garbage collection:- 
 * Garbage collection (GC) in Java is a process
 * that automatically removes unused code and 
 * objects from a program. This frees up memory space,
 * making it easier for developers to write code. */



/*Finalize() Method:-The finalize() method in Java is 
 * a protected method that allows an object to perform 
 * cleanup operations before it is destroyed by the 
 * garbage collector.*/ 




public class example1gc {
	
		void display() {
			System.out.println("Hello");
		}
	
	
		protected void finalize() {
			
			System.out.println("Finalize method called.");
		}

	public static void main(String[] args) {
		
		example1gc obj = new example1gc();
		obj.display();
		
		example1gc obj1 = new example1gc();
		obj1=null;
		System.gc();
		
		

	}

}
