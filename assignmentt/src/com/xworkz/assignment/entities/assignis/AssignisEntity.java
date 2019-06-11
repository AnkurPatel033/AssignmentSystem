package com.xworkz.assignment.entities.assignis;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignis_table")
public class AssignisEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -281779145386324052L;
	
/*	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ASSIGNIS_ID")
	private int assgnisId;*/
	@Column(name = "PIN")
	private Long pin;
	@Id
	@Column(name = "EMAIL")
	private String email;

	public AssignisEntity() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

/*	public int getAssgnisId() {
		return assgnisId;
	}

	public void setAssgnisId(int assgnisId) {
		this.assgnisId = assgnisId;
	}*/

	public Long getPin() {
		return pin;
	}

	public void setPin(Long pin) {
		this.pin = pin;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "AssignisEntity [pin=" + pin + ", email=" + email + "]";
	}

	

}
