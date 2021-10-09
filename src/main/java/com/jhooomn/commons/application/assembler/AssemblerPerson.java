package com.jhooomn.commons.application.assembler;

import com.jhooomn.commons.domain.entities.Person;
import com.jhooomn.commons.infrastructure.dto.PersonDTO;
import org.mapstruct.Mapper;

/** @author Jhon Camilo Barón Berdugo */
@Mapper
public interface AssemblerPerson {
  PersonDTO entityToDto(Person person);

  Person dtoToEntity(PersonDTO personDTO);
}
