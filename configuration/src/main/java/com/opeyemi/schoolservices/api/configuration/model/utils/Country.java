package com.opeyemi.schoolservices.api.configuration.model.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "country")
public class Country {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

}
