package online.bartish.example.orm.dao.jpa;

import online.bartish.example.orm.model.Annotated;
import online.bartish.example.orm.model.ValueId;
import org.springframework.data.repository.CrudRepository;

public interface SpringDataCrudAnnotatedRepository
  extends CrudRepository<Annotated, ValueId> {

}
