package com.opeyemi.schoolservices.api.configuration.model.utils;

import javax.persistence.*;
import java.util.List;

@Entity(name = "country")
public class Country {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<State> states;
}
