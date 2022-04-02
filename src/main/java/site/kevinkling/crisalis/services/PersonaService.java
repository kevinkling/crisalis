package site.kevinkling.crisalis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.kevinkling.crisalis.interfaces.IPersona;
import site.kevinkling.crisalis.interfacesServices.IPersonaService;
import site.kevinkling.crisalis.models.Persona;

@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private IPersona iPersona;
	
	@Override
	public List<Persona> listar() {
		List<Persona> listPersonas = (List<Persona>) iPersona.findAll();
		return listPersonas;
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return iPersona.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona = iPersona.save(p);
		if (!persona.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		iPersona.deleteById(id);		
	}

}
