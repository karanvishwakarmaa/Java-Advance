package CompleteJavaPackage.Complete_Java_Chapter.Chapter04_WhileLoop_Methods_Arrays.WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 1;  //initialization
        while (num <= 10000000) {  //condition
            System.out.println(num);  //actual work
            num = num + 1; //updating the condition
        }
    }
}
