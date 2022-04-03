package site.kevinkling.crisalis.interfacesServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import site.kevinkling.crisalis.models.Persona;

@Service
public interface IPersonaService {
	public List<Persona> listar();
	public Optional<Persona> listarId(int id);
	public int save (Persona p);
	public void delete (int id);
}
