package site.kevinkling.crisalis.interfacesServices;

import java.util.List;
import java.util.Optional;

import site.kevinkling.crisalis.models.Persona;

public interface IPersonaService {
	public List<Persona> listar();
	public Optional<Persona> listarId(int id);
	public int save (Persona p);
	public void delete (int id);
}
