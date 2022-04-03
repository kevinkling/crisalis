package site.kevinkling.crisalis.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import site.kevinkling.crisalis.models.Servicio;

@Repository
public interface IServicio extends CrudRepository<Servicio, Integer>{
	
}
