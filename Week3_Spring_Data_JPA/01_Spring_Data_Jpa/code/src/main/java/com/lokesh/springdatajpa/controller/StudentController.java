package com.lokesh.springdatajpa.controller;

import com.lokesh.springdatajpa.entity.Student;
import com.lokesh.springdatajpa.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String name) {
        return repo.findByName(name);
    }
}
