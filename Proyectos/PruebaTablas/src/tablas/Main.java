package tablas;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Prueba de tablas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		Panel panel = new Panel();
		List<Libro> listaLibros = new ArrayList<>();
		listaLibros.add(new Libro(1, "Harry Popoter", "JK"));
		listaLibros.add(new Libro(2, "Los tru�os del hambre", "otro"));
		panel.addRows(listaLibros);
		frame.add(panel);

		frame.setVisible(true);

	}

}
