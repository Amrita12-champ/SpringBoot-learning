package REST_API.service;

import REST_API.entity.Student;

import java.util.List;


public interface StudentService {
    String createStudent(Student s);
    List<Student> getAllStudent();
    Student getStudentWithId(int id);

     boolean updateStudent( int id,Student s);
      boolean deleteStudent(int id);


}
