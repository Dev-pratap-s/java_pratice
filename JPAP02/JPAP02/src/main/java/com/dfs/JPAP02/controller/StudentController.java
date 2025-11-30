package com.dfs.JPAP02.controller;

import com.dfs.JPAP02.repo.StudentRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentRepo studentRepo;



}
