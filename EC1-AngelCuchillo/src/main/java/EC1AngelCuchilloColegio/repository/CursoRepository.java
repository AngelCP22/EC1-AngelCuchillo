package EC1AngelCuchilloColegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1AngelCuchilloColegio.model.CursoModel;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Integer> {

}
