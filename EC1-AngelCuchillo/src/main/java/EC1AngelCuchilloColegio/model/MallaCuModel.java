package EC1AngelCuchilloColegio.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="malla")
public class MallaCuModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private Integer año;
	
	@OneToOne
	private UniversidadModel universidad;
	
	@OneToMany(mappedBy = "malla")
	private List<CursoModel> curso = new ArrayList<>(); 	
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	public MallaCuModel(Integer idMalla, Integer año) {
		super();
		this.idMalla = idMalla;
		this.año = año;
	}
	public MallaCuModel() {
		super();
	}
	
	

}
