package EC1AngelCuchilloColegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1AngelCuchilloColegio.model.ProfesorModel;
import EC1AngelCuchilloColegio.repository.ProfesorRepository;

@Service
public class ProfesorServiceImp implements ProfesorService {

	@Autowired
	private ProfesorRepository repositorio;
	
	@Override
	public void guardar(ProfesorModel profesormodel) {
		// TODO Auto-generated method stub
		repositorio.save(profesormodel);
		}

	@Override
	public void actualizar(ProfesorModel profesormodel) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(profesormodel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ProfesorModel> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public ProfesorModel obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
