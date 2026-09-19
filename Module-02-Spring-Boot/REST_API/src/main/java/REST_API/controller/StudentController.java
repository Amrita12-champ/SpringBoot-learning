package REST_API.controller;
import REST_API.entity.Student;
import REST_API.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<List<Student>> allData() {
        List<Student> list = null;
        try {
            list = ss.getAllStudent();
            if (list.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.of(Optional.of(list));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.IM_USED).build();
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){
        Student s1=null;
        try{
            s1=ss.getStudentWithId(id);
            return ResponseEntity.of(Optional.of(s1));
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
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