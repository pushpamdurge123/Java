/*throws keyword:- throws keyword is used for compile 
 * time exception but for handle the Exception we have to use
 * "try-catch block only"*/

import java.io.File;
import java.io.IOException;

public class example6 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("F://");
		
		file.createNewFile();

	}

}
