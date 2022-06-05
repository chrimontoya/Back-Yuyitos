package cl.pi.almacen.controller;

import cl.pi.almacen.model.Contact;
import cl.pi.almacen.model.Supplier;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class SupplierController {

    @Autowired
    private Service service;

    @GetMapping("/suppliers")
    public List<Supplier> getAll(){
        return service.getAllSupplier();
    }

    @GetMapping("/suppliers/{id}")
    public Supplier getById(@PathVariable Integer id){
        return service.getById(id);
    }

}
