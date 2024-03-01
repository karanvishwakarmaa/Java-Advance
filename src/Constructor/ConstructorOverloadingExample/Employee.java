package Constructor.ConstructorOverloadingExample;

public class Employee {
    String empID;
    String Name;
    double salary;
    //zero argument construcctor
    public Employee() {
        empID = "Emp-0022";
        Name = "Karann";
        salary= 50000.00;
    }
    //overloaded parameterized constructor
    public Employee(String empID, String Name, double salary) {
        this.empID = empID;
        this.Name = Name;
        this.salary= salary;
    }
    public void showDetails() {
        System.out.println("Employee Id :"+empID);
        System.out.println("Employee Name :"+Name);
        System.out.println("Salary is :"+salary);

    }

    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.showDetails();
        Employee emp2=new Employee("Emp-02", "Dinesh", 40000.00);
        emp2.showDetails();
    }
}
