package com.xworkz.assignment.dto.addtopic;

import java.io.Serializable;

public class AddTopicDTO implements Serializable{
	
	
         /**
	 * 
	 */
	private static final long serialVersionUID = -7775661729599642754L;
		private String topicName;
         
         public AddTopicDTO() {
			System.out.println("Created:"+this.getClass().getSimpleName());
		}
         
        
		public String getTopicName() {
			return topicName;
		}


		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}


		@Override
		public String toString() {
			return "AddTopicDTO [topicName=" + topicName + "]";
		}


		
        
}
