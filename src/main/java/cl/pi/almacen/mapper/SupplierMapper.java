package cl.pi.almacen.mapper;


import cl.pi.almacen.model.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SupplierMapper {

    List<Supplier> getAll();
    Supplier getById(Integer id);


}
