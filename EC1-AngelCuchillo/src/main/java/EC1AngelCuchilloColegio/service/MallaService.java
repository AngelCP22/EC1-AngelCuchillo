package EC1AngelCuchilloColegio.service;

import java.util.List;

import EC1AngelCuchilloColegio.model.MallaCuModel;


public interface MallaService {
	
	void guardar(MallaCuModel malla);
	void actualizar(MallaCuModel malla);
	void eliminar(Integer id);
	List<MallaCuModel> listar();
	
	MallaCuModel obtener(Integer id);
	

}
