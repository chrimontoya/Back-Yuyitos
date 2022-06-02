package cl.pi.almacen.model;

import java.util.Date;
import java.util.List;

public class Order {

    private Integer id;
    private Boolean status;
    private Date dateCreate;
    private Integer supplier;

    public Order(Integer id, Boolean status, Date dateCreate, Integer supplier) {
        this.id = id;
        this.status = status;
        this.dateCreate = dateCreate;
        this.supplier = supplier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }
}
