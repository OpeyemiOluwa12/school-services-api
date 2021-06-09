package com.opeyemi.schoolservices.api.configuration.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "subject-class")
public class SubjectClass {

    @Id
    @GeneratedValue
    private Integer id;

    @JoinColumn(name = "subject_id")
    private Subject subject;

    @JoinColumn(name = "class_id")
    private ClassModel classModel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private Double gradePoint;

    @ManyToMany(mappedBy = "subjectClasses")
    private List<Student> students;
}
