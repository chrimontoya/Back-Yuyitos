package cl.pi.almacen.controller;

import cl.pi.almacen.model.Category;
import cl.pi.almacen.model.CategoryType;
import cl.pi.almacen.model.Product;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class ProductController {

    @Autowired
    private Service service;

    @GetMapping("/products")
    public List<Product> get(){
        return service.getAllProduct();
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable Integer id){ return service.getByIdProduct(id);}

    @PostMapping("/products")
    public void post(@RequestBody Product product){
        service.saveProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteProduct(id);
    }
}
