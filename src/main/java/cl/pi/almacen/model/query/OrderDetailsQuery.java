package cl.pi.almacen.model.query;

import java.util.Date;

public class OrderDetailsQuery {

    private Integer id;
    private Integer stock;
    private Integer price;
    private Date dateExpirate;
    private String product;

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

    public Date getDateExpirate() {
        return dateExpirate;
    }

    public void setDateExpirate(Date dateExpirate) {
        this.dateExpirate = dateExpirate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
