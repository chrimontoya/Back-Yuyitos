package cl.pi.almacen.controller;

import cl.pi.almacen.model.SaleDetails;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
public class SaleDetailsController {

    @Autowired
    private Service service;

    @PostMapping("/saleDetails")
    public Integer post(@RequestBody SaleDetails saleDetails) {
        return service.saveSaleDetails(saleDetails);
    }

    @GetMapping("/saleDetails")
    public List<SaleDetails> get() {
        return service.getAllSaleDetails();
    }

    @GetMapping("/saleDetails/{id}")
    public SaleDetails getById(@PathVariable Integer id) {
        return service.getSaleDetailsById(id);
    }

    @DeleteMapping("/saleDetails/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteSaleDetails(id);
    }

}
