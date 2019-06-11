package com.xworkz.assignment.dto.createAssignment;

import java.io.Serializable;
import java.util.Date;

public class CreateAssignmentDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 546785551957354964L;

	
	private int aId;
	private String course;
	private String topic;
	private String desc;
	private Date date;
	private String uploadType;
	private String pin;
	
	public CreateAssignmentDTO() {
	      System.out.println("Created:"+this.getClass().getSimpleName());
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "CreateAssignmentEntity [aId=" + aId + ", course=" + course + ", topic=" + topic + ", desc=" + desc + ", date="
				+ date + ", uploadType=" + uploadType + ", pin=" + pin + "]";
	}
	
	 
	
	
	
	
}
