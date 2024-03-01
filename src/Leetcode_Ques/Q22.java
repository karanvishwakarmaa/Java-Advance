import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Full Name");
        String name = sc.next();
        System.out.println("Enter Your English Marks");
        double English = sc.nextDouble();
        System.out.println("Enter Your Hindi Marks");
        double Hindi = sc.nextDouble();
        System.out.println("Enter Your Math Marks");
        double Math = sc.nextDouble();
        System.out.println("Enter Your Science Marks");
        double Science = sc.nextDouble();
        System.out.println("Enter Your Social Marks");
        double Social = sc.nextDouble();
        System.out.println("Enter Your Sanskrit Marks");
        double Sanskrit = sc.nextDouble();
        double marks = (English + Hindi + Science + Social + Sanskrit + Math) * 100/600;

        if(marks<=100 && marks>=91) {
            System.out.println(  "The grade of a student is AA.");
        } else if(marks<=90 && marks>=81) {

            System.out.println("The grade of a student is AB.");
        } else if(marks<=80 && marks>=71) {

            System.out.println("The grade of a student is BB.");
        } else if(marks<=70 && marks>=61) {

            System.out.println("The grade of student is BC.");
        } else if(marks<=60 && marks>=51) {

            System.out.println("The grade of a student is CD.");
        } else if(marks<=50 && marks>=41)
        {

            System.out.println("The grade of a student is DD.");
        } else if(marks<=40) {

            System.out.println(" You Are Fail at " + marks );
        } else {

            System.out.println(" Bye Bye ");

        }
        System.out.println("Your percentage is " + marks + "%");

    }

//    int main()
//
//    {
//
//        int marks;
//
//        System.out.println(" Enter the marks(0-100) of a student:");
//
//        cin>>marks;
//
//        cout<<grades(marks);
//
//
//
//        return 0;
//
//
//
//    }
//    }
}
