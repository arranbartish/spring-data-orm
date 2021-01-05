package online.bartish.example.orm.model;

import lombok.*;

@EqualsAndHashCode
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CanNotJpaAnnotate {

  @NonNull
  private String value1;

  @NonNull
  private Integer value2;

  @NonNull
  private String value3;
}
