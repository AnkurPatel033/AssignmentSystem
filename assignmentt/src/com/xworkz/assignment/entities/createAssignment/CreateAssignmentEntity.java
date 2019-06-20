package com.xworkz.assignment.entities.createAssignment;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.xworkz.assignment.entities.assignis.AssignisEntity;


@Entity
@Table(name="create_assign_table")
public class CreateAssignmentEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 546785551957354964L;
	
	/*@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="ASSIGN_ID")
	private int aId;*/
	@Column(name="COURSE")
	private String course;
	@Column(name="TOPIC")
	private String topic;
	@Column(name="DESCRIPTION")
	private String desc;
	@Column(name="DEADLINE")
	private Date date;
	@Column(name="UPLOAD_TYPE")
	private String uploadType;
	@Id
	@Column(name="PIN")
	private long pin;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="PIN") //////////////////////error
	private List<AssignisEntity> emails;
	
	
	public CreateAssignmentEntity() {
	      System.out.println("Created:"+this.getClass().getSimpleName());
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

	public void setPin(long pin) {
		this.pin = pin;
	}
	public long getPin() {
		return pin;
	}
	
	public List<AssignisEntity> getEmails() {
		return emails;
	}
	public void setEmails(List<AssignisEntity> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return " course=" + course + ", topic=" + topic + ", desc=" + desc
				+ ", date=" + date + ", uploadType=" + uploadType + ", pin=" + pin ;
	}
	
}
