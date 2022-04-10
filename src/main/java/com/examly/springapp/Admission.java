package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admission")
public class Admission {

	@Id
	private int aid;
	private String aname;
	
	
	public Admission() {
		super();
	}

	public Admission(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}

	public int getAid() {
		return aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
}
