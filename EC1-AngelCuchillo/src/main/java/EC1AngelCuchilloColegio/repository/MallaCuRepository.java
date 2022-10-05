package EC1AngelCuchilloColegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC1AngelCuchilloColegio.model.MallaCuModel;

@Repository
public interface MallaCuRepository extends JpaRepository<MallaCuModel, Integer>{

}
