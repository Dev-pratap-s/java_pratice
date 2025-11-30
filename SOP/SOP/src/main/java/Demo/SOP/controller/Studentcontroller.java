package Demo.SOP.controller;

import Demo.SOP.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Studentcontroller {

    @Autowired
    StudentService service;

    @GetMapping("/welcome")
    public String dataFetchFromdb(){
        return service.getStudentData();
    }

}
