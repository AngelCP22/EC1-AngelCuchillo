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

import EC1AngelCuchilloColegio.model.ProfesorModel;
import EC1AngelCuchilloColegio.service.ProfesorService;

@RestController
@RequestMapping("/profesor/v1")
public class ProfesorController {
	
	@Autowired
	private ProfesorService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<ProfesorModel>> listar () {
		return new ResponseEntity<List<ProfesorModel>>(service.listar(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody ProfesorModel profesor){
		service.guardar(profesor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProfesorModel> obtenerPorId(@PathVariable Integer id){
		ProfesorModel profesor = service.obtener(id);
		if(profesor != null) {
			return new ResponseEntity<ProfesorModel>(profesor,HttpStatus.OK);			
		}else {
			return new ResponseEntity<ProfesorModel>(HttpStatus.NOT_FOUND);
		}
	}

}
