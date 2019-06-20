package com.xworkz.assignment.entities.addtopic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "topic_table")
public class AddTopicEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4477952383850460886L;
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="TOPIC_ID")
	private int topicId;
	@Column(name="TOPIC_NAME")
	private String topicName;

	@Column(name="COURSE_ID")
	private String CourseId;
	
	public AddTopicEntity() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	@Override
	public String toString() {
		return "AddTopicEntity [topicId=" + topicId + ", topicName=" + topicName +", courseId=" + CourseId+ "]";
	}

	

}
