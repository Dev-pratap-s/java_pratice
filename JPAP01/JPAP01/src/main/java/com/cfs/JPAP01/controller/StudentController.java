package com.cfs.JPAP01.controller;

import com.cfs.JPAP01.entity.Student;
import com.cfs.JPAP01.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/students")
@RestController
public class StudentController {


    private  StudentRepo studentRepo;

    StudentController(StudentRepo studentRepo){
        this.studentRepo=studentRepo;

    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepo.save(student);

    }

    @GetMapping
    public List<Student> getallStudents(){
        return studentRepo.findAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable long id) {
        return studentRepo.findById(id)
                .orElse(null); // agar nahi milta to null return kare
    }

    @PutMapping
    public Student updateStudent(@RequestParam long id , @RequestBody Student student){
        Student s = studentRepo.findById(id)
                .orElse(null);

        s.setName(student.getName());
        s.setEmail(student.getEmail());

        return studentRepo.save(s);
    }

    @PatchMapping
    public Student updateStudentpart(@RequestParam long id, @RequestParam String name, @RequestParam String email) {
        Student s = studentRepo.findById(id).orElse(null);

        if (s == null) {
            return null; // id nahi mila to null (ya error throw kar sakte ho)
        }

        s.setName(name);
        s.setEmail(email);

        return studentRepo.save(s); // ab updated object save kar rahe ho
    }

}
