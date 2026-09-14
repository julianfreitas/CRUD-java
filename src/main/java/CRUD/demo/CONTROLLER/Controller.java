package CRUD.demo.CONTROLLER;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import CRUD.demo.MODEL.Model;
import CRUD.demo.SERVICE.Service;

@RestController 
@RequestMapping("/test")
public class Controller {
    private final Service service;
    
  
    public Controller(Service service) {
        this.service = service;
    }
    //C
    @PostMapping
    public Model Create(@RequestBody Model model){
        return service.Create(model);
    }
    //R
    @GetMapping
    public List<Model> List(){
        return service.List();
    }
    //U
    
    public Model Updating(@PathVariable Long id, @RequestBody  Model model){
       return service.Updating(id, model);
    }

    //D
    @DeleteMapping
    public void Delete(@PathVariable Long id){
        service.Delete(id);
    }

}
