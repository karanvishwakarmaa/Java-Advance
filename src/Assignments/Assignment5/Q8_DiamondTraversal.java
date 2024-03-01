package java_advance.feb23.Assignment5;
import java.util.Scanner;
public class Q8_DiamondTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=0; i<T;i++) {
            int N = sc.nextInt();
            int matrix[] [] = new int[N][N];
            for (int j=0; j<N;j++) {
                for (int k=0; k<N;k++) {
                    matrix[j][k] = sc.nextInt(); }
            } int k=N-1;
            for (int j=(N-1)/2;j>=0;j--) {
                System.out.print(matrix[j][k] + " ");
                k--;
            } for (int l=1;l<=1; l++) {
                for (int j=((N-1)/2)-1; j>=0;j--) {
                        System.out.print(matrix[l][j] + " "); } }
            int v=1 ;
        for (int p=((N-1)/2)+1;p<=N-1; p++) {
                System.out.print(matrix[p][v] + " ");
                v++;
            }
        }
    }
}
