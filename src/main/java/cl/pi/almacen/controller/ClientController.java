package cl.pi.almacen.controller;

import cl.pi.almacen.model.Client;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class ClientController {

    @Autowired
    private Service service;

    @PostMapping("/client")
    public Integer post(@RequestBody Client client){
        return service.saveClient(client);
    };

    @GetMapping("/client")
    public List<Client> getAll(){
        return service.getAllClient();
    }

    @GetMapping("/client/{id}")
    public Client getById(@PathVariable Integer id){
        return service.getClientById(id);
    }

}
