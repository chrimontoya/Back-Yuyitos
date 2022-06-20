package cl.pi.almacen.model;

import java.util.Date;

public class OrderDetails {

    public Integer id;
    public Integer stock;
    public Integer price;
    public Date dateExpiration;
    public Integer product;
    public Integer order;

    public OrderDetails(Integer id, Integer stock, Integer price, Date dateExpiration, Integer product, Integer order) {
        this.id = id;
        this.stock = stock;
        this.price = price;
        this.dateExpiration = dateExpiration;
        this.product = product;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
