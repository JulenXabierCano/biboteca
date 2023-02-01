package objects;

public class Menu {

	public static final String GESTIONAR_LIBROS = "1";
	public static final String GESTIONAR_SOCIOS = "2";
	public static final String GESTIONAR_PRESTAMOS = "3";

	public static final String INSERTAR_LIBRO = "1";
	public static final String ELIMINAR_LIBRO = "2";
	public static final String MODIFICAR_LIBRO = "3";
	public static final String MOSTRAR_LIBRO = "4";
	public static final String MOSTRAR_LIBROS = "5";

	public static final String VER_SOCIOS = "1";

	public static final String SALIR = "0";
	public static final String VOLVER = "0";

	public static String menuPrincipal() {
		return "Menu principar:\n" + "1. Gestionar libros\n" + "2. Gestionar socios\n" + "0. Salir";
	}

	public static String menuLibros() {
		return "Administrar libros:\n" + "1. Insertar libro\n" + "2. Eliminar libro\n" + "3. Modificar libro\n"
				+ "4. Buscar libro\n" + "5. Mostrar todos los libros\n" + "0. Volver";
	}

	public static String menuSocios() {
		return "Administrar socios\n" + "1. Ver lista de socios\n" + "0. Volver";
	}

//	public static String menuPrestamos() {
//		return "Administrar prestamos:\n" + "1. Crear nuevo prestamo";
//	}
}
