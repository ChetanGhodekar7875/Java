package Test;

import java.util.Scanner;



public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How Many Employee You Want To Add ?");
        int num=scanner.nextInt();
        Employee[] employees = new Employee[num]; // Create an array to store employee data

        Employee e=null;
        for(int i=0;i<num;i++){
            System.out.println("Enter Employee id");
            int id= scanner.nextInt();
            System.out.println("Enter Employee Name");
            String name= scanner.next();
            System.out.println("Enter Employee Salary");
            double sal= scanner.nextDouble();
            e=new Employee(id,name,sal);
            employees[i]=e;
        }

        while (true) {
            System.out.println("Employee Management System Menu:");
            System.out.println("1. View Employee Information");
            System.out.println("2. Give Raise");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter employee ID: ");
                    int employeeId = scanner.nextInt();
                    boolean found = false;
                    for (Employee employee : employees) {
                        if (employee != null && employee.getEmployeeId() == employeeId) {
                            System.out.println("Employee ID: " + employee.getEmployeeId());
                            System.out.println("Name: " + employee.getName());
                            System.out.println("Salary: $" + employee.getSalary());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 2:
                    System.out.println("Enter employee ID: ");
                    int empId = scanner.nextInt();
                    System.out.println("Enter raise amount: ");
                    double raiseAmount = scanner.nextDouble();
                    found = false;
                    for (Employee employee : employees) {
                        if (employee != null && employee.getEmployeeId() == empId) {
                            employee.giveRaise(raiseAmount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting Employee Management System.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

