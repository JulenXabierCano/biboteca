package principal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objects.*;

public class GestorBBDD extends Conector {
	Libro libro = new Libro();
	Socio socio = new Socio();

	public static void insertarLibro(Libro libro) throws SQLException {
		PreparedStatement insertar = cn
				.prepareStatement("insert into libros " + "(autor,titulo,num_pag)" + " values (?,?,?)");
		insertar.setString(1, libro.getAutor());
		insertar.setString(2, libro.getTitulo());
		insertar.setInt(3, libro.getNum_pag());
		insertar.execute();
	}

	public static void eliminarLibro(int id) throws SQLException {
		PreparedStatement eliminar = cn.prepareStatement("DELETE FROM libros WHERE id = ?");
		eliminar.setInt(1, id);
		eliminar.execute();
	}

	public static void modificarLibro(int id) throws SQLException {
		PreparedStatement actualizar = cn.prepareStatement("UPDATE libros SET ? = ? where id = ?");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
				"¿Que valor quiere cambiar?\n" + "1. Autor\n" + "2. Titulo\n" + "3. Numero Páginas"));
		actualizar.setInt(3, id);
		switch (opcion) {
		case 1:// cambiar autor
			actualizar.setString(1, "autor");
			actualizar.setString(2, Visor.mostrarMensaje(""));
			actualizar.executeUpdate();
			break;

		case 2:// cambiar titulo
			actualizar.setString(1, "titulo");
			actualizar.setString(2, JOptionPane.showInputDialog(null, "Introduzca nuevo titulo de libro"));
			actualizar.executeUpdate();
			break;

		case 3:// cambiar numero de páginas
			actualizar.setString(1, "num_pag");
			actualizar.setInt(1,
					Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca nuevo numero de paginas")));
			actualizar.executeUpdate();
			break;

		default:
			break;
		}
	}

	public static void insertarSocio(Socio socio) throws SQLException {
		PreparedStatement insertar = cn.prepareStatement("insert into socios "
				+ "(nombre,apellido,direccion,poblacion,provincia, dni)" + " values (?,?,?,?,?,?)");
		insertar.setString(1, JOptionPane.showInputDialog(null, "Inserte nombre de socio"));
		insertar.setString(2, JOptionPane.showInputDialog(null, "Inserte apellido de socio"));
		insertar.setString(3, JOptionPane.showInputDialog(null, "Inserte direccion de socio"));
		insertar.setString(4, JOptionPane.showInputDialog(null, "Inserte poblacion de socio"));
		insertar.setString(5, JOptionPane.showInputDialog(null, "Inserte provincia de socio"));
		insertar.setString(6, JOptionPane.showInputDialog(null, "Inserte dni de socio"));
		insertar.execute();
	}

	public static void eliminarSocio(int id) {

	}

	public static void modificarSocio(int id) {

	}
}