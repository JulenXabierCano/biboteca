package principal;

import javax.swing.JOptionPane;

import objects.Menu;

public class GestorBiblioteca {
	public void run() {
		final String OPCION_UNO = "1";
		final String OPCION_DOS = "2";
		final String OPCION_TRES ="3";
		final String SALIR = "0";
		String opcion_menu;
		do {
			opcion_menu = Menu.menuPrincipal();
			//fin menú
			switch (opcion_menu) {
			case :
				JOptionPane.showMessageDialog(null, "primera opcion seleccionada");
				break;
			case OPCION_DOS:
				JOptionPane.showMessageDialog(null, "segunda opcion seleccionada");
				break;
			case OPCION_TRES:
				JOptionPane.showMessageDialog(null, "tercera opcion seleccionada");
				break;
			case SALIR:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opcion_menu != SALIR);

	}
}
