package CRUD.demo.REPOSITORY;
import org.springframework.data.jpa.repository.JpaRepository;
import CRUD.demo.MODEL.Model;

public interface Repository extends JpaRepository<Model,Long> {

}
