package OOPS_IN_JAVA.IntanceVariableInJava;

public class Main {
    int x=10; //instance variable

    public static void main(String[] args) {
        int y=10; //local variable of main method
        System.out.println(y); //10
        Main obj = new Main();
        System.out.println(obj.x);
    }
}
