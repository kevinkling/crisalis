package site.kevinkling.crisalis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "personas")
public class Persona {
	
	@Id
	@Column(name = "id_persona")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "dni", nullable=false, length=30)
	private int DNI;
	
	@Column(name = "nombre", nullable=false, length=30)
	private String nombre;
	
	@Column(name = "apellido", nullable=false, length=30)	
	private String apellido;

	public Persona() {
		super();
	}

	public Persona(int id, int dNI, String nombre, String apellido) {
		super();
		this.id = id;
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
