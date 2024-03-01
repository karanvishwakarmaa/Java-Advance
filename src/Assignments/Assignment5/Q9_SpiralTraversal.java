package java_advance.feb23.Assignment5;
import java.util.Scanner;
public class Q9_SpiralTraversal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int T= s.nextInt();
        for (int i=0;i<T;i++) {
            int N = s.nextInt();
            int M = s.nextInt();
            int [][] matrix = new int[N][M];
            for (int j=0; j<N;j++) {
                for (int k=0;k<M;k++) {
                     matrix[j][k] = s.nextInt(); }
            } for (int j=0;j<N;j++) {
                System.out.print(matrix[j][0] + " ");
            } for (int j=(M-1)/2;j<M;j++) {
                System.out.print(matrix[N-1][j]+ " ");
            }  for (int j=(M-1)-1; j>0; j--) {
                System.out.print(matrix[j][M-1]+ " ");
            }  for (int j=(M-1)-1; j>0;j--) {
                System.out.print(matrix[0][j]+" ");
            } for (int j=(N-1)/2;j<=(N-1)-1;j++) {
                for (int k=(M-1)/2;k<=M/2;k++) {
                    System.out.print(matrix[j][k] + " ");
                }
            }
        }
    }
}
