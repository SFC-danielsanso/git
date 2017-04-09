package sfc.aplicacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIBRO")
public class Libro {

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="AUTOR")
	private String autor;
	
	public Libro(){
		
	}

	public Libro(int id, String titulo, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
}
