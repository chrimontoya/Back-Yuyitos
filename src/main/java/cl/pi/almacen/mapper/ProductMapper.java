package cl.pi.almacen.mapper;

import cl.pi.almacen.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ProductMapper {

    List<Product> getAll();
    void insert(Product product);
    void update(Product product);
}
