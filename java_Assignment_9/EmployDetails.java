public class EmployDetails {
    public static void main(String[] args) {

        Employ employ1=new HourlyEmployee();
        employ1.printSalary(10000);
        Employ employ2=new HourlyEmployee();
        employ2.printSalary(75000);

    }
}
abstract class Employ {
     String name;
     String designation;
     int experience;
     int salary;
     abstract public void printSalary(int salary);
    
}
class HourlyEmployee extends Employ {

    public void printSalary(int salary) {
        System.out.println("HourlyEmployee:"+salary);
     }
}
class SalariedEmployee extends Employ {

    public void printSalary(int salary) {
        System.out.println("SalariedEmployee"+salary);
    }
}