package com.opeyemi.schoolservices.api.configuration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "subject")
public class Subject {

    @Id
    @GeneratedValue
    Integer id;

    String name;

}
