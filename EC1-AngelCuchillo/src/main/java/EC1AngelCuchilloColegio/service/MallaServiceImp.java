package EC1AngelCuchilloColegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC1AngelCuchilloColegio.model.MallaCuModel;
import EC1AngelCuchilloColegio.repository.MallaCuRepository;

@Service
public class MallaServiceImp implements MallaService {

	@Autowired
	private MallaCuRepository repositorio;
	
	
	@Override
	public void guardar(MallaCuModel malla) {
		// TODO Auto-generated method stub
		repositorio.save(malla);
	}

	@Override
	public void actualizar(MallaCuModel malla) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(malla);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<MallaCuModel> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public MallaCuModel obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
