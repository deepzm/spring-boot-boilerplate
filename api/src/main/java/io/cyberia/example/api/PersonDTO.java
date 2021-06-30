package io.cyberia.example.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDTO {
  private String name;
  private int age;
}
