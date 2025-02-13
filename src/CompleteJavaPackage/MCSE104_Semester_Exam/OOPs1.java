package CompleteJavaPackage.MCSE104_Semester_Exam;

class Shape {
    String color;
}

class Triangle extends Shape{

}

public class OOPs1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
