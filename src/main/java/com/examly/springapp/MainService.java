package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {
    
    @Autowired
    private CourseRepository cr;
    @Autowired
    private InstitutesRepository ir;
    @Autowired
    private StudentRepository sr;
    @Autowired
    private AdmissionRepository ar;
   
    public void add(Course c)
    {
        cr.save(c);
    }

    public void edit(Course c)
    {
       cr.save(c);
    }

    public void delete(int cid)
    {
        cr.deleteById(cid);
    }

    public List<Course> getAll()
    {
        List<Course> p = new ArrayList<Course>();
        cr.findAll().forEach(p::add);
        return p;
    }

    public void addIns(Institutes i)
    {
        ir.save(i);
    }

    public Institutes editIns(Institutes i)
    {
        return ir.save(i);
    }

    public void deleteIns(int iid)
    {
        ir.deleteById(iid);
    }

    public List<Institutes> getAllIns()
    {
        List<Institutes> p = new ArrayList<Institutes>();
        ir.findAll().forEach(p::add);
        return p;
    }
    
    public void addStu(Student s)
    {
        sr.save(s);
    }

    public Student editStu(Student s)
    {
        return sr.save(s);
    }

    public void deleteStu(int sid)
    {
        sr.deleteById(sid);
    }

    public List<Student> getAllStu()
    {
        List<Student> p = new ArrayList<Student>();
        sr.findAll().forEach(p::add);
        return p;
    }
    
    public void addAdm(Admission a)
    {
        ar.save(a);
    }

    public void editAdm(Admission a)
    {
        ar.save(a);
    }

    public void deleteAdm(int aid)
    {
        ar.deleteById(aid);
    }

    public List<Admission> getAllAdm()
    {
        List<Admission> p = new ArrayList<Admission>();
        ar.findAll().forEach(p::add);
        return p;
    }
}

