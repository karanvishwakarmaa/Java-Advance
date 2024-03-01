package java_advance.feb23.Assignment5;
import java.util.Scanner;
public class Q1_SquareMatrix {
  public static void main(String[] args) {
      System.out.println("Enter the dimensions of the square matrix. ");
            Scanner s1 = new Scanner(System.in);
            int N = s1.nextInt();
      System.out.println("Enter the dimensions of the separated integers");
            int[][] matrix = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = s1.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] += 1;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
