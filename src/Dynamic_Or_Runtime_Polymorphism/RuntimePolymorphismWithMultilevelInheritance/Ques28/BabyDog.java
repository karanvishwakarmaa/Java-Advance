package Dynamic_Or_Runtime_Polymorphism.RuntimePolymorphismWithMultilevelInheritance.Ques28;

public class BabyDog extends Dog{
    @Override
    void eat() {
//        super.eat();
        System.out.println("Drinking milk");
    }
}
