package cl.pi.almacen.mapper;

import cl.pi.almacen.model.Sale;
import cl.pi.almacen.model.query.SaleAndDetailQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SaleMapper {

    Integer insert(Sale sale);

    void update(Sale sale);

    List<Sale> getAll();

    List<SaleAndDetailQuery> getAllSaleAndDetails();

    Sale getById(Integer id);

    void delete(Integer id);

}
