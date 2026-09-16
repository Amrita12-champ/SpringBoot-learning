package REST_API.controller;
import REST_API.entity.Student;
import REST_API.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    private StudentService ss;

    public StudentController(StudentService ss) {
        this.ss = ss;
    }
    @PostMapping("/create")
    public String create(@RequestBody Student s){
        ss.createStudent(s);
        return "success";
    }

    @GetMapping("/allStudents")
    public List<Student> allData(){
        return ss.getAllStudent();
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable int id){
        return ss.getStudentWithId(id);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id,@RequestBody Student s){
        boolean x=ss.updateStudent(id,s);
        if (x) {
            return "success";
        }
        return "Data Not found";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boolean x=ss.deleteStudent(id);
        if (x) {
            return "success";
        }
        return "data Not found";
    }

}