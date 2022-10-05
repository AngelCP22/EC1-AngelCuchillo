package EC1AngelCuchilloColegio.service;

import java.util.List;

import EC1AngelCuchilloColegio.model.CursoModel;

public interface CursoService {
	
	void guardar(CursoModel curso);
	void actualizar(CursoModel curso);
	void eliminar(Integer id);
	List<CursoModel> listar();
	
	CursoModel obtener(Integer id);
}
