package checkedExceptions;


import java.io.FileReader;

public class Practice2 {
	
	public static void main(String[] args) {
		//compiletime :  FileNotFoundException
		FileReader file= new FileReader("C://test//user.txt");
		
	}

}
