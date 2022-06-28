package cl.pi.almacen.mapper;

import cl.pi.almacen.model.OrderDetails;
import cl.pi.almacen.model.query.OrderDetailsQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OrderDetailsMapper {

    List<OrderDetails> getAll();

    OrderDetails getById(Integer id);

    List<OrderDetails> findByIdOrder(Integer id);

    List<OrderDetailsQuery> getAllDetailsByIdOrder(Integer id);

    void insert(OrderDetails orderDetails);

    void update(OrderDetails orderDetails);

    void delete(Integer id);

}
