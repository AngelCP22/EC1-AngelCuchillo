package EC1AngelCuchilloColegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1AngelCuchilloColegio.model.UniversidadModel;
import EC1AngelCuchilloColegio.repository.UnivesidadRepository;

@Service
public class UniversidadServiceImp implements UniversidadService {

	@Autowired
	private UnivesidadRepository repositorio;
	
	
	@Override
	public void guardar(UniversidadModel universidad) {
		// TODO Auto-generated method stub
		repositorio.save(universidad);
	}

	@Override
	public void actualizar(UniversidadModel universidad) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(universidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<UniversidadModel> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public UniversidadModel obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
