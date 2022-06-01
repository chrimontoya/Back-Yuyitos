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
    void insert(Order order);
    void update(Order order);
    void delete(Integer id);
}
