package objects;

import javax.swing.JOptionPane;

import principal.GestorBBDD;

public class GestorSocios {
	public static void run(GestorBBDD gestorBBDD) {
		String opcion_socios = JOptionPane.showInputDialog(null, Menu.menuSocios());
		switch (opcion_socios) {
		case Menu.INSERTAR_SOCIO:
			gestorBBDD.conectar();
			gestorBBDD.insertarSocio(FormulariosDatos.insertarDatosSocio());
			gestorBBDD.cerrar();
			break;
			
		case Menu.ELIMINAR_SOCIO:
			gestorBBDD.conectar();
			gestorBBDD.eliminarSocio(FormulariosDatos.insertarIdSocio());
			gestorBBDD.cerrar();
			break;
			
		case Menu.MODIFICAR_SOCIO:
			gestorBBDD.conectar();
			gestorBBDD.modificarSocio(FormulariosDatos.insertarIdSocio());
			gestorBBDD.cerrar();
			break;
			
		case Menu.BUSCAR_SOCIO:
			gestorBBDD.conectar();
			gestorBBDD.buscarSocio(FormulariosDatos.insertarIdSocio());
			gestorBBDD.cerrar();
			break;
			
		case Menu.VER_SOCIOS:
			gestorBBDD.conectar();
			gestorBBDD.mostrarSocios();
			gestorBBDD.cerrar();
			break;
		}
	}
}
