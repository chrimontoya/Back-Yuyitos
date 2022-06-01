package cl.pi.almacen.model;

import java.util.Date;

public class Order {

    private Integer id;
    private Boolean status;
    private Date dateCreate;
    private OrderDetails orderDetails;

    public Order(Integer id, Boolean status, Date dateCreate, OrderDetails orderDetails) {
        this.id = id;
        this.status = status;
        this.dateCreate = dateCreate;
        this.orderDetails = orderDetails;
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

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }
}
