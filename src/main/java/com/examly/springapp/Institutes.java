package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Institute")
public class Institutes {
    @Id
    private int iid;
    private String iname;
    
    public Institutes() {
    }

    public Institutes(int iid, String iname) {
        this.iid = iid;
        this.iname = iname;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    

    
}
