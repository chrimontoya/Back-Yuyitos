package cl.pi.almacen.controller;

import cl.pi.almacen.model.User;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class UserController {

    @Autowired
    private Service service;

    @PostMapping("/login")
    public User logIn(@RequestBody User user){

         return service.getUserByUsernameAndPassword(user);
    }

}
