package Libro;

import javax.swing.*;
import java.util.ArrayList;

public class ejecutable {
	public static void main(String[] args) {

		int menu;
		int aux =0;


		libro addBook = new libro();

		int isbn, nPaginas;
		String titulo, autor, categoria = null;
		ArrayList<libro> myBooks = new ArrayList<libro>();

		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Inserte que desea hacer\n" +
					"1. Agregar libro.\n" +
					"2. Imprimir.\n" +
					"3. Salir."));
			switch (menu) {
				case 1:
					ArrayList<libro> agLibro = new libro().agregarLibro();

					break;

				case 2:
					libro iBook = new libro();
					System.out.println(iBook.toString());
					break;

				case 3:
					break;

			}


		} while (menu!=3);

	}
}
