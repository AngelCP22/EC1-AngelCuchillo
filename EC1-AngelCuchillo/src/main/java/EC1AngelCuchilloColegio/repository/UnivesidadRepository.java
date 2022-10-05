package EC1AngelCuchilloColegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1AngelCuchilloColegio.model.UniversidadModel;

@Repository
public interface UnivesidadRepository extends JpaRepository<UniversidadModel, Integer>{

}
