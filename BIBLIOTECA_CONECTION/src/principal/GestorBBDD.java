package principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import objects.*;

public class GestorBBDD extends Conector {
	Libro libro = new Libro();
	Socio socio = new Socio();

	public void insertarLibro(Libro libro){
		PreparedStatement insertar;
		try {
			insertar = cn
					.prepareStatement("insert into libros " + "(autor,titulo,num_pag)" + " values (?,?,?)");
			insertar.setString(1, libro.getAutor());
			insertar.setString(2, libro.getTitulo());
			insertar.setInt(3, libro.getNum_pag());
			insertar.execute();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al insertar el libro");
		}
	}

	public void eliminarLibro(int id){
		PreparedStatement eliminar;
		try {
			eliminar = cn.prepareStatement("DELETE FROM libros WHERE id = ?");
			eliminar.setInt(1, id);
			eliminar.execute();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al eliminar el libro");
		}
	}

	public void modificarLibro(int id){
		Libro libro = FormulariosDatos.insertarDatosLibro();
		PreparedStatement actualizar;
		try {
			actualizar = cn.prepareStatement("UPDATE libros SET autor=?, titulo=?, num_pag=? where id=?");
			actualizar.setString(1, libro.getAutor());
			actualizar.setString(2, libro.getTitulo());
			actualizar.setInt(3, libro.getNum_pag());
			actualizar.setInt(4, id);
			actualizar.execute();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al modificar un libro");
		}

	}

	public void buscarLibro(int id){
		String libros = "----- Libro: -----\n";
		PreparedStatement buscar;
		try {
			buscar = cn.prepareStatement("SELECT * FROM libros where id=?");
			buscar.setInt(1, id);
			ResultSet resultado = buscar.executeQuery();
			while (resultado.next()) {
				libros += resultado.getInt(1) + " | Autor: " + resultado.getString(3) + " | Titulo:"
						+ resultado.getString(2) + " | Numero de páginas: " + resultado.getInt(4) + "\n\n";
			}
			JOptionPane.showMessageDialog(null, libros);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al buscar un libro");
		}
	}

	public void mostrarLibros(){
		String libros = "----- Libros -----\n";
		String sentenciaSelect = "SELECT * FROM libros";
		Statement st;
		try {
			st = cn.createStatement();
			ResultSet resultado = st.executeQuery(sentenciaSelect);
			
			while (resultado.next()) {
				libros += resultado.getInt(1) + " | Autor: " + resultado.getString(3) + " | Titulo:"
						+ resultado.getString(2) + " | Numero de páginas: " + resultado.getInt(4) + "\n\n";
			}
			JOptionPane.showMessageDialog(null, libros);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al mostrar libros");
		}
	}

	public void insertarSocio(Socio socio){
		PreparedStatement insertar;
		try {
			insertar = cn.prepareStatement("insert into socios "
					+ "(nombre,apellido,direccion,poblacion,provincia,dni)" + " values (?,?,?,?,?,?)");
			insertar.setString(1, socio.getNombre());
			insertar.setString(2, socio.getApellido());
			insertar.setString(3, socio.getDireccion());
			insertar.setString(4, socio.getPoblacion());
			insertar.setString(5, socio.getProcincia());
			insertar.setString(6, socio.getDni());
			insertar.execute();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al insertar un socio");
		}
	}

	public void mostrarSocios(){
		String socios = "----- socios -----\n\n";
		String sentenciaSelect = "SELECT * FROM socios";
		Statement st;
		try {
			st = cn.createStatement();
			ResultSet resultado = st.executeQuery(sentenciaSelect);
			
			while (resultado.next()) {
				socios += resultado.getInt(1) + " - " + resultado.getString(2) + ", " + resultado.getString(3) + ", "
						+ resultado.getString(4) + ", " + resultado.getString(5) + ", " + resultado.getString(6) + ", "
						+ resultado.getString(7) + "\n\n";
			}
			JOptionPane.showMessageDialog(null, socios);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al mostrar socios");
		}
	}

	public void eliminarSocio(int id){
		PreparedStatement eliminar;
		try {
			eliminar = cn.prepareStatement("DELETE FROM socios WHERE id = ?");
			eliminar.setInt(1, id);
			eliminar.execute();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al eliminar el socio");
		}
	}

	public void modificarSocio(int id){
		Socio socio = FormulariosDatos.insertarDatosSocio();
		PreparedStatement actualizar;
		try {
			actualizar = cn.prepareStatement(
					"UPDATE socios SET nombre=?, apellido=?, direccion=?, poblacion=?, provincia=? where id=?");
			actualizar.setString(1, socio.getNombre());
			actualizar.setString(2, socio.getApellido());
			actualizar.setString(3, socio.getDireccion());
			actualizar.setString(4, socio.getPoblacion());
			actualizar.setString(5, socio.getProcincia());
			actualizar.setInt(6, id);
			actualizar.execute();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al modificar un socio");
		}
	}

	public void buscarSocio(int id){
		String socio = "----- Socio: -----\n";
		PreparedStatement buscar;
		try {
			buscar = cn.prepareStatement("SELECT * FROM socios where id=?");
			buscar.setInt(1, id);
			ResultSet resultado = buscar.executeQuery();
			while (resultado.next()) {
				socio += resultado.getInt(1) + " - " + resultado.getString(2) + ", " + resultado.getString(3) + ", "
						+ resultado.getString(4) + ", " + resultado.getString(5) + ", " + resultado.getString(6) + ", "
						+ resultado.getString(7) + "\n\n";
			}
			JOptionPane.showMessageDialog(null, socio);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al buscar un socio");
		}
	}
}