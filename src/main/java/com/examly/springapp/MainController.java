package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class MainController {
    
    @Autowired
    public MainService cs;

    @PostMapping("/addcourses")
    public void addCourse(@RequestBody Course c)
    {
        cs.add(c);
    }

    @PutMapping("/editcourses")
    public void editCourse(@RequestBody Course c)
    {
         cs.edit(c);
    }

    @DeleteMapping("/deletecourses/{cid}")
    public void deleteCourse(@PathVariable int cid)
    {
        cs.delete(cid);
    }

    @GetMapping("/viewallcourses")
    public List<Course> getAll()
    {
        return cs.getAll();
    }
    
    @PostMapping("/addInstitute")
    public void addInstitutes(@RequestBody Institutes i)
    {
        cs.addIns(i);
    }

    @PutMapping("/editInstitute")
    public Institutes editInstitutes(@RequestBody Institutes i)
    {
        return cs.editIns(i);
    }

    @DeleteMapping("/deleteinstitutes/{instituteId}")
    public void deleteInstitutes(@PathVariable int instituteId)
    {
        cs.deleteIns(instituteId);
    }

    @GetMapping("/viewInstitutes")
    public List<Institutes> getAllInstitutes()
    {
        return cs.getAllIns();
    }
    
    @PostMapping("/addstudent")
    public void addStudent(@RequestBody Student s)
    {
    	cs.addStu(s);
    }
    
    @PutMapping("/editstudent")
    public void editStudent( @RequestBody Student s)
    {
    	cs.editStu(s);
    }
    
    @DeleteMapping("/deletestudent/{sid}")
    public void deleteStudent(@PathVariable int sid)
    {
        cs.deleteStu(sid);
    }

    @GetMapping("/viewallstudents")
    public List<Student> getAllStudents()
    {
        return cs.getAllStu();
    }
    
    @PostMapping("/addadmission")
    public void addAdmission(@RequestBody Admission a)
    {
    	cs.addAdm(a);
    }
    
    @PutMapping("/editadmission")
    public void editAdmission(@RequestBody Admission a)
    {
    	cs.editAdm(a);
    }
    
    @DeleteMapping("/deleteadmission/{aid}")
    public void deleteAdmission(@PathVariable int aid)
    {
        cs.deleteAdm(aid);
    }

    @GetMapping("/viewalladmissions")
    public List<Admission> getAllAdmission()
    {
        return cs.getAllAdm();
    }
}
