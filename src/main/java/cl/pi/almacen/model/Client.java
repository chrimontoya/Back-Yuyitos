package cl.pi.almacen.model;

public class Client {

    private Integer id;
    private Integer rut;
    private String dv;
    private String name;
    private String lastName;
    private String lastNameMother;
    private Integer fiado;

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
