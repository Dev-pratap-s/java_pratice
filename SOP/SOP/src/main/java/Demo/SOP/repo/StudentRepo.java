package Demo.SOP.repo;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
    public String getStudent(){
        return "hello dev";
    }
}
