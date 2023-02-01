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
		PreparedStatement actualizar = cn.prepareStatement("UPDATE libros SET autor=?, titulo=?, num_pag=? where id=?");

		actualizar.setString(1, libro.getAutor());
		actualizar.setString(2, libro.getTitulo());
		actualizar.setInt(3, libro.getNum_pag());
		actualizar.setInt(4, id);
		actualizar.execute();
	}

	public void buscarLibro(int id) throws SQLException {
		String libros = "----- Libro: -----\n";
		PreparedStatement buscar = cn.prepareStatement("SELECT * FROM libros where id=?");
		buscar.setInt(1, id);
		ResultSet resultado = buscar.executeQuery();
		while (resultado.next()) {
			libros += resultado.getInt(1) + " | Autor: " + resultado.getString(3) + " | Titulo:"
					+ resultado.getString(2) + " | Numero de páginas: " + resultado.getInt(4) + "\n\n";
		}
		JOptionPane.showMessageDialog(null, libros);
	}

	public void mostrarLibros() throws SQLException {
		String libros = "----- Libros -----\n";
		String sentenciaSelect = "SELECT * FROM libros";
		Statement st = cn.createStatement();
		ResultSet resultado = st.executeQuery(sentenciaSelect);

		while (resultado.next()) {
			libros += resultado.getInt(1) + " | Autor: " + resultado.getString(3) + " | Titulo:"
					+ resultado.getString(2) + " | Numero de páginas: " + resultado.getInt(4) + "\n\n";
		}
		JOptionPane.showMessageDialog(null, libros);
	}

	public void mostrarSocios() throws SQLException {
		String socios = "----- socios -----\n\n";
		String sentenciaSelect = "SELECT * FROM socios";
		Statement st = cn.createStatement();
		ResultSet resultado = st.executeQuery(sentenciaSelect);

		while (resultado.next()) {
			socios += resultado.getInt(1) + ", " + resultado.getString(2) + ", " + resultado.getString(3) + ", "
					+ resultado.getString(4) + ", " + resultado.getString(5) + ", " + resultado.getString(6) + ", "
					+ resultado.getString(7) + "\n\n";
		}
		JOptionPane.showMessageDialog(null, socios);
	}
}