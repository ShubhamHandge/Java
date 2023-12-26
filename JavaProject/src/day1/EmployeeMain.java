package day1;

public class EmployeeMain {

	public static void main(String[] args) {
		// Assiging values for the object referred by 'emp'

		Employee emp = new Employee();
		emp.employeeId = 1;
		emp.employeeName = "SHUBH";
		emp.employeeSalary = 111.345f;
		
		
		System.out.println("Employee ID: "+ emp.employeeId);
		System.out.println("Employee Name: "+emp.employeeName);
		System.out.println("Employee Salary:  $" + emp.employeeSalary);

	}

}
