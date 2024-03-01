package ObjectCollaboration.Has_A_RelationshipBetweenTwoObjects;

public class Address {
    String city;
    String State;
    String Pincode;
    public static void main(String[] args){
        Employees emp1 = new Employees();
        System.out.println(emp1); //Employee object hashcode i.e Employee@323232
        System.out.println(emp1.empID); // null
        System.out.println(emp1.empName); // null
        System.out.println(emp1.Salary); // 0.0
        System.out.println(emp1.address); // null
        Employees emp2 = new Employees();
        emp2.empID = "Emp-01";
        emp2.empName = "Ram";
        emp2.Salary = 60000.00;
        emp2.address = new Address();
        emp2.address.city = "Coimbator";
        emp2.address.State = "Tamilnadu";
        emp2.address.Pincode = "434322";
        System.out.println(emp2.empID); // Emp-01
        System.out.println(emp2.empName); // Ram
        System.out.println(emp2.Salary); // 60000.00
        System.out.println(emp2.address); //Address object hashcode i.e Address@232423
        System.out.println(emp2.address.city); //Coimbator
        System.out.println(emp2.address.State); //Tamilnadu
        System.out.println(emp2.address.Pincode); //434322
    }
}
