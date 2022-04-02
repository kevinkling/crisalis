package site.kevinkling.crisalis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

import site.kevinkling.crisalis.interfacesServices.IPersonaService;
import site.kevinkling.crisalis.models.Persona;

@Controller
@RequestMapping
public class PersonaController {

	@Autowired
	private IPersonaService service;

	@GetMapping("/")
	public String welcome() {
		return "index";
	}

	@GetMapping("/clientes")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "listaClientes";
	}

	@GetMapping("/nuevoCliente")
	public String agregarNuevoCliente(Model model) {
		model.addAttribute("persona", new Persona());
		return "formularioCliente";
	}

	@PostMapping("/save")
	public String save(Persona p, Model model) {
		service.save(p);
		return "redirect:/clientes";
	}
	
	@GetMapping("/editarCliente/{id}")
	public String editarCliente(@PathVariable("id") int id, Model model) {
		Optional<Persona> persona = service.listarId(id);
		model.addAttribute("persona", persona);
		return "formularioCliente";
	}
	
	@GetMapping("/eliminarCliente/{id}")
	public String eliminarCliente(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/clientes";
	}
}
