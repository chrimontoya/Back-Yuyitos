package cl.pi.almacen.mapper;
import cl.pi.almacen.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OrderMapper {
    List<Order> getAll();
    Order getById(Integer id);
    Integer insert(Order order);

    List<Order> getAllByStatusZero();

    void update(Order order);
    void delete(Integer id);
}
