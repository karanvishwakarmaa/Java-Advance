package Inheritance_in_java.Abstract_Animal_implementations;

abstract class Fish implements Animal{
    @Override
    public void move() {
        System.out.println("swimming fish");
    }
}
