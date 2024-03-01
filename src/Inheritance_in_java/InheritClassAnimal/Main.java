package Inheritance_in_java.InheritClassAnimal;

public class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "Bruno";
        labrador.eat= "Chicken";
        labrador.display();
        labrador.eat();
        Cat munni = new Cat();
        munni.name= "meiaww";
        munni.eat = "cerolex";
        munni.display();
        munni.eat();
    }
}
