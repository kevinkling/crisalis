package site.kevinkling.crisalis.services;

import java.sql.Types;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import site.kevinkling.crisalis.interfaces.IProducto;
import site.kevinkling.crisalis.interfacesServices.IProductoService;
import site.kevinkling.crisalis.models.Producto;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto iProducto;

	@Override
	public List<Producto> listarProductos() {
		return (List<Producto>) iProducto.findAll();
	}

	@Override
	public Optional<Producto> listarProductoId(int id) {
		return iProducto.findById(id);
	}

	

	@Override
	public int guardarProducto(Producto p) {
		int res = 0;
		iProducto.save(p);
		res = 1;
		return res;
	}

	@Autowired
	JdbcTemplate jdbcT = new JdbcTemplate();

	@Override
	public void eliminarProducto(int id) {
		SimpleJdbcCall delete = new SimpleJdbcCall(jdbcT).withProcedureName("producto_delete")
				.declareParameters(new SqlParameter("id_producto", Types.INTEGER));

		delete.execute(id);
	}
}
