package cl.pi.almacen.mapper;

import cl.pi.almacen.model.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ItemMapper {

    Item getById(Integer id);
}
