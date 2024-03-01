package SuperKeywordInJava.Ques25;

public class Dog extends Animals{
    @Override
    void eat() {
//        super.eat();
        System.out.println("Eating bread....");
    }
    void bark() {
        System.out.println("Barking....");
    }
    void work() {
        super.eat();
        bark();
    }
}
