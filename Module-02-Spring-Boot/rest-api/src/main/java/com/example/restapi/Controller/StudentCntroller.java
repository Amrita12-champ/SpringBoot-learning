package com.example.restapi.Controller;

import com.example.restapi.Entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "*")
public class StudentCntroller {

    @RequestMapping(value="/data", method = RequestMethod.GET)
    public Student getStudent(){
        Student s1=new Student();
        s1.setId(1);
        s1.setName("Amrita");
        s1.setAddress("BBSR");
        return s1;
        //return "Hello ! Welcome to home page ";
    }

   @PostMapping("/createStudent")
    public String createStudent(@RequestBody Student s){
        Student s1=s;

        return "Completed ";
   }

}
