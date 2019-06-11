package com.xworkz.assignment.entities.audit;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="audit_table")
public class AuditEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5204963170014645633L;
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="AUDIT_ID")
	private int aId;
	@Column(name="EMAIL")
	private String email;
	@Column(name="ENTITY")
	private String entity;
	@Column(name="PROPERTY")
	private String property;
	@Column(name="OLD_VALUE")
	private String oldValue;
	@Column(name="NEW_VALUE")
	private String newValue;
	@Column(name="DATE")
	private String date;
	@Column(name="SYSTEM")
	private int system;
	

	public AuditEntity() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}


	public int getaId() {
		return aId;
	}


	public void setaId(int aId) {
		this.aId = aId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEntity() {
		return entity;
	}


	public void setEntity(String entity) {
		this.entity = entity;
	}


	public String getProperty() {
		return property;
	}


	public void setProperty(String property) {
		this.property = property;
	}


	public String getOldValue() {
		return oldValue;
	}


	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}


	public String getNewValue() {
		return newValue;
	}


	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getSystem() {
		return system;
	}


	public void setSystem(int system) {
		this.system = system;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "AuditEntity [aId=" + aId + ", email=" + email + ", entity=" + entity + ", property=" + property
				+ ", oldValue=" + oldValue + ", newValue=" + newValue + ", date=" + date + ", system=" + system + "]";
	}

	
	
	
	
}
