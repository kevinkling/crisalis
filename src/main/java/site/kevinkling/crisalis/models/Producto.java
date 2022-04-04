package site.kevinkling.crisalis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@Column(name = "id_producto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;

	@Column(name = "precio_base", nullable = false)
	private float precioBase; // Sin impuestos

	@Column(name = "precio_final", nullable = false)
	private float precioFinal;

//	@Column(name = "anios_garantia", nullable = true)
//	private int aniosGarantia;
	
	@Column (name = "stock")
	private int stock;

	public Producto() {
	}
	
	public Producto(int id, String nombre, String descripcion, float precioBase, float precioFinal, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioBase = precioBase;
		this.precioFinal = precioFinal;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

//	public int getAniosGarantia() {
//		return aniosGarantia;
//	}
//
//	public void setAniosGarantia(int aniosGarantia) {
//		this.aniosGarantia = aniosGarantia;
//	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioBase="
				+ precioBase + ", precioFinal=" + precioFinal + ", aniosGarantia=" + ", stock=" + stock
				+ "]";
	}
}
