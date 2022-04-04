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

import site.kevinkling.crisalis.interfacesServices.IProductoService;
import site.kevinkling.crisalis.models.Producto;

@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	private IProductoService produtcotServ;
	
	@GetMapping("/listarProductos")
	public String listarProductos(Model model) {
		List<Producto> productos = produtcotServ.listarProductos();
		model.addAttribute("productos", productos);
		return "listaProductos";
	}
	
	@PostMapping("/guardarProducto")
	public String guardarProducto(Producto p, Model model) {
		produtcotServ.guardarProducto(p);
		return "redirect:/listarProductos";
	}
	
	@GetMapping("/nuevoProducto")
	public String createProducto(Model model) {
		model.addAttribute("producto", new Producto());
		return "formularioProducto";
	}
	
	@GetMapping("/editarProducto/{id}")
	public String editarProducto(@PathVariable("id") int id, Model model) {
		Optional<Producto> producto = produtcotServ.listarProductoId(id);
		model.addAttribute("producto", producto);
		return "formularioProducto";
	}
	
	@GetMapping("/eliminarProducto/{id}")
	public String eliminarProducto(@PathVariable("id") int id, Model model) {
		produtcotServ.eliminarProducto(id);
		return "redirect:/listarProductos";
	}
	
}















