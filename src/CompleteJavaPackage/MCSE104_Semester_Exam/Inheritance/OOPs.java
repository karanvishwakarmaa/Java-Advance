package CompleteJavaPackage.MCSE104_Semester_Exam.Inheritance;


class Shape{
    public void area(){
        System.out.println("displayed Area");
    }
}

class Triangle extends Shape{
    public void area(int length, int height){
        System.out.println("The Area Of Triangle is :"+(0.5)*length*height);
    }
}

//class EquilateralTriangle extends Triangle{
//    public void area(int  l, int h){
//        System.out.println(1/2*l*h);
//    }
//}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(12,24);
//        t1.area();

        Circle c1= new Circle();
        c1.area(12);
    }


}
