package com.opeyemi.schoolservices.api.configuration.services;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    int group = 20;

    public StudentService() {
        System.out.println(group);
    }
}
