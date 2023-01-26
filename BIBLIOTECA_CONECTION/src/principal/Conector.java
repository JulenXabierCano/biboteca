package principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conector {
	protected Connection cn;
	
	public Conector() {
		try {
			Class.forName("com.mysql.jbdc.Driver");
			String url = "jbdc:mysql://localhost/biblioteca";
			cn=(Connection) DriverManager.getConnection(url,"root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
