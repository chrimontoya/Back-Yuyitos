package cl.pi.almacen.controller;

import cl.pi.almacen.service.Service;
import cl.pi.almacen.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class OrderController {
    @Autowired
    private Service service;

    @GetMapping("/orders")
    public List<Order> get(){
        return service.getAllOrder();
    }

    @GetMapping("/orders/{id}")
    public Order getById(@PathVariable Integer id){
        return service.getByIdOrder(id);
    }

    @PostMapping("/orders")
    public Integer post(@RequestBody Order order){
        return service.saveOrder(order);
    }

    @DeleteMapping("/orders/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteOrder(id);
    }



}
