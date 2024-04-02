import java.util.Scanner;


abstract class Employee {

    Scanner sc=new Scanner(System.in);

     String name;
     int id;

    public Employee(String name,int id) {
        this.name=name;
        this.id=id;
    }
    abstract double calculatePay();

    void getEmployDetails() {
        System.out.println("Enter employ name:");
         this.name=sc.next();
        System.out.println("Enter employ id:");
        this.id=sc.nextInt();
    }

    abstract void printDetails();

}

class HourlyEmployee extends Employee {

    double hour, rate,salary=0;
    public HourlyEmployee(String name, int id,double hour,double rate) {
        super(name, id);
        this.hour=hour;
        this.rate=rate;
    }

    double calculatePay() {
        return hour*rate;
         
    }

    public void printDetails() {
        System.out.println("---- Employ details -----");
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Employee salary:"+ hour*rate);
    }

}

class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(String name, int id,double salary) {
        super(name, id);
        this.salary=salary;
    }

    double calculatePay() {
        return salary;
    }

    public void printDetails() {
        System.out.println("---- Employ details -----");
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Employee salary:"+salary);
    }
}

public class EmployMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = null;

        while (true) {
            System.out.println("1-HourlyEmployee\n2-SalariedEmployee\n3-Exit\n");
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (employee == null) {
                        employee = new HourlyEmployee("", 0, 0, 0);
                        employee.getEmployDetails(); 
                    }
                    System.out.println("Enter hour");
                    double hour = sc.nextDouble();
                    System.out.println("Enter rate");
                    double rate = sc.nextDouble();
                    employee = new HourlyEmployee(employee.name, employee.id, hour, rate);
                    employee.printDetails();
                    break; 
                case 2:
                    if (employee == null) {
                        employee = new SalariedEmployee("", 0, 0);
                        employee.getEmployDetails(); 
                    }
                    System.out.println("Enter salary");
                    double salary = sc.nextDouble();
                    employee = new SalariedEmployee(employee.name, employee.id, salary);
                    employee.printDetails();
                    break;
                case 3:
                    return;
            }
        }
    }
}