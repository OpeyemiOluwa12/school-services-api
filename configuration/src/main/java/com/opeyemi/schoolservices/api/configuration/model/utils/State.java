package com.opeyemi.schoolservices.api.configuration.model.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity(name = "state")
public class State {

    @Id
    @GeneratedValue
    private Integer Id;

    private String name;

    @JoinColumn(name = "country_id")
    private Country country;
}
