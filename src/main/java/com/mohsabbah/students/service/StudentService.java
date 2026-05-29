package com.mohsabbah.students.service;

import com.mohsabbah.students.model.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class StudentService {

    private final List<Students> students = new ArrayList<>();
    private int nextId = 1;

    public void addStudents(String name, double grade){
        students.add(new Students(nextId++, name, grade));
    }

    public void deleteStudents(int id){
        students.removeIf(note -> note.getId() == id);
    }

    public List<Students> getAllStudents(){
        return students;
    }

}