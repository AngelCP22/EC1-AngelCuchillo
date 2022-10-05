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

import EC1AngelCuchilloColegio.model.CursoModel;

import EC1AngelCuchilloColegio.service.CursoService;


@RestController
@RequestMapping("/curso/v1")
public class CursoController {
	
	
	@Autowired
	private CursoService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<CursoModel>> listar () {
		return new ResponseEntity<List<CursoModel>>(service.listar(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody CursoModel curso){
		service.guardar(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<CursoModel> obtenerPorId(@PathVariable Integer id){
		CursoModel curso = service.obtener(id);
		if(curso != null) {
			return new ResponseEntity<CursoModel>(curso,HttpStatus.OK);			
		}else {
			return new ResponseEntity<CursoModel>(HttpStatus.NOT_FOUND);
		}
	}
	
	

}
