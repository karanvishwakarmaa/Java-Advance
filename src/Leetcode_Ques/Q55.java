import java.util.Scanner;
public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = 0;
        char ch;
        do {
            System.out.println("Welcome! to the Royalkarann Restaurant");
            System.out.println("Please CHoice a Mainu Option!");
            System.out.println("1 -> To Indian\n2 -> To Chinese\n3 -> To Italian\n4 -> To Pakistani\n");
            int ans = sc.nextInt();
            switch (ans) {
                case 1 -> {
                    System.out.println("THere are some special items in Indian food");
                    System.out.println("1 -> Poha Jalebi\n2 -> Butter paneer\n3 -> CHole kulche\n4 -> Chicken in indian stylish");
                    ans = sc.nextInt();
                    switch (ans) {
                        case 1 -> {
                            System.out.println("Thanks for Odering Poha Jalebii!");
                            amt = amt + 20;
//                            System.out.println("Your poha jalebi price is =" + amt);
                        }
                        case 2 -> {
                            System.out.println("Thanks for Ordering Butter paneer!");
                            amt = amt + 180;
                        }
                        case 3 -> {
                            System.out.println("Thanks For Ordering Chole kulche");
                            amt = amt + 220;
                        }
                        case 4 -> {
                            System.out.println("Thanks For Ordering In Indian Chicken Stylish");
                            amt = amt +340;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("THere are some special items in Chinese food");
                    System.out.println("1 -> Fried Frog\n2 -> Butter Dog\n3 -> cracks\n4 -> Chicken in CHiense stylish");
                    ans = sc.nextInt();
                    switch (ans) {
                        case 1 -> {
                            System.out.println("Thanks for Odering Mix Fried Frog!");
                            amt = amt + 220;
                        }
                        case 2 -> {
                            System.out.println("Thanks for Ordering Butter Dog!");
                            amt = amt + 550;
                        }
                        case 3 -> {
                            System.out.println("Thanks For Ordering Cracks");
                            amt = amt + 330;
                        }
                        case 4 -> {
                            System.out.println("Thanks For Ordering In CHinese Chicken Stylish");
                            amt = amt + 540;
                        }

                    }
                }
                case 3 -> {
                    System.out.println("THere are some special items in Indian food");
                    System.out.println("1 -> Poha Jalebi\n2 -> Butter paneer\n3 -> CHole kulche\n4 -> Chicken in indian stylish");
                    ans = sc.nextInt();
                    switch (ans) {
                        case 1 -> {
                            System.out.println("Thanks for Odering Poha Jalebii!");
                            amt = amt + 20;
//                            Syste\m.out.println("Your poha jalebi price is =" + amt);
                        }
                        case 3 -> {
                            System.out.println("Thanks For Ordering Chole kulche");
                            amt = amt + 220;
                            //{karann k  kk98";
//                            {
//                                System.out.println();
                                                    }
                        case 4 -> {
                            System.out.println("Thanks For Ordering In Indian Chicken Stylish");
                            amt = amt + 340;
                        }
                    }
                    }
                case 4 -> {
                    System.out.println("THere are some special items in Indian food");
                    System.out.println("1 -> Poha Jalebi\n2 -> Butter paneer\n3 -> CHole kulche\n4 -> Chicken in indian stylish");
                    ans = sc.nextInt();
                    switch (ans) {
                        case 1 -> {
                            System.out.println("Thanks for Odering Poha Jalebii!");
                            amt = amt + 20;
//                            System.out.println("Your poha jalebi price is =" + amt);
                        }
                        case 2 -> {
                            System.out.println("Thanks for Ordering Butter paneer!");
                            amt = amt + 180;
                        }
                        case 3 -> {
                            System.out.println("Thanks For Ordering Chole kulche");
                            amt = amt + 220;
                        }
                        case 4 -> {
                            System.out.println("Thanks For Ordering In Indian Chicken Stylish");
                            amt = amt + 340;
                        }
                    }
                }
                        default -> System.out.println("Wrong input");
                    }
                    System.out.println("Press y to repeat");
            ch=sc.next().charAt(0);
        } while (ch=='y');
        System.out.println("total bill "+ amt);
    }
}
