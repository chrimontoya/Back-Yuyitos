package cl.pi.almacen.mapper;

import cl.pi.almacen.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CategoryMapper {

    List<Category> getAll();

    Category getById(Integer id);
}
