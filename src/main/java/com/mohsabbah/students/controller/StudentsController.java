package com.mohsabbah.students.controller;

import com.mohsabbah.students.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/students")
public class StudentsController {


        private final StudentService studentService;

        public StudentsController(StudentService studentsService) {
            this.studentService = studentsService;
        }

        @GetMapping
        public String getStudents(org.springframework.ui.Model model) {
            model.addAttribute("students", studentService.getAllStudents());
            return "students";
        }

        @PostMapping("/add")
        public String addStudents(@RequestParam String name, @RequestParam double grade) {
            studentService.addStudents(name, grade);
            return "redirect:/students";
        }

        @GetMapping("/delete/{id}")
        public String deleteStudents(@PathVariable int id) {
            studentService.deleteStudents(id);
            return "redirect:/students";
        }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    }


