package site.kevinkling.crisalis.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import site.kevinkling.crisalis.interfacesServices.IServicioService;
import site.kevinkling.crisalis.models.Servicio;

@Controller
@RequestMapping
public class ServicioController {
	
	@Autowired
	private IServicioService service;
	
	@GetMapping("/listarServicios")
	public String listarServicios(Model model) {
		List<Servicio> servicios = service.listarServicios();
		model.addAttribute("servicios", servicios);
		return "listaServicios";
	}
	
	@GetMapping("/nuevoServicio")
	public String agregarNuevoServicio(Model model) {
		model.addAttribute("servicio", new Servicio());
		return "formularioServicio";
	}
	
	@PostMapping("/guardarServicio")
	public String guardarServicio(Servicio s, Model model) {
		service.guardarServicio(s);
		return "redirect:/listarServicios";
	}
	
	@GetMapping("/editarServicio/{id}")
	public String editarServicio(@PathVariable("id") int id, Model model) {
		Optional<Servicio> servicio = service.listarId(id);
		model.addAttribute("servicio", servicio);
		return "formularioServicio";
	}
	
		
	@GetMapping("/eliminarServicio/{id}")
	public String eliminarServicio(Model model, @PathVariable int id) {
		service.eliminarServicio(id);
		return "redirect:/listarServicios";
	}
}
