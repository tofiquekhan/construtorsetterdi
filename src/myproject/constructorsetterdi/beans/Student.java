package myproject.constructorsetterdi.beans;

public class Student {

	private String sid;
	private String sname;
	private String saddr;
	
	
	  public Student(String sid,String sname,String saddr) { 
		  this.sid = sid;
		  this.sname = sname; 
		  this.saddr = saddr; 
		  System.out.println("--------------------Constructor Dependency Injection -----------------------");
	  }
	 
	
	

	public String getSid() {
		
		return sid;
	}

	public void setSid(String sid) {
		System.out.println("--------------Setter Method Dependency Injection----------------");
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	
	public void getStudentDetails() {
		System.out.println("Student Detials");
		System.out.println("------------------------------------");
		System.out.println("Student id 		: "+sid);
		System.out.println("Student Name 	: "+sname);
		System.out.println("Student Address : "+saddr);
	}
}
