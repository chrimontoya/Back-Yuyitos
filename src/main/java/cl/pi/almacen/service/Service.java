package cl.pi.almacen.service;

import cl.pi.almacen.mapper.*;
import cl.pi.almacen.model.*;
import cl.pi.almacen.model.query.SaleAndDetailQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
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
    private ClientMapper clientMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private SaleMapper saleMapper;

    @Autowired
    private SaleDetailsMapper saleDetailsMapper;
    public List<Order> getAllOrder(){
        return orderMapper.getAll();
    };

    public Order getByIdOrder(Integer id){
        return orderMapper.getById(id);
    }

    public Integer saveOrder(Order order){
        if(order.getId()==null){
            orderMapper.insert(order);
        }else{
            orderMapper.update(order);
        }

        return order.getId();
    }
    public void deleteOrder(Integer id){
        orderMapper.delete(id);
    }

    public List<Order> getAllByStatusZero(){
        return orderMapper.getAllByStatusZero();
    }

    public List<OrderDetails> getAllOrdersDetails(){
        return orderDetailsMapper.getAll();
    }

    public OrderDetails getByIdOrderDetails(Integer id){
        return orderDetailsMapper.getById(id);
    }

    public List<OrderDetails> findOrderDetailsByIdOrder(Integer id){
        return orderDetailsMapper.findByIdOrder(id);
    }

    public void saveOrderDetails(OrderDetails orderDetails) {
        if(orderDetails.getId()==null){
            orderDetails.setDateExpiration(new Date());
            orderDetailsMapper.insert(orderDetails);
        }else{
            orderDetailsMapper.update(orderDetails);
        }
    }

    public void deleteOrderDetails(Integer id){
        orderDetailsMapper.delete(id);
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

    public List<Contact> getAllContact(){
        return contactMapper.getAll();
    }

    public Contact getContactById(Integer id){
        return contactMapper.getById(id);
    }

    public List<Contact> findContactByIdSupplier(Integer id){ return contactMapper.findByIdSupplier(id);}
    public User getUserByUsernameAndPassword(User user){
        return userMapper.findByUsernameAndPassword(user);
    }

    public Integer saveClient(Client client){
        if(client.getId()==null){
            clientMapper.insert(client);
        }else{
            clientMapper.update(client);
        }
        return client.getId();
    }

    public List<Client> getAllClient(){ return clientMapper.getAll();}

    public Client getClientById(Integer id){ return clientMapper.getById(id);}

    public Integer saveSale(Sale sale){
        if(sale.getId()==null){
            sale.setDateCreation(new Date());
            saleMapper.insert(sale);
        }else{
            saleMapper.update(sale);
        }
        return sale.getId();
    }

    public List<Sale> getAllSale(){ return saleMapper.getAll();}

    public Sale getSaleById(Integer id){ return saleMapper.getById(id);}

    public void deleteSale(Integer id){ saleMapper.delete(id);}
    public List<SaleAndDetailQuery> getAllSaleAndDetails(){ return saleMapper.getAllSaleAndDetails();}
    public List<SaleDetails> getAllSaleDetails(){ return saleDetailsMapper.getAll(); }
    public SaleDetails getSaleDetailsById(Integer id){ return saleDetailsMapper.getById(id); }

    public Integer saveSaleDetails(SaleDetails saleDetails){
        if(saleDetails.getId()==null){
            saleDetailsMapper.insert(saleDetails);
        }else{
            saleDetailsMapper.update(saleDetails);
        }
        return saleDetails.getId();
    }
    public void deleteSaleDetails(Integer id){ saleDetailsMapper.delete(id);}
}
