package com.opeyemi.schoolservices.api.configuration.model;

import com.opeyemi.schoolservices.api.configuration.model.utils.Country;
import com.opeyemi.schoolservices.api.configuration.model.utils.State;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String surname;

    private String height;
    private String weight;
    private Date dateOfBirth;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id")
    private State state;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_is")
    private ClassModel classModel;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_teacher_id")
    private Teacher classTeacherId;

    @ManyToMany
    @JoinTable(
            name = "student_subject",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_classes_id")
    )
    private List<SubjectClass> subjectClasses;

    private Integer parentId;


}
