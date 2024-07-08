package Test;
class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void giveRaise(double raiseAmount) {
        if (raiseAmount > 0) {
            salary += raiseAmount;
            System.out.println(name + "'s salary has been increased by $" + raiseAmount);
        } else {
            System.out.println("Invalid raise amount. Salary remains unchanged.");
        }
    }
}