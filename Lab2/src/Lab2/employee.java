package Lab2;

public class employee {
	private String name, jobTitle;
	private double salary;
	
	public employee(String name, String jobTitle, double salary) {
	    this.name = name;
	    this.jobTitle = jobTitle;
	    this.salary = salary;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void raiseSalary(double percentage) {
		salary = salary + salary * percentage / 100;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Job Title: " + jobTitle);
		System.out.println("Salary: " + salary);
	}
}
