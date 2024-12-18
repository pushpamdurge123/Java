
public class stringname {

	public static void main(String[] args) {
		
		String name = "I am ram";
		
		String name1 = "I am ram";
		
		String name2 = new String("I am ram");
		
		System.out.println(name.equals(name2));//string checking using "equals method
		System.out.println(name == name2);//address checking "==" goes to heap memory due to object.

	}

}
