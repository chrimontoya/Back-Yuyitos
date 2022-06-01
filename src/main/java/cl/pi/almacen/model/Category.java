package cl.pi.almacen.model;

import java.util.List;

public class Category {

    private Integer id;
    private String name;
    private List<CategoryType> categoryTypes;

    public List<CategoryType> getCategoryTypes() {
        return categoryTypes;
    }

    public void setCategoryTypes(List<CategoryType> categoryTypes) {
        this.categoryTypes = categoryTypes;
    }

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
