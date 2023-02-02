package principal;

import javax.swing.JOptionPane;
import objects.*;

public class GestorBiblioteca {
	public void run(){
		GestorBBDD gestorBBDD = new GestorBBDD();
		String opcion_menu = "0";
		do {
			opcion_menu = JOptionPane.showInputDialog(null, Menu.menuPrincipal());
			
			switch (opcion_menu) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(gestorBBDD);
				break;

			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(gestorBBDD);
				break;
				
			case Menu.SALIR:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (!opcion_menu.equals(Menu.SALIR));

	}
}
