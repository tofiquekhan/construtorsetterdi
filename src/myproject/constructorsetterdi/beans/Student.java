package myproject.constructorsetterdi.beans;

public class Student {

	private String sid;
	private String sname;
	private String saddr;
	
	public Student(String sid,String sname,String saddr) {
		this.sid = sid;
		this.sname = sname;
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
