package com.bmpl.Phoenix.Basic;

import java.util.ResourceBundle;

class MyStudent{
	private byte rollNo;
	private String name;
	private String courseName;
	private byte courseDuration;
	private int fees;
	private static String collegeName; // -> 20 bytes storage
	// -> 100 students -> one time -> 20  bytes
	// static means this variable is not binded with any object
	// it gets binded with the class, but why
	// because static is loaded when class is loaded
	// at that time there is no object present so the only thing
	// static can be binded with is the class in which it is present
	
	// getter
	public byte getRollNo(){
		return rollNo;
	}
	
	public String getName() {
		return name;
	}

	//setter
	public void setName(String name) {
		if(name.length() > 0) {
			this.name = name;
		}
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		if(courseName.length() > 0) this.courseName = courseName;
	}

	public byte getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = (byte) courseDuration;
	}
	
	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	static{
//		fees = 10000;
//		System.out.println("Fees set...");
		ResourceBundle rb = ResourceBundle.getBundle("config");
		collegeName = rb.getString("collegeName");
	}
	
	// init block
	// it runs always before the constructor
	// all the init blocks will run in order irrespective of their position
	// relative to cons
	{
//		fees = 10000;
//		System.out.println("Fees set...");
//		ResourceBundle rb = ResourceBundle.getBundle("config");
//		collegeName = rb.getString("collegeName");
	}

	// default constructor
	// parameterized constructor
	// overloaded parameterized constructor - signature should be different
	public MyStudent(int rollNo, String name, String courseName, int courseDuration) {
		this();
		System.out.println("Cons called...");
		if(name == null) {
			name = "";
		}
		if(rollNo > 0 && name.length() > 0) {
			this.rollNo = (byte) rollNo;
			this.name = name;
			this.courseName = courseName;
			this.courseDuration = (byte) courseDuration;
		}
	}
	
	public MyStudent(int rollNo, String name) {
		this(rollNo, name, null, 0);
	}
	
	private MyStudent() {
		fees = 10000;
	}
	
//	{
//		int scholarship = 1000;
//		fees -= scholarship;
//		System.out.println("Fees reduced..");
//	}
	
//	public void MyStudent(int rollNo, String name, String courseName, int courseDuration) {
//		if(name == null) {
//			name = "";
//		}
//		if(rollNo > 0 && name.length() > 0) {
//			this.rollNo = (byte) rollNo;
//			this.name = name;
//			this.courseName = courseName;
//			this.courseDuration = (byte) courseDuration;
//		}
//	}

	// just suppose for now that this fn can be called only once
//	void takeInput(int rollNo, String name, String courseName, int courseDuration) {
//		this.rollNo = (byte) rollNo;
//		this.name = name;
//		this.courseName = courseName;
//		this.courseDuration = (byte) courseDuration;
//	}
	
//	void takeInput(int rno, String studentName, String course, int duration) {
//		roll_no = (byte) rno;
//		name = studentName;
//		courseName = course;
//		courseDuration = (byte) duration;
//	}
	
	void showDetails() {
		System.out.println("student roll no is " + rollNo);
		System.out.println("student name is " + name);
		System.out.println("student has enrolled in " + courseName);
		System.out.println("student will complete the course in " + courseDuration + " months");
		System.out.println("fees is " + fees);
		System.out.println("College name is " + collegeName);
	}
}

public class OOPSDemo2 {
	
	public static void main(String[] args) {
		
		{
			System.out.println();
		}
		
//		MyStudent.collegeName = "JDMC";
//		System.out.println("College name is " + MyStudent);
		
//		MyStudent student = new MyStudent(101, null, "Core Java", 4);
		MyStudent student = new MyStudent(101, "Ram");
		student.setFees(0);
//		MyStudent studentNoOne = new MyStudent
		
//		student.takeInput(101, "Ram", "Core Java", 4);
//		student.roll_no = 102;
//		student.name = "";
//		student.setName("Ram Kumar");
//		student.setCourseName("Advance Java");
//		student.setCourseDuration(3);
		student.showDetails();
//		student.takeInput(0, "", "", 0);
		System.out.println(student.getRollNo());
		System.out.println(student.getName());
		// Student refers to the type of object that will be pointed to by student variable
		// student is a variable that points to the newly created object on the right hand
		// side of equation
		// new keyword allocates or creates memory space for the new object to be created
		// Student() is a call to the constructor which will initialize all the member variables
		// (variables created inside the class)
		
//		System.out.println("student roll no is " + student.roll_no);
//		System.out.println("student name is " + student.name);
//		System.out.println("student has enrolled in " + student.courseName);
//		System.out.println("student will complete the course in " + student.courseDuration + " months");
		
//		student.roll_no = 101;
//		student.name = "Ram";
//		student.courseName = "Core Java";
//		student.courseDuration = 4;
//		
//		System.out.println("*************************************");
//		
//		System.out.println("student roll no is " + student.roll_no);
//		System.out.println("student name is " + student.name);
//		System.out.println("student has enrolled in " + student.courseName);
//		System.out.println("student will complete the course in " + student.courseDuration + " months");
		
		System.out.println("*************************************");
		MyStudent student2 = new MyStudent(102, "Shyam", "Advance Java", 3);
//		student2.takeInput(102, "Shyam", "Advance Java", 3);
//		student2.roll_no = 102;
//		student2.name = "Shyam";
//		student2.courseName = "Advance Java";
//		student2.courseDuration = 3;
		
		student2.showDetails();
//		System.out.println("student2 roll no is " + student2.roll_no);
//		System.out.println("student2 name is " + student2.name);
//		System.out.println("student2 has enrolled in " + student2.courseName);
//		System.out.println("student2 will complete the course in " + student2.courseDuration + " months");
	
		System.out.println(student2);
	}

}
