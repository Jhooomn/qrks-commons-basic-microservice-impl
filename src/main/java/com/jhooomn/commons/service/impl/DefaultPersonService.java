package com.jhooomn.commons.service.impl;

import com.jhooomn.commons.application.assembler.AssemblerPerson;
import com.jhooomn.commons.infrastructure.dto.PersonDTO;
import com.jhooomn.commons.infrastructure.repositories.PersonRepository;
import com.jhooomn.commons.service.PersonService;
import org.mapstruct.factory.Mappers;

import javax.enterprise.context.ApplicationScoped;

/** @author Jhon Camilo Barón Berdugo */
@ApplicationScoped
public class DefaultPersonService implements PersonService {

  private static PersonRepository personRepository;
  private AssemblerPerson person = Mappers.getMapper(AssemblerPerson.class);

  static {
    personRepository = new PersonRepository();
  }

  @Override
  public PersonDTO create(PersonDTO personDTO) {
    personRepository = (PersonRepository) person.dtoToEntity(personDTO);
    return null;
  }
}
