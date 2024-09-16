package org.demo.com;

//package Sandeep_Sir.Assignment5;
/*3)     3. Design and implement a class named Employee to manage employee data for a company. The class should include fields to keep track of the total number of employees and the total salary expense, as well as individual employee details such as their ID, name, and salary.
	The class should have methods to:
		• Retrieve the total number of employees (getTotalEmployees())
		• Apply a percentage raise to the salary of all employees (applyRaise(double percentage))
		• Calculate the total salary expense, including any raises (calculateTotalSalaryExpense())
		• Update the salary of an individual employee (updateSalary(double newSalary))
	Understand the problem statement and use static and non-static fields and methods appropriately. Implement static and non-static initializers, constructors, getter and setter methods, and a toString() method to handle the initialization and representation of employee data.
	Write a menu-driven program in the main method to test the functionalities. 
    */

	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Employee {
		private static int totalEmployees = 0;
		private static double totalSalaryExpense = 0.0;
		
		private int id;
		private String name;
		private double salary;
		
		static {
			totalEmployees = 0;
			totalSalaryExpense = 0.0;
		}
		
		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			totalEmployees++;
			totalSalaryExpense += salary;
		}
		
		public static int getTotalEmployees() {
			return totalEmployees;
		}
		
		public static double calculateTotalSalaryExpense() {
			return totalSalaryExpense;
		}
		
		public static void applyRaise(double percentage) {
			double raiseMultiplier = 1 + (percentage / 100);
			totalSalaryExpense *= raiseMultiplier;
		}
		
		public void updateSalary(double newSalary) {
			totalSalaryExpense -= this.salary;
			this.salary = newSalary;
			totalSalaryExpense += this.salary;
		}
		
		@Override
		public String toString() {
			return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
		}

        public int getId() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getId'");
        }
	}

	public class EmployeeManagementSystem {
		private static List<Employee> employees = new ArrayList<>();
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("Menu:");
				System.out.println("1. Add Employee");
				System.out.println("2. Apply Raise to All Employees");
				System.out.println("3. Update Employee Salary");
				System.out.println("4. Display Total Number of Employees");
				System.out.println("5. Display Total Salary Expense");
				System.out.println("6. Display All Employees");
				System.out.println("7. Exit");
				System.out.print("Enter your choice: ");
				
				int choice = scanner.nextInt();
				scanner.nextLine();  // Consume newline
				
				switch (choice) {
					case 1:
						System.out.print("Enter Employee ID: ");
						int id = scanner.nextInt();
						scanner.nextLine();  // Consume newline
						System.out.print("Enter Employee Name: ");
						String name = scanner.nextLine();
						System.out.print("Enter Employee Salary: ");
						double salary = scanner.nextDouble();
						employees.add(new Employee(id, name, salary));
						break;
					case 2:
						System.out.print("Enter percentage raise: ");
						double percentage = scanner.nextDouble();
						Employee.applyRaise(percentage);
						break;
					case 3:
						System.out.print("Enter Employee ID to update salary: ");
						int updateId = scanner.nextInt();
						System.out.print("Enter new salary: ");
						double newSalary = scanner.nextDouble();
						for (Employee emp : employees) {
							if (emp.getId() == updateId) {
								emp.updateSalary(newSalary);
								break;
							}
						}
						break;
					case 4:
						System.out.println("Total number of employees: " + Employee.getTotalEmployees());
						break;
					case 5:
						System.out.println("Total salary expense: " + Employee.calculateTotalSalaryExpense());
						break;
					case 6:
						for (Employee emp : employees) {
							System.out.println(emp);
						}
						break;
					case 7:
						System.out.println("Exiting...");
						scanner.close();
						return;
					default:
						System.out.println("Invalid choice. Please try again.");
				}
			}
		}
	}
