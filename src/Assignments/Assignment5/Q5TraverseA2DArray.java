package java_advance.feb23.Assignment5;
import java.util.Scanner;
public class Q5TraverseA2DArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns of matrix");
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[][] matrix = new int[N][M];
        for (int i=0; i<N;i++) {
            for (int j=0;j<M;j++) {
                matrix[i][j] = sc.nextInt();
            }
        } for (int i=M-1;i>=0;i--) {
            for (int j=0;j<N; j++) {
                System.out.print(matrix[j][i]+ " ");
            }
        }
    }

}
