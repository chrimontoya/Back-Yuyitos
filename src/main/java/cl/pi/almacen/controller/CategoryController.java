package cl.pi.almacen.controller;

import cl.pi.almacen.model.Category;
import cl.pi.almacen.model.CategoryType;
import cl.pi.almacen.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class CategoryController {

    @Autowired
    private Service service;

    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return service.getAllCategory();
    }

    @GetMapping("/categoryType")
    public List<CategoryType> getAllCategoryType(){
        return service.getAllCategoryType();
    }

    @GetMapping("/categoryType/{id}")
    public CategoryType getByIdCategoryType(@PathVariable Integer id){
        return service.getByIdCategoryType(id);
    }

}
