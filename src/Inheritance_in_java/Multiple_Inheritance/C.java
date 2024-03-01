package Inheritance_in_java.Multiple_Inheritance;

public class C extends B{ //suppose extendA,B in class C thenif it were,compilition error//
    public static void main(String[] args) {
        C obj= new C();
        obj.msg();//now which msg() method would be invoked
    }
}
