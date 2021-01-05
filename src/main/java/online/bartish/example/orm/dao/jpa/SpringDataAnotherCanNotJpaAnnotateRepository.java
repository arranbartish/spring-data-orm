package online.bartish.example.orm.dao.jpa;

import online.bartish.example.orm.dao.CanNotJpaAnnotateRepository;
import online.bartish.example.orm.model.AnotherCanNotJpaAnnotate;
import online.bartish.example.orm.model.ValueId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataAnotherCanNotJpaAnnotateRepository
  extends JpaRepository<AnotherCanNotJpaAnnotate, ValueId>, CanNotJpaAnnotateRepository<AnotherCanNotJpaAnnotate> {

  AnotherCanNotJpaAnnotate findByValue1(String Value1);
}
