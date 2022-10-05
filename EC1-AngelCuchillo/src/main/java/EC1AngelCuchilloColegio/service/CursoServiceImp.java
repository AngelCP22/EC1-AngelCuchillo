package EC1AngelCuchilloColegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1AngelCuchilloColegio.model.CursoModel;
import EC1AngelCuchilloColegio.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService {

	@Autowired
	private CursoRepository repositorio;
	
	@Override
	public void guardar(CursoModel curso) {
		// TODO Auto-generated method stub
		repositorio.save(curso);	
		}

	@Override
	public void actualizar(CursoModel curso) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(curso);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<CursoModel> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public CursoModel obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
