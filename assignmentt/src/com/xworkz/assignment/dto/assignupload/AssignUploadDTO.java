package com.xworkz.assignment.dto.assignupload;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class AssignUploadDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8858346720251048939L;
	private int id;
	private int pin;
	private String email;
	private long cNo;
	private MultipartFile file;
	private String url;
	
	public AssignUploadDTO() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getcNo() {
		return cNo;
	}

	public void setcNo(long cNo) {
		this.cNo = cNo;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "AssignUploadDTO [pin=" + pin + ", email=" + email + ", cNo=" + cNo + ", file=" + file + ", url=" + url
				+ "]";
	}
	
	
	
	
	
	

}
