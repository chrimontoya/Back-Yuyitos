package cl.pi.almacen.service;

import cl.pi.almacen.mapper.*;
import cl.pi.almacen.model.*;
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
    private OrderDetailsMapper orderDetailsMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryTypeMapper categoryTypeMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private SupplierMapper supplierMapper;

    @Autowired
    private ContactMapper contactMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ItemMapper itemMapper;
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

    public List<OrderDetails> getAllOrdersDetails(){
        return orderDetailsMapper.getAll();
    }

    public OrderDetails getByIdOrderDetails(Integer id){
        return orderDetailsMapper.getById(id);
    }

    public void saveOrderDetails(OrderDetails orderDetails) {
        if(orderDetails.getId()==null){
            orderDetailsMapper.insert(orderDetails);
        }else{
            orderDetailsMapper.update(orderDetails);
        }
    }

    public List<Product> getAllProduct(){
        return productMapper.getAll();
    }

    public Product getByIdProduct(Integer id){ return productMapper.getById(id);}

    public void saveProduct(Product product){
        if(product.getId()==null){
            productMapper.insert(product);
        }else{
            productMapper.update(product);
        }
    }

    public void deleteProduct(Integer id){
        productMapper.delete(id);
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

    public List<Supplier> getAllSupplier(){
        return supplierMapper.getAll();
    }
    public Supplier getById(Integer id){
        return supplierMapper.getById(id);
    }

    public Integer saveSupplier(Supplier supplier){

        if(supplier.getId()==null){
            supplierMapper.insert(supplier);
        }else{
            supplierMapper.update(supplier);
        }
        return supplier.getId();
    }
    public void deleteSupplier(Integer id) {
        supplierMapper.delete(id);
    };

    public List<Item> getAllItem(){
        return itemMapper.getAll();
    }

    public Item getItemById(Integer id){
        return itemMapper.getById(id);
    }

    public void saveContact(Contact contact){
        if(contact.getId()==null){
            contactMapper.insert(contact);
        }else{
            contactMapper.update(contact);
        }
    }

    public User getUserByUsernameAndPassword(User user){
        return userMapper.findByUsernameAndPassword(user);
    }
}
