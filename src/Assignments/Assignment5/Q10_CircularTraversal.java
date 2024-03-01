package java_advance.feb23.Assignment5;
import java.util.Scanner;
public class Q10_CircularTraversal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int T= s.nextInt();
        for (int i=0;i<T;i++) {
            int N = s.nextInt();
            int [][] matrix = new int[N][N];
            for (int j=0; j<N;j++) {
                for (int k=0;k<N;k++) {
                    matrix[j][k] = s.nextInt();
                }
            } for (int j=N-1;j>=0;j--) {
                System.out.print(matrix[j][0] + " ");
            } for (int j=(N-1)/2;j<N;j++) {
                System.out.print(matrix[0][j]+ " ");
            }  for (int j=(N-1)/2; j<N; j++) {
                System.out.print(matrix[j][N-1]+ " ");
            }  for (int j=(N-1)/2; j<N-1;j++) {
                System.out.print(matrix[N-1][j]);
            }
            }
        }
    }

