package java_advance.feb23.Assignment5;
import java.util.Scanner;
public class Q2_RectangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of rows
        int m = scanner.nextInt(); // Number of columns
        int[][] matrix = new int[N][m];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            } }
        for (int i = 0; i < N; i++) { // Add 1 to each element of the matrix
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");  }
            System.out.println();
        }
    }
}
