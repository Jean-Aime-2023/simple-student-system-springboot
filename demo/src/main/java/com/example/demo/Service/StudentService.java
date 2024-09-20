package com.example.demo.Service;


import com.example.demo.model.Student;
import java.util.*;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
