package com.jhooomn.commons.infrastructure.dto;

import java.io.Serializable;

/** @author Jhon Camilo Barón Berdugo */
public class PersonDTO implements Serializable {
  private Long id;
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;

  public PersonDTO(Long id, String firstName, String middleName, String lastName, int age) {
    this.id = id;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
  }

  public PersonDTO() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
