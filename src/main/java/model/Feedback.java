package model;

public class Feedback {
	private String name;
	private String contactno;
	private String feedback; 
	
	public void setName(String name) {
		this.name = name;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public String getName() {
		return(name);
	}
	public String getContactno() { 
		return(contactno);
	}
	public String getFeedback() {
		return(feedback); 
	}
}
