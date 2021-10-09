package com.jhooomn.commons.controller;

import com.jhooomn.commons.infrastructure.dto.PersonDTO;
import com.jhooomn.commons.service.PersonService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/** @author Jhon Camilo Barón Berdugo */
@Path(value = "/user")
public class UserController {

  @Inject private PersonService personService;

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public Object create() {
    personService.create(new PersonDTO(0L, "", "", "", 1));
    return null;
  }
}
