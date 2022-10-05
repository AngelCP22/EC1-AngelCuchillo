package EC1AngelCuchilloColegio.service;

import java.util.List;


import EC1AngelCuchilloColegio.model.ProfesorModel;

public interface ProfesorService {
	
	void guardar(ProfesorModel profesormodel);
	void actualizar(ProfesorModel profesormodel);
	void eliminar(Integer id);
	List<ProfesorModel> listar();
	
	ProfesorModel obtener(Integer id);
	

}
