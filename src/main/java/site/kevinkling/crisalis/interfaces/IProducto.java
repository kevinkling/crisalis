package site.kevinkling.crisalis.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import site.kevinkling.crisalis.models.Producto;

@Repository
public interface IProducto extends CrudRepository <Producto, Integer> {
}