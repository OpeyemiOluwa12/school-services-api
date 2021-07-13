package com.opeyemi.schoolservices.api.configuration.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "class")
public class ClassModel {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToMany(mappedBy = "classModel", cascade = CascadeType.ALL)
    private List<SubjectClass> subjectClasses;
}
