package TransferStatement.Break_Statement;

public class Ques17 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { //outer-Loop//
for (int j=0; j<10; j++) { //nested-Loop//
    if (j==5)
        break;
    System.out.println(i + " " + j);
} //end of the nested-Loop
        } // end of outer-Loop//
    }
}