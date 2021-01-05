package online.bartish.example.orm.dao;

import online.bartish.example.orm.model.CanNotJpaAnnotate;

public interface CanNotJpaAnnotateRepository<CanNotJpaAnnotateT> {

  CanNotJpaAnnotateT findByValue1(String Value1);
}
