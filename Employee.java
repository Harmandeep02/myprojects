
public class Employee {
	public String company_name;
	public String name;
	public String designation;
	protected int salary;
	protected String qualification;

	public Employee(String name , String company_name , String designation , String qualification ){
		 this.name = name;
		 this.company_name = company_name;
		 this.designation = designation;
		 this.qualification = qualification;
		 
		 
		
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

}
