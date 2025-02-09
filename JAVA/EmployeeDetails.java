// Wap to display the employee details of 5 employees using scanner class. 

import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    String empDepartment;
    double empSalary;
    // Constructor to initialize employee details
    public Employee(int empId, String empName, String empDepartment, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empDepartment);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println();
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5]; // Array to store employee objects

        // Input employee details
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // To consume the newline left by nextInt()

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Employee Department: ");
            String empDepartment = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double empSalary = sc.nextDouble();
            sc.nextLine(); // To consume the newline left by nextDouble()

            // Creating an Employee object and storing it in the array
            employees[i] = new Employee(empId, empName, empDepartment, empSalary);
        }
        // Displaying details of all employees
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Employee " + (i + 1) + " Details:");
            employees[i].displayDetails();
        }
        sc.close();
    }
}
