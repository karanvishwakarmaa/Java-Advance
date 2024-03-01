package ObjectCollaboration.CollaboratingClassesAndObjects;

import ObjectCollaboration.Employee;

public class Employe {
    String empID;
    String empName;
    double Salary;
    Address address = new Address();
    public void showDetails() {
        System.out.println("Employee ID :"+empID);
        System.out.println("Employee Name :"+empName);
        System.out.println("Employee Salary :" +Salary);
        System.out.println("Employee Address :");
        address.printAddress();
    }
    public static void main(String[] args){
        Employe emp1 = new Employe();
        emp1.showDetails();
        Employe emp2 = new Employe();
        emp2.empID = "Emp-01";
        emp2.empName = "Ramesh";
        emp2.Salary = 50000;
        emp2.address.city = "Coimbator";
        emp2.address.state = "Tamilnadu";
        emp2.address.pincode = "434322";
        emp2.showDetails();
    }
}
