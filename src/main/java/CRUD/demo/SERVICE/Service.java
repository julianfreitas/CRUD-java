package CRUD.demo.SERVICE;
import java.util.List;
import CRUD.demo.MODEL.Model;
import CRUD.demo.REPOSITORY.Repository;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }
    //C
    public Model Create(Model model) {
        return repository.save(model);
    }

    //R
    public List<Model> List(){
        return repository.findAll();

    }
    //U
    public Model Updating(Long id, Model model ){
       
            Model modelExist = repository.findById(id).orElseThrow(()-> new RuntimeException("id nao encontado"));
            modelExist.setName(model.getName());
            return repository.save(modelExist);
      
    }

    //D
    public void Delete(Long id){
        repository.deleteById(id);
    }

}
