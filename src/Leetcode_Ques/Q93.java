public class Q93 {
    public  static  int fact(int n){
        int fact =1;
        while(n!=0)
            fact=fact* n--;
        return fact;
    }
    public static void main(String[] args) {
        int n=145;
        int t=n;
        int sum =0;
        while (n!=0) {
            int rem = n % 10;
            sum = sum + fact(rem);
            n = n / 10;
        }
        System.out.println(t==sum);
    }
}
