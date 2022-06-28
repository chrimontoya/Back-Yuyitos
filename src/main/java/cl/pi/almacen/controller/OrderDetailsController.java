package cl.pi.almacen.controller;

import cl.pi.almacen.model.OrderDetails;
import cl.pi.almacen.model.query.OrderDetailsQuery;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class OrderDetailsController {

    @Autowired
    private Service service;

    @GetMapping("/orderDetails")
    public List<OrderDetails> getAll(){
        return service.getAllOrdersDetails();
    };

    @GetMapping("/orderDetails/{id}")
    public OrderDetails getById(@PathVariable Integer id){
        return service.getByIdOrderDetails(id);
    };

    @PostMapping("/orderDetails")
    public void post(@RequestBody OrderDetails orderDetails){
        service.saveOrderDetails(orderDetails);
    };

    @DeleteMapping("/orderDetails/{id}")
    public void delete(@PathVariable Integer id) { service.deleteOrderDetails(id); };

    @GetMapping("/orderDetails/find-by-id-order/{id}")
    public List<OrderDetails> findByIdOrder(@PathVariable Integer id){ return service.findOrderDetailsByIdOrder(id);}

    @GetMapping("/orderDetails/get-all-by-order-id/{id}")
    public List<OrderDetailsQuery> getAllDetailsByIdOrder(@PathVariable Integer id){
        return service.getAllDetailsByIdOrder(id);
    }
}
