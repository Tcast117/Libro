package Libro;

import javax.swing.*;
import java.util.ArrayList;

public class libro {
	private int isbn, nPaginas;
	private String titulo, autor, categoria;

	public libro() {
		this.isbn = isbn;
		this.nPaginas = nPaginas;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
	}

	public libro(int isbn, String titulo, String autor, int nPaginas,  String categoria) {
		this.isbn = isbn;
		this.nPaginas = nPaginas;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ArrayList<libro> agregarLibro(){
		ArrayList<libro> myBook = new ArrayList<>();
		int isbn, nPaginas;
		String titulo, autor, categoria;
		isbn = Integer.parseInt(JOptionPane.showInputDialog("Inserte el ISBN del libro"));
		titulo = JOptionPane.showInputDialog("Inserte el titulo del libro");
		autor = JOptionPane.showInputDialog("Inserte el autor");
		nPaginas = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero de paginas"));
		categoria = JOptionPane.showInputDialog("Inserte el la categoria");
		myBook.add(new libro(isbn, titulo, autor, nPaginas, categoria));
		return myBook;
	}

	@Override
	public String toString() {
		return "libro{" +
				"isbn=" + isbn +
				", nPaginas=" + nPaginas +
				", categoria=" + categoria +
				", titulo='" + titulo + '\'' +
				", autor='" + autor + '\'' +
				'}';
	}
}
