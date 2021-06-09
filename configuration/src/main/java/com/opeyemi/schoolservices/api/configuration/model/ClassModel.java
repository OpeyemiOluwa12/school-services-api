package com.opeyemi.schoolservices.api.configuration.model;

import javax.persistence.*;

@Entity(name = "class")
public class ClassModel {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
