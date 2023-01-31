package objects;

public class Menu {
	
	public static final String GESTIONAR_LIBROS = "1";
	public static final String GESTIONAR_SOCIOS = "2";
	public static final String GESTIONAR_PRESTAMOS = "3";
	
	public static final String INSERTAR_LIBRO = "1";
	public static final String ELIMINAR_LIBRO = "2";
	public static final String MOSTRAR_LIBRO = "3";
	
	public static final String VER_SOCIOS = "1";
	public static final String AÑADIR_SOCIO = "2";
	public static final String ELIMINAR_SOCIO = "3";
	
	public static final String SALIR = "0";
	
	
	public static void menuPrincipal() {
		Visor.mostrarMensaje("Menu principar:\n" + "1. Gestionar libros\n" + "2. Gestionar socios\n" + "3. Gestionar prestamos\n");
	}

	public static void menuLibros() {
		Visor.mostrarMensaje("Administrar libros:\n" + "1. Insertar libro\n" + "2. Eliminar libro\n" + "3. Ver libro\n");
	}

	public static void menuSocios() {
		Visor.mostrarMensaje("Administrar socios\n" + "1. Ver lista de socios" + "2. Añadir socio" + "3. Eliminar socio");
	}

	public static void menuPrestamos() {
		Visor.mostrarMensaje("Administrar prestamos:\n" + "1. Crear nuevo prestamo");
	}
}
