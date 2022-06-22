package cl.pi.almacen.model.query;

import java.util.Date;

public class SaleAndDetailQuery {

    private Integer idSale;
    private Integer idSaleDetail;
    private Integer idClient;
    private Date dateCreation;
    private Integer price;
    private Integer stock;

    private Integer idProduct;

    private String nameProduct;

    private Integer stockProduct;

    private Date dateExpirate;

    private String image;
    private Integer rut;
    private String dv;
    private String name;
    private String lastName;
    private String lastNameMother;
    private Integer fiado;

    public Integer getIdSale() {
        return idSale;
    }

    public void setIdSale(Integer idSale) {
        this.idSale = idSale;
    }

    public Integer getIdSaleDetail() {
        return idSaleDetail;
    }

    public void setIdSaleDetail(Integer idSaleDetail) {
        this.idSaleDetail = idSaleDetail;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(Integer stockProduct) {
        this.stockProduct = stockProduct;
    }

    public Date getDateExpirate() {
        return dateExpirate;
    }

    public void setDateExpirate(Date dateExpirate) {
        this.dateExpirate = dateExpirate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameMother() {
        return lastNameMother;
    }

    public void setLastNameMother(String lastNameMother) {
        this.lastNameMother = lastNameMother;
    }

    public Integer getFiado() {
        return fiado;
    }

    public void setFiado(Integer fiado) {
        this.fiado = fiado;
    }
}
