package com.xworkz.assignment.entities.addcourse;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="course_table")
public class AddCourseEntity implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -2128219455511497263L;

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "COURSE_NAME")
	private String courseName;

	public AddCourseEntity() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "AddCourseEntity [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

	
}
