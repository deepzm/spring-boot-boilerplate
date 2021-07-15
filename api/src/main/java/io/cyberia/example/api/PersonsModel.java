package io.cyberia.example.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;


@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonsModel extends RepresentationModel<PersonsModel> {
  private int total;
  private int count;
}
