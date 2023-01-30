package principal;

public class Menu {
	public static String menuPrincipal() {
		String menu = "Menu principar:\n" + "1. Gestionar libros" + "2. Gestionar socios" + "3. Gestionar prestamos";
		return menu;
	}

	public static String menuLibros() {
		String libros = "Administrar libros:\n" + "1. Insertar libro" + "2. Eliminar libro" + "3. Ver libro";
		return libros;
	}

	public static String menuSocios() {
		String socios = "Administrar socios\n" + "1. Ver lista de socios";
		return socios;
	}

	public static String menuPrestamos() {
		String prestamos = "Administrar prestamos:\n" + "1. Crear nuevo prestamo";
		return prestamos;
	}
}
