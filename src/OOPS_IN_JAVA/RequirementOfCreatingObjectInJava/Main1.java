package OOPS_IN_JAVA.RequirementOfCreatingObjectInJava;

public class Main1 {
    int x=10;

    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.x=50;
        System.out.println(obj1.x); //50
        obj1 = null; //here garbage collector will destroy the demo object
        System.out.println(obj1.x); //nullPointerException
    }
}
