package oops2;

class EmployeeDetails{
	String department;
	String managerName;
	int floor;
	String project;
	
	String getProject() {
		return project;
	}
}

class EmployeeDetailsPlus extends EmployeeDetails{
	
	int incentives;
	
}

class A{
	
	EmployeeDetails getEmployeeDetails() {
		EmployeeDetails details = new EmployeeDetails();
		details.department = "IT";
		details.managerName = "Ram Kumar";
		details.floor = 10;
		details.project = "Space Project";
		return details;
	}
	
}

class B extends A{
	
	@Override
	EmployeeDetailsPlus getEmployeeDetails() {
		EmployeeDetailsPlus details = new EmployeeDetailsPlus();
		details.department = "IT";
		details.managerName = "Ram Kumar";
		details.floor = 10;
		details.project = "Space Project";
		details.incentives = 100;
		return details;
	}
	
}

public class CovariantTypeDemo {

	public static void main(String[] args) {
		
		

	}

}
