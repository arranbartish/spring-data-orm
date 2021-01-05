package online.bartish.example.orm.dao.jpa;

import online.bartish.example.orm.model.Annotated;
import online.bartish.example.orm.model.CanNotJpaAnnotate;
import online.bartish.example.orm.model.PersistedCanNotJpaAnnotateMother;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
@Rollback
public class SpringDataAnnotatedRepositoryTest {

  @Autowired
  SpringDataCrudAnnotatedRepository springDataCrudAnnotatedRepository;

  @Autowired
  SpringDataAnnotatedRepository sut;

  @Test
  void willLoadValue() {
    CanNotJpaAnnotate expected =
      new PersistedCanNotJpaAnnotateMother(springDataCrudAnnotatedRepository)
        .getInstance();

    Annotated actual = sut.findByValue1(expected.getValue1());

    Assertions.assertThat(actual).isEqualTo(expected);
  }
}
