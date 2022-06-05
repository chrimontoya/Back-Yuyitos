package cl.pi.almacen.model;

public class Contact {

    private Integer id;
    private String email;
    private Integer phone;
    private Integer proveedor;

    public Contact(Integer id, String email, Integer phone, Integer proveedor) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.proveedor = proveedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getProveedor() {
        return proveedor;
    }

    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }
}
