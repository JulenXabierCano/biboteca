package principal;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import objects.Menu;

public class GestorSocios {
	public static void run() throws SQLException {
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, Menu.menuSocios()));

		switch (opcion) {
		case 1:// ver socios
			break;

		case 2:// añadir socio
			GestorBBDD.insertarSocio(null);
			break;

		case 3:// eliminar socios
			break;
		}
	}
}
