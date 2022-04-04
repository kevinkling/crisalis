package site.kevinkling.crisalis.interfacesServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import site.kevinkling.crisalis.models.Producto;

@Service
public interface IProductoService {
	public List<Producto> listarProductos();
	public Optional<Producto> listarProductoId(int id);
	public int guardarProducto (Producto p);
	public void eliminarProducto (int id);

}
