package site.kevinkling.crisalis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.kevinkling.crisalis.interfaces.IServicio;
import site.kevinkling.crisalis.interfacesServices.IServicioService;
import site.kevinkling.crisalis.models.Servicio;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private IServicio iServicio; 
	
	@Override
	public List<Servicio> listarServicios() {
		return (List<Servicio>) iServicio.findAll();
	}

	@Override
	public Optional<Servicio> listarId(int id) {
		return iServicio.findById(id);
	}

	@Override
	public int guardarServicio(Servicio s) {
		int res = 0;
		
		// Si incluye soporte le suma al precio 5% del valor 
		if (s.isIncluyeSoporte()) {
			s.setCostoBase((float) (s.getCostoBase() + (s.getCostoBase() * 0.05)));
		}
		
		// Calculo costo mensual.
		s.setCostoMensual(this.calcularCostoMensual(s.getCostoBase()));
		
		Servicio servi = iServicio.save(s);
		if (!servi.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void eliminarServicio(int id) {
		iServicio.deleteById(id);
	}

	@Override
	public float calcularCostoMensual(float costoBase) {
		return (float) (costoBase + (costoBase * 0.21) + (costoBase * 0.035));
	}
}
