package checkedExceptions;



import java.sql.DriverManager;

public class Practice3 {
	
	public static void main(String[] args) {
		
		//compile time:SQLException
		DriverManager.getConnection("");
	}

}
