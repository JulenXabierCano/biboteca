package principal;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import objects.*;

public class GestorBiblioteca {
	public void run() throws SQLException {
		GestorBBDD gestorBBDD = new GestorBBDD();
		String opcion_menu = JOptionPane.showInputDialog(null, Menu.menuPrincipal());
		do {
			switch (opcion_menu) {
			case Menu.GESTIONAR_LIBROS:
				String opcion_libros = JOptionPane.showInputDialog(null, Menu.menuLibros());
				switch(opcion_libros) {
				case Menu.INSERTAR_LIBRO:
					gestorBBDD.conectar();
					gestorBBDD.insertarLibro(FormulariosDatos.insertarDatosLibro());
					gestorBBDD.cerrar();
					break;
					
				case Menu.ELIMINAR_LIBRO:
					gestorBBDD.conectar();
					gestorBBDD.eliminarLibro(FormulariosDatos.insertarIdLibro());
					gestorBBDD.cerrar();
					break;
					
				case Menu.MODIFICAR_LIBRO:
					gestorBBDD.conectar();
					gestorBBDD.modificarLibro(FormulariosDatos.insertarIdLibro());
					gestorBBDD.cerrar();
					break;
				}
				break;
				
			case Menu.GESTIONAR_SOCIOS:
				String opcion_socios = JOptionPane.showInputDialog(null, Menu.menuSocios());
				switch(opcion_socios) {
				case Menu.VER_SOCIOS:
					gestorBBDD.conectar();
					//TODO mostrar socios
					gestorBBDD.cerrar();
					break;

				case Menu.AÑADIR_SOCIO:
					gestorBBDD.conectar();
					gestorBBDD.insertarSocio(FormulariosDatos.insertarDatosSocio());
					gestorBBDD.cerrar();
					break;
					
				case Menu.ELIMINAR_SOCIO:
					gestorBBDD.conectar();
					gestorBBDD.eliminarSocio(FormulariosDatos.insertarIdSocio());
					gestorBBDD.cerrar();
					break;
				}
				break;
				
			case Menu.SALIR:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opcion_menu != Menu.SALIR);

	}
}
