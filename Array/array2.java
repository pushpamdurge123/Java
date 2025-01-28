//array:-type 2

public class array2 {

	public static void main(String[] args) {
		
		int num[][]= { {11,22,33,}, {44,55,66}};
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<(num.length+1);j++) {
				
				System.out.print(num[i][j]);
				
			}
			System.out.println("\n");
		}

	}

}
