package MethodWithParameter;

public class Demo {
    //method defination
    void fun1(int i){ //int type parameter, here i variable will act as local variable
        System.out.println("inside fun1 of Demo");
        System.out.println("the value of i is : "+i);
    }
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        byte x=20;
//method call
        d1.fun1(x); // any compatible to int we can pass as an argument.(implicit typecasting)
//d1.fun1(10);
        double n1=100.00;
//d1.fun1(n1); //Error
//d1.fun1((int)n1); //valid
    }

}
