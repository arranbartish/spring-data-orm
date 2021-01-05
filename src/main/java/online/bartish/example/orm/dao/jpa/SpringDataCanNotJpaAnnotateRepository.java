package online.bartish.example.orm.dao.jpa;

import online.bartish.example.orm.dao.CanNotJpaAnnotateRepository;
import online.bartish.example.orm.model.Annotated;
import online.bartish.example.orm.model.CanNotJpaAnnotate;
import online.bartish.example.orm.model.ValueId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCanNotJpaAnnotateRepository
  extends JpaRepository<Annotated, ValueId>, CanNotJpaAnnotateRepository<Annotated> {

  Annotated findByValue1(String Value1);
}
