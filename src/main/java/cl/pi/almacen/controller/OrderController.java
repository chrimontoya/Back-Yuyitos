package cl.pi.almacen.controller;

import cl.pi.almacen.service.Service;
import cl.pi.almacen.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void post(@PathVariable Order order){
        service.saveOrder(order);
    }

    @DeleteMapping("/orders/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteOrder(id);
    }



}
