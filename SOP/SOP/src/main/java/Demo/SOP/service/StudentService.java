package Demo.SOP.service;

import Demo.SOP.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String getStudentData(){
        return studentRepo.getStudent();
    }
}
