package EC1AngelCuchilloColegio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="universidad")
public class UniversidadModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUniversidad;
	private	String universidad;
	
	
	
	
	public Integer getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public UniversidadModel() {
		super();
	}
	public UniversidadModel(Integer idUniversidad, String universidad) {
		super();
		this.idUniversidad = idUniversidad;
		this.universidad = universidad;
	}
	
	
	
	
	
}
