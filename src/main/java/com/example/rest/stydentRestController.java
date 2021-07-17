package com.example.rest;


import com.example.entity.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class stydentRestController {
    // define endpoint for "/students"
    @GetMapping("students")
    public List<student> getStudents(){

        List<student> theStudents = new ArrayList<>();
        theStudents.add(new student("mai" , "sherif"));
        theStudents.add(new student("ahmed" , "sherif"));
        theStudents.add(new student("dareen" , "sherif"));
        return  theStudents ;
    }
}
