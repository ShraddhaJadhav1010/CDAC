package employee.org;
		import java.util.*;
		import java.util.Scanner;
		class employee{
		private int empid;
		private String name;
		private float salary;
		private String add;
		private String dept;
		public void employeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Employee id : " );
		this.empid = sc.nextInt();
		System.out.println("Employee name : " );
		this.name = sc.next();
		System.out.print("Employee add:" );
		this.add= sc.next();
		System.out.print(" Employee dept :");
		this.dept= sc.next();
		//sc.next();//space or enter catching purpose.
		System.out.print("Employee salary :");
		this.salary = sc.nextFloat();
		//System.out.print("Employee Salary: " );
		}
		public void printDetails(){
		System.out.println(this.empid+ " "
		+this.name+ " " +this.salary+ " " +this.add+ " " +this.dept);
		}
}
public class EmployeeMain {
	public static void main(String[] args) {
		employee emp1 = new employee();
		emp1.employeeDetails();
		emp1.printDetails();
		employee emp2 = new employee();
		emp2.employeeDetails();
		emp2.printDetails();
		}
}
