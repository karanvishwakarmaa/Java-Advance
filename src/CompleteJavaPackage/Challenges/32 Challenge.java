package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Lcm Converter");
        System.out.println("Please Enter Your First Number: ");
        int first = sc.nextInt();
        System.out.println("Please Enter Your Second Number: ");
        int second = sc.nextInt();
        int lcm = Lcm(first, second);
        System.out.println("LCM of the two number is: " +lcm);
    }
public static int  Lcm(int first, int second) {
 int i =1;
 while (i <= second) {
  int factor = first*i;
  if (factor % second == 0) {
      return factor;
  }
     i++;
 }
        return 0;
}
}
