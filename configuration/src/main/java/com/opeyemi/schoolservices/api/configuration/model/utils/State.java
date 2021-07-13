package com.opeyemi.schoolservices.api.configuration.model.utils;

import javax.persistence.*;

@Entity(name = "state")
public class State {

    @Id
    @GeneratedValue
    private Integer Id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
