package online.bartish.example.orm.model;

import org.springframework.data.repository.CrudRepository;

public class PersistedCanNotJpaAnnotateMother extends CanNotJpaAnnotateMother {

  private final CrudRepository<Annotated, ValueId> fixture;

  public PersistedCanNotJpaAnnotateMother(CrudRepository<Annotated, ValueId> fixture) {
    this.fixture = fixture;
  }

  @Override
  public CanNotJpaAnnotate getInstance() {
    return fixture.save((Annotated) super.getInstance());
  }
}
