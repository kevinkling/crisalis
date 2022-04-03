package site.kevinkling.crisalis.interfacesServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import site.kevinkling.crisalis.models.Servicio;

@Service
public interface IServicioService {
	public List<Servicio> listarServicios();
	public Optional<Servicio> listarId(int id);
	public int guardarServicio (Servicio p);
	public void eliminarServicio (int id);
	
	public float calcularCostoMensual(float costoBase);
//	public void costoSoporte();
}
