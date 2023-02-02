package objects;

public class Menu {

	public static final String GESTIONAR_LIBROS = "1";
	public static final String GESTIONAR_SOCIOS = "2";

	public static final String INSERTAR_LIBRO = "1";
	public static final String ELIMINAR_LIBRO = "2";
	public static final String MODIFICAR_LIBRO = "3";
	public static final String MOSTRAR_LIBRO = "4";
	public static final String MOSTRAR_LIBROS = "5";

	public static final String INSERTAR_SOCIO = "1";
	public static final String ELIMINAR_SOCIO = "2";
	public static final String MODIFICAR_SOCIO = "3";
	public static final String BUSCAR_SOCIO = "4";
	public static final String VER_SOCIOS = "5";

	public static final String SALIR = "0";
	public static final String VOLVER = "0";

	public static String menuPrincipal() {
		return "Menu principar:\n" + GESTIONAR_LIBROS + ". Gestionar libros\n" + GESTIONAR_SOCIOS
				+ ". Gestionar socios\n" + SALIR + ". Salir";
	}

	public static String menuLibros() {
		return "Administrar libros:\n" + INSERTAR_LIBRO + ". Insertar libro\n" + ELIMINAR_LIBRO + ". Eliminar libro\n"
				+ MODIFICAR_LIBRO + ". Modificar libro\n" + MOSTRAR_LIBRO + ". Buscar libro\n" + MOSTRAR_LIBROS
				+ ". Mostrar todos los libros\n" + VOLVER + ". Volver";
	}

	public static String menuSocios() {
		return "Administrar socios\n" + INSERTAR_SOCIO + ". Insertar socio\n" + ELIMINAR_SOCIO + ". Eliminar socio\n"
				+ MODIFICAR_SOCIO + ". Modificar socio\n" + BUSCAR_SOCIO + ". Buscar socio\n" + VER_SOCIOS
				+ ". Mostrar todos los socios\n" + "0. Volver";
	}
}
