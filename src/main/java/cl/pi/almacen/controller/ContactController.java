package cl.pi.almacen.controller;

import cl.pi.almacen.model.Contact;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class ContactController {

    @Autowired
    private Service service;

    @PostMapping("/contact")
    public void post(@RequestBody Contact contact){
        service.saveContact(contact);
    }

}
