package cl.pi.almacen.controller;


import cl.pi.almacen.model.Sale;
import cl.pi.almacen.model.query.SaleAndDetailQuery;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class SaleController {

    @Autowired
    private Service service;

    @PostMapping("/sale")
    public Integer post(@RequestBody Sale sale) {
        return service.saveSale(sale);
    }

    @GetMapping("/sale")
    public List<Sale> getAll() {
        return service.getAllSale();
    }

    @GetMapping("/sale/{id}")
    public Sale getById(@PathVariable Integer id) {
        return service.getSaleById(id);
    }

    @GetMapping("/sale-and-details")
    public List<SaleAndDetailQuery> getSaleAndDetails(){
        return service.getAllSaleAndDetails();
    }

    @DeleteMapping("/sale/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteSale(id);
    }


}
