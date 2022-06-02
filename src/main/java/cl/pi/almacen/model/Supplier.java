package cl.pi.almacen.model;

public class Supplier {

    private Integer id;
    private Integer rut;
    private Character dv;
    private String name;

    private Item item;

    public Supplier(Integer id, Integer rut, Character dv, String name) {
        this.id = id;
        this.rut = rut;
        this.dv = dv;
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public Character getDv() {
        return dv;
    }

    public void setDv(Character dv) {
        this.dv = dv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
