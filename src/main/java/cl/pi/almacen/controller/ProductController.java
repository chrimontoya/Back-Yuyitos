package cl.pi.almacen.controller;

import cl.pi.almacen.model.Category;
import cl.pi.almacen.model.CategoryType;
import cl.pi.almacen.model.Product;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private Service service;

    @GetMapping("/product")
    public List<Product> get(){
        return service.getAllProduct();
    }

    @PostMapping("/product")
    public void post(@PathVariable Product product){
        service.saveProduct(product);
    }
}
