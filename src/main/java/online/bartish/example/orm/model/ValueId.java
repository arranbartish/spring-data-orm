package online.bartish.example.orm.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class ValueId implements Serializable {

  private String value1;

  private Integer value2;
}
