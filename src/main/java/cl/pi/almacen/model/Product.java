package cl.pi.almacen.model;

import java.util.Date;

public class Product {

    private Integer id;
    private String name;
    private Integer stock;
    private Date date_expirate;
    private String image;
    private Integer categoryType;

    public Product(Integer id, String name, Integer stock, Date date_expirate, String image, Integer categoryType) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.date_expirate = date_expirate;
        this.image = image;
        this.categoryType = categoryType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getDate_expirate() {
        return date_expirate;
    }

    public void setDate_expirate(Date date_expirate) {
        this.date_expirate = date_expirate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
