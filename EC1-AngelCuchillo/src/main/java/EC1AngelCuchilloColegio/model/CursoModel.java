package EC1AngelCuchilloColegio.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class CursoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;	
 	private String descripcion;
 	

 	
 	@ManyToMany(mappedBy = "curso", cascade = {CascadeType.PERSIST,CascadeType.MERGE}) 	
 	private List<ProfesorModel> profesor = new ArrayList<>();
 	
 	@ManyToOne	 
	@JoinColumn(
			name="id_malla",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreing key(id_malla) references malla(id_mallaid_malla)"))
 	
 	private MallaCuModel malla;
 	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public CursoModel(Integer idCurso, String curso, String descripcion, List<ProfesorModel> profesor) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		this.profesor = profesor;
	}
	public CursoModel() {
		super();
	}

	
	
	
	

}
