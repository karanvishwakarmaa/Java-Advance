package CompleteJavaPackage.Complete_Java_Chapter.Chapter03_OperationIfElse_And_NumberSystem.Lecture02_IfElse;

public class ExampleIfElse {
    public static void main(String[] args) {
        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else if (isAnAdult) {
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello Children");
        }
    }
}
