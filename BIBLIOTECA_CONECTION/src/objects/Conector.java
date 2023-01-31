package objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	protected Connection cn;

	public void conectar() {
		try {
			Class.forName("com.mysql.jbdc.Driver");
			String url = "jbdc:mysql://localhost/biblioteca";
			cn = (Connection) DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cerrar() {
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getCn() {
		return cn;
	}

	public void setCn(Connection cn) {
		new Conector().cn = cn;
	}
	
	
}
