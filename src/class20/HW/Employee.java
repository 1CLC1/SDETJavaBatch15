package class20.HW;

public class Employee {
   /* 2. Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should
    have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add
    some features and methods to the Tester Class.
    Test your code!
    */

    String name;
    int employeeId;


    Employee(String name, int employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
    void employeeInfo(){
        System.out.println("Name: "+name+" Employee ID: "+employeeId);
    }
}
class FullTime extends Employee {
    int salary;

    FullTime(String name, int employeeId, int salary){
        super(name, employeeId);
        this.salary=salary;
    }
    void displayInfo(){
        System.out.println("Salary: "+salary);
    }
}
class PartTime extends Employee{
    int hours;
    String daysOfTheWeek;

    PartTime(String name, int employeeId, int salary, int hours, String daysOfTheWeek){
        super(name, employeeId);
        this.hours=hours;
        this.daysOfTheWeek=daysOfTheWeek;
    }
    void partTimeInfo(){
        System.out.println("Number of hours: "+hours+" Days of the week: "+daysOfTheWeek);
    }
}
class EmployeeTester extends FullTime{
    int overtimePay;

    EmployeeTester(String name, int employeeId, int salary, int overtimePay){
        super(name, employeeId, salary);
        this.overtimePay=overtimePay;
    }
    void overtimePayInfo(){
        System.out.println("Overtime pay: "+overtimePay);
    }

    public static void main(String[] args) {
        EmployeeTester employee1=new EmployeeTester("Steve",4378534, 100000,60);
        employee1.employeeInfo();
        employee1.displayInfo();
        employee1.overtimePayInfo();
        System.out.println("---------------------------------------------");
        EmployeeTester employee2=new EmployeeTester("Daryl",6724478,100000,60);
        employee2.employeeInfo();
        employee2.displayInfo();
        employee2.overtimePayInfo();
        System.out.println("---------------------------------------------");
        PartTime ptEmployee1=new PartTime("Davis",2847332,40000,4,"Monday, Wednesday, Friday");
        ptEmployee1.employeeInfo();
        ptEmployee1.partTimeInfo();
        System.out.println("---------------------------------------------");
        PartTime ptEmployee2=new PartTime("Susan",2642496,40000,4,"Tuesday, Thursday, Saturday");
        ptEmployee2.employeeInfo();
        ptEmployee2.partTimeInfo();
    }
}
