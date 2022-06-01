package cl.pi.almacen.mapper;

import cl.pi.almacen.model.CategoryType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CategoryTypeMapper {

    List<CategoryType> getAll();

    CategoryType getById(Integer id);

}
