package online.bartish.example.orm.model;

import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "VALUE_TABLE")
@IdClass(ValueId.class)
public class Annotated extends CanNotJpaAnnotate {

  @Override
  @Id
  @Column(name = "VALUE_1")
  public @NonNull String getValue1(){
    return super.getValue1();
  }

  @Override
  @Id
  @Column(name = "VALUE_2")
  public @NonNull Integer getValue2(){
    return super.getValue2();
  }

  @Override
  @Column(name = "VALUE_3")
  public @NonNull String getValue3() {
    return super.getValue3();
  }
}
