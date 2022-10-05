package EC1AngelCuchilloColegio.service;

import java.util.List;

import EC1AngelCuchilloColegio.model.UniversidadModel;

public interface UniversidadService {
	
	void guardar(UniversidadModel universidad);
	void actualizar(UniversidadModel universidad);
	void eliminar(Integer id);
	List<UniversidadModel> listar();
	
	UniversidadModel obtener(Integer id);

}
