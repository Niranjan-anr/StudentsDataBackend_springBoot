package com.example.projbackendforstudentsdata.Controller;

import com.example.projbackendforstudentsdata.Service.StudentServiceLayer;
import com.example.projbackendforstudentsdata.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("Data")
public class StudentDataController {
    @Autowired
    StudentServiceLayer service;
    @GetMapping("All")
    public List<Student> AllStudentsData(){
        return service.getAllSudents();
    }
    @PostMapping("Add")
    public String AddStudent(@RequestBody Student student){
        return service.AddStudentData(student);
    }
}
