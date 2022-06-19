package cl.pi.almacen.mapper;

import cl.pi.almacen.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {

    List<User> getAll();

    User findByUsernameAndPassword(User user);

}
