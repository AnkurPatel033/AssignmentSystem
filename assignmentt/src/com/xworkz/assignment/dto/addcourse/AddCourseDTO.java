package com.xworkz.assignment.dto.addcourse;

import java.io.Serializable;

public class AddCourseDTO implements Serializable{
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -2128219455511497263L;
		private String courseName;
         
         public AddCourseDTO() {
			System.out.println("Created:"+this.getClass().getSimpleName());
		}
         
         public String getCourseName() {
			return courseName;
		}
         
         public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		@Override
		public String toString() {
			return "AddTopicDTO [courseName=" + courseName + "]";
		}
         
        
}
