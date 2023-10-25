package practicelowlevel;

//Private constructor
//Singleton class

public class DBConnection {
	
	//private static DBConnection connObject = new DBConnection();
	
	private DBConnection() {
		System.out.println("Connection Object created");
	}
	
	public static DBConnection getInstance() {
		DBConnection connObject = new DBConnection();
		return connObject;
	}
}
