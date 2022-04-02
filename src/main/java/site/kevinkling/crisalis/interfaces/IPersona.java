package site.kevinkling.crisalis.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import site.kevinkling.crisalis.models.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
