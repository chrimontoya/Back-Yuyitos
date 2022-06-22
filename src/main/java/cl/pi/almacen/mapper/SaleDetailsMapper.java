package cl.pi.almacen.mapper;

import cl.pi.almacen.model.SaleDetails;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SaleDetailsMapper {

    Integer insert(SaleDetails saleDetails);

    void update(SaleDetails saleDetails);

    void delete(Integer id);

    List<SaleDetails> getAll();

    SaleDetails getById(Integer id);
}
