package cl.pi.almacen.controller;

import cl.pi.almacen.model.Contact;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class ContactController {

    @Autowired
    private Service service;

    @PostMapping("/contact")
    public void post(@RequestBody Contact contact){
        service.saveContact(contact);
    }

    @GetMapping("/contact")
    public List<Contact> get(){
        return service.getAllContact();
    }
    @GetMapping("/contact/{id}")
    public Contact get(@PathVariable Integer id){
        return service.getContactById(id);
    }
    @GetMapping("/contact/find-by-id-supplier/{id}")
    public List<Contact> findByIdSupplier(@PathVariable Integer id){ return service.findContactByIdSupplier(id);}

}
