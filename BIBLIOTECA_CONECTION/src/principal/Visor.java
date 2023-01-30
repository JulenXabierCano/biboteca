package principal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import objects.Libro;

public class Visor {
	public static void mostrarLibros(ArrayList<Libro> libros) {
		String lista="Libros disponibles:\n";
		for (int i = 0; i < libros.size(); i++) {
			lista += libros.get(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, lista);
	}
	
	public static void mostrarLibro(Libro libro) {
		JOptionPane.showMessageDialog(null, libro);
	}
	
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
