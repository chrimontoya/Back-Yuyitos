package cl.pi.almacen.model;

import java.util.Date;

public class OrderDetails {

    public int id;
    public String nameProduct;
    public int stock;
    public int price;
    public Date date_expiration;
    public Product product;
    public Order order;

    public OrderDetails(int id, String nameProduct, int stock, int price, Date date_expiration, Product product, Order order) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.stock = stock;
        this.price = price;
        this.date_expiration = date_expiration;
        this.product = product;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
