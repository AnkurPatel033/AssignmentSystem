package com.xworkz.assignment.entities.signup;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="reg_table")
public class SignUpEntity implements Serializable {	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -5204963170014645633L;
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="P_ID")
	private int pId;
	@Column(name="F_NAME")
	private String fname;
	@Column(name="L_NAME")
	private String lname;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PH_NUM")
	private long phNo;
	@Column(name="PASSWORD")
	private String pass;
	@Column(name="STATUS")
	private int status;
	

	public SignUpEntity() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
	public long getPhNo() {
		return phNo;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getPass() {
		return pass;
	}

	public int getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "SignUpEntity [pId=" + pId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phNo="
				+ phNo + ", pass=" + pass + ", status=" + status + "]";
	}

	
	
	
}
