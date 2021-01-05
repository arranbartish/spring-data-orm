package online.bartish.example.orm.model;

import online.bartish.example.orm.Factory;

public class CanNotJpaAnnotateMother implements Factory<CanNotJpaAnnotate> {

  @Override
  public CanNotJpaAnnotate getInstance() {
    Annotated instance = new Annotated();
    instance.setValue1("1");
    instance.setValue2(2);
    instance.setValue3("3");
    return instance;
  }
}
