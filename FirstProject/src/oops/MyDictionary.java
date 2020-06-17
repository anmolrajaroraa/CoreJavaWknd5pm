package oops;

import java.util.HashMap;

class Student extends Object{
	static String[] nonMedOptionalSubjects = {"PhD", "ED", "French", "Music", "AI"};
	static String[] commerceOptionalSubjects = {"IP"};
	byte enrollment_no;
	String name;
	byte classLevel;
	String fatherName;
	String address;
	long contact;
	String stream;
	HashMap<String, Integer> subjectsWiseMarks = new HashMap<>();
	
	public void printMarks() {
		System.out.println(subjectsWiseMarks);
		if(stream.equals("non-med")) {
			System.out.println("Marks in english are " + subjectsWiseMarks.get("English"));
			System.out.println("Marks in physics are " + subjectsWiseMarks.get("Physics"));
			System.out.println("Marks in chemistry are " + subjectsWiseMarks.get("Chemistry"));
			System.out.println("Marks in computer science are " + subjectsWiseMarks.get("CS"));
			System.out.println("Marks in maths are " + subjectsWiseMarks.get("Maths"));
			
			for(String subject : nonMedOptionalSubjects) {
				if(subjectsWiseMarks.get(subject) != null) {
					System.out.println("Marks in " + subject + " are " + subjectsWiseMarks.get(subject));
				}
			}
		}
		else if(stream.equals("commerce")) {
			for(String subject : commerceOptionalSubjects) {
				if(subjectsWiseMarks.get(subject) != null) {
					System.out.println("Marks in " + subject + " are " + subjectsWiseMarks.get(subject));
				}
			}
		}
		else {
			System.out.println("Stream not available!!");
		}
		
	}

	@Override
	public String toString() {
		return "Student [enrollment_no=" + enrollment_no + ", name=" + name + ", classLevel=" + classLevel
				+ ", fatherName=" + fatherName + ", address=" + address + ", contact=" + contact + ", stream=" + stream
				+ ", subjectsWiseMarks=" + subjectsWiseMarks + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Roll no : " + enrollment_no + ", Name : " + name + ", Class : " + classLevel +
//				", Stream : " + stream + ", Marks : " + subjectsWiseMarks;
//	}
	
	
	
}

public class MyDictionary {

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.enrollment_no = 1;
		obj1.name = "Ram";
		obj1.fatherName = "Ramu";
		obj1.address = "Delhi";
		obj1.contact = 100;
		obj1.classLevel = 11;
		obj1.stream = "non-med";
		obj1.subjectsWiseMarks.put("English", 85);
		obj1.subjectsWiseMarks.put("Physics", 75);
		obj1.subjectsWiseMarks.put("Chemistry", 65);
		obj1.subjectsWiseMarks.put("CS", 55);
		obj1.subjectsWiseMarks.put("Maths", 45);
		obj1.subjectsWiseMarks.put("PhD", 35);
		obj1.printMarks();
		
		System.out.println(obj1);
		
		Student obj2 = new Student();
		obj2.enrollment_no = 2;
		obj2.name = "Shyam";
		obj2.classLevel = 11;
		obj2.stream = "commerce";
		obj2.subjectsWiseMarks.put("IP", 85);
		obj2.printMarks();
		
		System.out.println(obj2);
	}

}
