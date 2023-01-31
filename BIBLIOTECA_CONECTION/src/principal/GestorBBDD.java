package principal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objects.*;

public class GestorBBDD extends Conector {
	Libro libro = new Libro();
	Socio socio = new Socio();

	public void insertarLibro(Libro libro) throws SQLException {
		PreparedStatement insertar = cn
				.prepareStatement("insert into libros " + "(autor,titulo,num_pag)" + " values (?,?,?)");
		insertar.setString(1, libro.getAutor());
		insertar.setString(2, libro.getTitulo());
		insertar.setInt(3, libro.getNum_pag());
		insertar.execute();
	}

	public void eliminarLibro(int id) throws SQLException {
		PreparedStatement eliminar = cn.prepareStatement("DELETE FROM libros WHERE id = ?");
		eliminar.setInt(1, id);
		eliminar.execute();
	}

	public void modificarLibro(int id) throws SQLException {
		Libro libro = FormulariosDatos.insertarDatosLibro();
		PreparedStatement actualizar = cn.prepareStatement("UPDATE libros SET ? = ? where id = ?");
		actualizar.setInt(3, id);
		
		actualizar.setString(1, "autor");
		actualizar.setString(2, libro.getAutor());
		actualizar.executeUpdate();
		
		actualizar.setString(1, "titulo");
		actualizar.setString(2, libro.getTitulo());
		actualizar.executeUpdate();
		
		actualizar.setString(1, "num_pag");
		actualizar.setInt(2, libro.getNum_pag());
		actualizar.executeUpdate();
	}

	public void insertarSocio(Socio socio) throws SQLException {
		PreparedStatement insertar = cn.prepareStatement("insert into socios "
				+ "(nombre,apellido,direccion,poblacion,provincia, dni)" + " values (?,?,?,?,?,?)");
		insertar.setString(1, socio.getNombre());
		insertar.setString(2, socio.getApellido());
		insertar.setString(3, socio.getDireccion());
		insertar.setString(4, socio.getPoblacion());
		insertar.setString(5, socio.getProcincia());
		insertar.setString(6, socio.getDni());
		insertar.execute();
	}

	public void eliminarSocio(int id) throws SQLException {
		PreparedStatement eliminar = cn.prepareStatement("DELETE FROM socios WHERE id = ?");
		eliminar.setInt(1, id);
		eliminar.execute();
	}

	public void modificarSocio(int id) {

	}
}