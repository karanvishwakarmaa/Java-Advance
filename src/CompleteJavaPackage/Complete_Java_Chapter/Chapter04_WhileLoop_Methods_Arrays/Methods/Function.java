package CompleteJavaPackage.Complete_Java_Chapter.Chapter04_WhileLoop_Methods_Arrays.Methods;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        greating();
    }

    public static void greating() {
        Scanner sc = new Scanner(System.in);
        int rows = 0;
        System.out.println("Enter the value of Star Width , that how much width of Star??");
        int j = sc.nextInt();
        while (rows < j) {
            System.out.print("*");
            int i =0;
            while (i< rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println( );
            rows++;
        }
    }

}
