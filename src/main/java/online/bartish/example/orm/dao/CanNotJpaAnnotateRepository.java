package online.bartish.example.orm.dao;

import online.bartish.example.orm.model.CanNotJpaAnnotate;

public interface CanNotJpaAnnotateRepository<CanNotJpaAnnotateT extends CanNotJpaAnnotate> {

  CanNotJpaAnnotateT findByValue1(String Value1);
}
