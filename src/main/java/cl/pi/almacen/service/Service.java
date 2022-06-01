package cl.pi.almacen.service;

import cl.pi.almacen.mapper.CategoryMapper;
import cl.pi.almacen.mapper.CategoryTypeMapper;
import cl.pi.almacen.mapper.OrderMapper;
import cl.pi.almacen.mapper.ProductMapper;
import cl.pi.almacen.model.Category;
import cl.pi.almacen.model.CategoryType;
import cl.pi.almacen.model.Order;
import cl.pi.almacen.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryTypeMapper categoryTypeMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Order> getAllOrder(){
        return orderMapper.getAll();
    };

    public Order getByIdOrder(Integer id){
        return orderMapper.getById(id);
    }

    public void saveOrder(Order order){
        if(order.getId()==null){
            orderMapper.insert(order);
        }else{
            orderMapper.update(order);
        }
    }
    public void deleteOrder(Integer id){
        orderMapper.delete(id);
    }

    public List<Product> getAllProduct(){
        return productMapper.getAll();
    }

    public void saveProduct(Product product){
        if(product.getId()==null){
            productMapper.insert(product);
        }else{
            productMapper.update(product);
        }
    }
    public List<CategoryType> getAllCategoryType(){
        return categoryTypeMapper.getAll();
    }

    public List<Category> getAllCategory(){
        return categoryMapper.getAll();
    }

    public CategoryType getByIdCategoryType(Integer id){
        return categoryTypeMapper.getById(id);
    }
}
