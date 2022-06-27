package cl.pi.almacen.mapper;

import cl.pi.almacen.model.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ContactMapper {

    List<Contact> getAll();
    Contact getById(Integer id);

    void insert(Contact contact);
    void update(Contact contact);

    List<Contact> findByIdSupplier(Integer id);
}
