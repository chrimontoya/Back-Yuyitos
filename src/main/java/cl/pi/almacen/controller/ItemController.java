package cl.pi.almacen.controller;

import cl.pi.almacen.model.Item;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class ItemController {

    @Autowired
    private Service service;

    @GetMapping("/item")
    public List<Item> get(){
        return service.getAllItem();
    }

    @GetMapping("/item/{id}")
    public Item get(@PathVariable Integer id){
        return service.getItemById(id);
    }
}
