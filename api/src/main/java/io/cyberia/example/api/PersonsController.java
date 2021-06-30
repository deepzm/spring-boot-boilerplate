package io.cyberia.example.api;

import com.sun.tools.javac.util.List;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.mediatype.hal.HalModelBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static io.cyberia.example.api.MediaTypes.VERSION_1;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "/persons", produces = VERSION_1)
public class PersonsController {

  @GetMapping
  public RepresentationModel<PersonsModel> getAll() {
    List<PersonModel> persons = List.of(new PersonDTO("Me", 22), new PersonDTO("You", 25))
        .map(p -> new PersonModel(p.getName(), p.getAge()));

    PersonsModel personsModel = new PersonsModel(persons.size(), persons.size());
    return HalModelBuilder
        .halModelOf(personsModel)
        .embed(persons)
        .link(linkTo(methodOn(PersonsController.class).getAll()).withSelfRel())
        .build();
  }
}
