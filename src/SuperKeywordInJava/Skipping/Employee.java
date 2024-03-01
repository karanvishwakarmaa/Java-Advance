package SuperKeywordInJava.Skipping;

public class Employee extends Person{
    float salary;
    Employee(int id, String name, float salary) {
        super(id,name); // reusing parent constructor
        this.salary=salary;
    }
    void display() {
        System.out.println(id+ " name of person is: "+name+" and salary is :"+salary);
    }
}
