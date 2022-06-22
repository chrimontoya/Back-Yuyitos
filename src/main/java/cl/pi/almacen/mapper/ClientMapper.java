package cl.pi.almacen.mapper;

import cl.pi.almacen.model.Client;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClientMapper {

    Integer insert(Client client);

    void update(Client client);

    List<Client> getAll();

    Client getById(Integer id);

}
