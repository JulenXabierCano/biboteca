package objects;

import javax.swing.JOptionPane;

import principal.GestorBBDD;

public class GestorLibros {
	public static void run(GestorBBDD gestorBBDD) {
		String opcion_libros = JOptionPane.showInputDialog(null, Menu.menuLibros());
		switch (opcion_libros) {
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

		case Menu.MOSTRAR_LIBRO:
			gestorBBDD.conectar();
			gestorBBDD.buscarLibro(FormulariosDatos.insertarIdLibro());
			break;

		case Menu.MOSTRAR_LIBROS:
			gestorBBDD.conectar();
			gestorBBDD.mostrarLibros();
			gestorBBDD.cerrar();
			break;
		case Menu.VOLVER:
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion incorrecta");
		}
	}
}
