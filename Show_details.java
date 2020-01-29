
public class Show_details {

	
	public static void main(String[] args) {
		Employee e1 = new Employee("ABC","web","S.E","BTECH");
		e1.setSalary(500);
		Personal_details p1 = new Personal_details("Mohali",21,"9872508773");
		System.out.println("Employee name:" + e1.name);
		System.out.println("Employee Designation:" + e1.designation);
		System.out.println("Employee Salary:" + e1.getSalary());
		System.out.println("Employee age:" + Personal_details.age);
		System.out.println("Employee address:" + p1.address);
		New_salary n1 = new New_salary();
		n1.getSalary();
		
		
	    
		
		
	}

}
