package com.opeyemi.schoolservices.api.configuration.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "subject")
public class Subject {

    @Id
    @GeneratedValue
    Integer id;

    String name;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<SubjectClass> subjectClasses;

}
