package site.kevinkling.crisalis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {

	@Id
	@Column(name = "id_servicio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre", nullable=false, length=60)
	private String nombre;

	@Column(name = "descripcion", nullable=true, length=120)
	private String descripcion;

	@Column(name = "costo_mensual")
	private float costoMensual; // Calculado

	@Column(name = "costo_base", nullable=false)
	private float costoBase;

//	@Column (name = "vencimiento")
//	@Temporal(TemporalType.DATE)
//	private Date vencimiento;

	@Column(name = "soporte")
	private boolean incluyeSoporte;

	public Servicio(int id, String nombre, String descripcion,  float costoBase,
			boolean incluyeSoporte) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costoBase = costoBase;
		this.incluyeSoporte = incluyeSoporte;
		this.costoMensual = this.calcularCostoMensual(costoBase);
	}
	private float calcularCostoMensual(float costoBase) {
		return (float) (this.costoBase * 0.21);
	}
	
	public Servicio() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCostoMensual() {
		return costoMensual;
	}

	public void setCostoMensual(float costoMensual) {
		this.costoMensual = costoMensual;
	}

	public float getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(float costoBase) {
		this.costoBase = costoBase;
	}

//	public Date getVencimiento() {
//		return vencimiento;
//	}
//
//	public void setVencimiento(Date vencimiento) {
//		this.vencimiento = vencimiento;
//	}

	public boolean isIncluyeSoporte() {
		return incluyeSoporte;
	}

	public void setIncluyeSoporte(boolean incluyeSoporte) {
		this.incluyeSoporte = incluyeSoporte;
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

	@Override
	public String toString() {
		return "Servicio [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", costoMensual="
				+ costoMensual + ", costoBase=" + costoBase + ", incluyeSoporte=" + incluyeSoporte + "]";
	}
	
	

}
