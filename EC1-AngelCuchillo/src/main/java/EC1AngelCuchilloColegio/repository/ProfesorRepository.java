package EC1AngelCuchilloColegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1AngelCuchilloColegio.model.ProfesorModel;

@Repository
public interface ProfesorRepository extends JpaRepository <ProfesorModel, Integer> {

}
