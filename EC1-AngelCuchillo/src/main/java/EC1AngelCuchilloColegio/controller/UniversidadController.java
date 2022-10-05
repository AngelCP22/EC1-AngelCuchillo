package EC1AngelCuchilloColegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EC1AngelCuchilloColegio.model.UniversidadModel;
import EC1AngelCuchilloColegio.service.UniversidadService;


@RestController
@RequestMapping("/universidad/v1")
public class UniversidadController {
	
	@Autowired
	private UniversidadService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<UniversidadModel>> listar () {
		return new ResponseEntity<List<UniversidadModel>>(service.listar(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody UniversidadModel universidad){
		service.guardar(universidad);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<UniversidadModel> obtenerPorId(@PathVariable Integer id){
		UniversidadModel universidad = service.obtener(id);
		if(universidad != null) {
			return new ResponseEntity<UniversidadModel>(universidad,HttpStatus.OK);			
		}else {
			return new ResponseEntity<UniversidadModel>(HttpStatus.NOT_FOUND);
		}
	}

}
