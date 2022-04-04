package site.kevinkling.crisalis.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table (name = "vetnas")
public class Ventas {

	private int id_venta;
	
	private int id_cliente;
	
	private List<Producto> productos;
	
	private List<Servicio> servicios;
	
	private float total;
	
}
