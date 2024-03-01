package SuperKeywordInJava.Ques24;

public class Dog extends Animals{
    String color= "black";
    void printColor() {
        System.out.println(color); //print color of dog color
        System.out.println(super.color);//prints color of animal class
    }
}
