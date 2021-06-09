package com.opeyemi.schoolservices.api.configuration.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;
    private String surname;
    private String nationality;
    private String stateOfOrigin;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<SubjectClass> subjectClasses;

}
