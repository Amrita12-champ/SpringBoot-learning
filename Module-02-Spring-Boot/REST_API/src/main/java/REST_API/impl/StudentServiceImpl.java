package REST_API.impl;
import REST_API.entity.Student;
import REST_API.repository.StudentRepo;
import REST_API.service.StudentService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    public StudentServiceImpl(StudentRepo sr) {
        this.sr = sr;
    }

//    List<Student> students=new ArrayList<Student>();
    StudentRepo sr;

    @Override
    public List<Student> getAllStudent() {

        return (List<Student>) sr.findAll();
    }

    @Override
    public Student getStudentWithId(int id) {
        Optional<Student> s=sr.findById(id);
        return s.get();
    }

    @Override
    public String createStudent(Student s) {
//        students.add(s);
        sr.save(s);
        return "Registration Completed Successfully";
    }

    @Override
    public boolean updateStudent(int id, Student s) {
        Optional<Student> s2=sr.findById(id);
        Student s3=s2.get();
        s3=s;
        Student t=sr.save(s3);
        return true;
    }

    @Override
    public boolean deleteStudent(int id) {
//        students.remove(getStudentWithId(id));
//        students.removeIf(x->x.getId()==id);
        sr.deleteById(id);
        return true;
    }
}
