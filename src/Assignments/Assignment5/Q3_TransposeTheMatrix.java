package java_advance.feb23.Assignment5;
import java.util.Scanner;
public class Q3_TransposeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0;j<m;j++) {
                matrix[i][j] = sc.nextInt(); }  }
        int [][] Matrix = new int[m][n];
        for (int i=0; i<m;i++) {
            for (int j=0; j<n;j++) {
                Matrix[i][j] = matrix[j][i];
                System.out.print(Matrix[i][j] + " "); }
            System.out.println();
        }
    } }
