package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Institutes")
public class Institutes {
    @Id
    private int instituteId;
    private String instituteName;
    private String instituteDescription;
    private String instituteAddress;
    private String mobile;
    private String email;
    
	public Institutes() {
		
	}
	
	public Institutes(int instituteId, String instituteName, String instituteDescription, String instituteAddress,
			String mobile, String email) {
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.instituteDescription = instituteDescription;
		this.instituteAddress = instituteAddress;
		this.mobile = mobile;
		this.email = email;
	}

	public int getInstituteId() {
		return instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public String getInstituteDescription() {
		return instituteDescription;
	}
	public String getInstituteAddress() {
		return instituteAddress;
	}
	public String getMobile() {
		return mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public void setInstituteDescription(String instituteDescription) {
		this.instituteDescription = instituteDescription;
	}
	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
