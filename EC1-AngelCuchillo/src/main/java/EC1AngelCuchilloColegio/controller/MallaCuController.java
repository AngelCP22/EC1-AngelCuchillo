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

import EC1AngelCuchilloColegio.model.MallaCuModel;
import EC1AngelCuchilloColegio.service.MallaService;

@RestController
@RequestMapping("/malla/v1")
public class MallaCuController {
	
	@Autowired
	private MallaService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<MallaCuModel>> listar () {
		return new ResponseEntity<List<MallaCuModel>>(service.listar(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/guardar")
	public ResponseEntity<Void> guardar(@RequestBody MallaCuModel malla){
		service.guardar(malla);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<MallaCuModel> obtenerPorId(@PathVariable Integer id){
		MallaCuModel malla = service.obtener(id);
		if(malla != null) {
			return new ResponseEntity<MallaCuModel>(malla,HttpStatus.OK);			
		}else {
			return new ResponseEntity<MallaCuModel>(HttpStatus.NOT_FOUND);
		}
	}

}
