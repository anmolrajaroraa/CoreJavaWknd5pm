package oops2;

class Naukri{
	
}

public class Overloading {
	public void searchJobs(String keyword) {
		System.out.println("Search jobs on basis of keyword from the database");
	}
	public void searchJobs(String keyword, String location) {
		System.out.println("Search jobs on the basis of keyword and location");
	}
	public void searchJobs(String keyword, int minSalary) {
		System.out.println("Search jobs on the basis of keyword and minSalary");
	}
	public void searchJobs(String keyword, String location, int minSalary) {
		System.out.println("Search jobs on the basis of keyword, location and minSalary");
	}
	public String searchJobs(int minSalary) {
		System.out.println("Search jobs on basis of salary from the database");
		return "some message";
	}
	// Overloading means keeping almost same logic for treating all different situations simultaneously
	// In overloading, parameters type or no of parameter should change, 
	// return type can be kept same or it can be changed while you are defining a new overloaded fn
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		obj.searchJobs("xyz");
		obj.searchJobs("Java", 15000);
		obj.searchJobs("Java", "Delhi NCR");
		obj.searchJobs("Java", "Delhi NCR", 15000);

	}

}
