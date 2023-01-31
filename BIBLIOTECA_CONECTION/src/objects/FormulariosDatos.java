package objects;

import javax.swing.JOptionPane;

public class FormulariosDatos {
	public static Libro insertarDatosLibro() {
		Libro libro = new Libro();
		libro.setAutor(JOptionPane.showInputDialog(null, "Introduzca autor del libro"));
		libro.setTitulo(JOptionPane.showInputDialog(null, "Introduzca titulo del libro"));
		libro.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca numero de páginas del libro")));
		return libro;
	}

	public static int insertarIdLibro() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca ID de libro"));
	}

	public static Socio insertarDatosSocio() {
		Socio socio = new Socio();
		socio.setDni(JOptionPane.showInputDialog(null, "Introduzca DNI del socio"));
		socio.setNombre(JOptionPane.showInputDialog(null, "Introduzca nombre del socio"));
		socio.setApellido(JOptionPane.showInputDialog(null, "Introduzca apellido del socio"));
		socio.setDireccion(JOptionPane.showInputDialog(null, "Introduzca direccion del socio"));
		socio.setPoblacion(JOptionPane.showInputDialog(null, "Introduzca poblacion del socio"));
		socio.setProcincia(JOptionPane.showInputDialog(null, "Introduzca provincia del socio"));
		return socio;
	}
	public static int insertarIdSocio() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca ID de socio"));
	}
}
