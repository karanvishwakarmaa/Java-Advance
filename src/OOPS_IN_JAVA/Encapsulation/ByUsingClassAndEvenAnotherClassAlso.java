package OOPS_IN_JAVA.Encapsulation;

public class ByUsingClassAndEvenAnotherClassAlso {
    static int i=10;
    public static void fun1() {
        System.out.println("inside fun1 of demo");
    }

    public static void main(String[] args) {
        //using directly
        System.out.println(i);
        fun1();
//by using class name
        System.out.println(ByUsingClassAndEvenAnotherClassAlso.i);
        ByUsingClassAndEvenAnotherClassAlso.fun1();
//using by an object
        ByUsingClassAndEvenAnotherClassAlso obj=new ByUsingClassAndEvenAnotherClassAlso();
        System.out.println(obj.i);
        obj.fun1();

    }
}
